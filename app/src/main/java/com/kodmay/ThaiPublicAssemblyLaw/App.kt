package com.kodmay.ThaiPublicAssemblyLaw

import android.app.Application
import android.util.Log
import com.android.billingclient.api.*
import com.kodmay.ThaiPublicAssemblyLaw.common.Contextor

class App: Application() {

    lateinit private var billingClient: BillingClient
    public var skulList = mutableListOf<SkuDetails>()

    override fun onCreate() {
        super.onCreate()
        Contextor.getInstance().init(applicationContext)
//        connectBilling()
    }

    private fun connectBilling(){
        billingClient = BillingClient.newBuilder(this).enablePendingPurchases().setListener { billingResult, purchases ->
            //todo
        }.build()
        billingClient.startConnection(object : BillingClientStateListener {
            override fun onBillingSetupFinished(billingResult: BillingResult) {
                if (billingResult.responseCode == BillingClient.BillingResponseCode.OK) {
                    // The BillingClient is ready. You can query purchases here.
                    querySkull()

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
        billingClient.querySkuDetailsAsync(params.build()) { billingResult, skuDetailsList ->
            // Process the result.
            Log.d("billing", "billingResult responseCode = " + billingResult.responseCode)
            Log.d("billing", "skuDetailsList size = " + skuDetailsList.size)
            skulList = skuDetailsList
            skuDetailsList.forEach { data ->
                Log.d("ss",data.originalJson)
            }
        }
    }
}