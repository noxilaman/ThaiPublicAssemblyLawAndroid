package com.kodmay.ThaiPublicAssemblyLaw.ui.purchase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.android.billingclient.api.*
import com.avalue.phsc.data.preferences.LawPrefs
import com.kodmay.ThaiPublicAssemblyLaw.App
import com.kodmay.ThaiPublicAssemblyLaw.R
import com.kodmay.ThaiPublicAssemblyLaw.common.Contextor
import kotlinx.android.synthetic.main.activity_purchase.*

class PurchaseActivity : AppCompatActivity() {

    private val lawPref by lazy { LawPrefs(Contextor.getInstance().context) }
    private var billingClient: BillingClient? = null
    var skul: SkuDetails? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_purchase)

        tv_cancel.setOnClickListener {
            finish()
        }

        connectBilling()
    }

    private fun bindData() {

    }

    override fun onResume() {
        super.onResume()
        billingClient?.let {
            checkPurchaseList()
        }

    }

    private fun connectBilling(){
        billingClient = BillingClient.newBuilder(this).enablePendingPurchases().setListener { billingResult, purchases ->
            //todo
        }.build()
        billingClient?.startConnection(object : BillingClientStateListener {
            override fun onBillingSetupFinished(billingResult: BillingResult) {
                if (billingResult.responseCode == BillingClient.BillingResponseCode.OK) {
                    // The BillingClient is ready. You can query purchases here.
                    querySkull()
                    checkPurchaseList()

                }
            }
            override fun onBillingServiceDisconnected() {
                // Try to restart the connection on the next request to
                // Google Play by calling the startConnection() method.
            }
        })
    }

    private fun querySkull(){
        val skuList = ArrayList<String>()
        skuList.add("thai_public_assembly_lay_pay")
        val params = SkuDetailsParams.newBuilder()
        params.setSkusList(skuList).setType(BillingClient.SkuType.INAPP)
        billingClient?.querySkuDetailsAsync(params.build()) { billingResult, skuDetailsList ->
            // Process the result.
            Log.d("billing", "billingResult responseCode = " + billingResult.responseCode)
            Log.d("billing", "skuDetailsList size = " + skuDetailsList.size)
            skuDetailsList.forEach { data ->
                skul = data
                tv_price.text = data.price
                Log.d("ss",data.originalJson)
                tv_buy.setOnClickListener { buyItem() }
            }
        }
    }

    private fun checkPurchaseList(){
        billingClient?.let {billingClient ->
            val purchasesResult: Purchase.PurchasesResult =
                billingClient.queryPurchases(BillingClient.SkuType.INAPP)
            purchasesResult.purchasesList?.let { purchase -> purchase.forEach {
                if (it.sku == "thai_public_assembly_lay_pay"){
                    lawPref.premium = true
                    finish()
                }
                Log.d("purchase",it.sku)
                Log.d("purchase",it.packageName)
            } }?: Log.d("purchase","purchasesList = null")}

    }

    private fun buyItem(){
        val flowParams = BillingFlowParams.newBuilder()
            .setSkuDetails(skul)
            .build()
        val responseCode = billingClient?.launchBillingFlow(this, flowParams)
    }

}
