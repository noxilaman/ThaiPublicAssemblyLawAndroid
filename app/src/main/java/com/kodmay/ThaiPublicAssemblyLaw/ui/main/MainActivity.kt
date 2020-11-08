package com.kodmay.ThaiPublicAssemblyLaw.ui.main

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.kodmay.ThaiPublicAssemblyLaw.R
import com.kodmay.ThaiPublicAssemblyLaw.repository.LawRepository
import com.kodmay.ThaiPublicAssemblyLaw.repository.HttpVoidCallback
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.TextView
import com.avalue.phsc.data.preferences.LawPrefs
import com.kodmay.ThaiPublicAssemblyLaw.common.Contextor
import com.kodmay.ThaiPublicAssemblyLaw.ui.changepassword.ChangePasswordActivity
import com.kodmay.ThaiPublicAssemblyLaw.ui.login.LoginActivity
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.support.v4.onPageChangeListener
import androidx.core.content.ContextCompat
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds;
import com.kodmay.ThaiPublicAssemblyLaw.ui.purchase.PurchaseActivity


class MainActivity : AppCompatActivity(), FragmentInteractionListener, HttpVoidCallback {

    var pageListener: PagerFragmentListener? = null
    private val lawPref by lazy { LawPrefs(Contextor.getInstance().context) }
    private val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
    private var titleStack = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        onTitleChange("Thai Public Assembly Law", false)
        MobileAds.initialize(this) {}
        LawRepository.getInstance().loadInitial(application, this)

        view_pager.adapter = sectionsPagerAdapter

        view_pager.onPageChangeListener {
            onPageSelected { position ->
                onTitleChange("Thai Public Assembly Law", false)
                if (position == 2) {
                    if (lawPref.premium) {
                        if (lawPref.userId == 0) {
                            startActivity<LoginActivity>()
                        } else {
                            sectionsPagerAdapter.bookmarkFragment.loadData()
                        }
                    } else {
                        startActivity<PurchaseActivity>()
                    }
                }
            }
        }

        val tabs: TabLayout = this.findViewById(R.id.tabs)

        tabs.setupWithViewPager(view_pager)

        for (i in 0 until tabs.tabCount) {
            val tabTextView = layoutInflater.inflate(R.layout.text_tab, null) as TextView
            when(i){
                0 -> tabTextView.setCompoundDrawablesWithIntrinsicBounds(0,R.drawable.tab1,0,0)
                1 -> tabTextView.setCompoundDrawablesWithIntrinsicBounds(0,R.drawable.tab2,0,0)
                2 -> tabTextView.setCompoundDrawablesWithIntrinsicBounds(0,R.drawable.tab3,0,0)
                3 -> tabTextView.setCompoundDrawablesWithIntrinsicBounds(0,R.drawable.tab4,0,0)
            }

            tabs.getTabAt(i)?.customView = tabTextView
        }


        //setupTabIcons()

    }

    override fun onResume() {
        super.onResume()
        invalidateOptionsMenu()
        if(view_pager.currentItem == 2 && lawPref.userId == 0){
            view_pager.currentItem = 1
        }
        if (!lawPref.premium) {
            val adRequest = AdRequest.Builder().build()
            adView.loadAd(adRequest)
        }else{
            adView.visibility = View.GONE
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

    private fun setupTabIcons() {
        tabs.getTabAt(0)?.icon = ContextCompat.getDrawable(applicationContext, R.drawable.tab1)
        tabs.getTabAt(1)?.icon = ContextCompat.getDrawable(applicationContext, R.drawable.tab2)
        tabs.getTabAt(2)?.icon = ContextCompat.getDrawable(applicationContext, R.drawable.tab3)
        tabs.getTabAt(3)?.icon = ContextCompat.getDrawable(applicationContext, R.drawable.tab4)
    }


    override fun onSuccess() {
        if(view_pager.currentItem == 0){
            view_pager.adapter = sectionsPagerAdapter
        }
    }

    override fun onFailure(error: String) {
    }

    override fun onTitleChange(title: String, addToStack: Boolean) {
        supportActionBar?.title = title
        if (addToStack){
            titleStack.add(title)
        }
    }

    override fun popupTitleBackStack() {
        if (titleStack.size>0) {
            titleStack.removeAt(titleStack.size-1)
            supportActionBar?.title = titleStack.last()
        }
    }

    override fun onShowSnackBar(message: String) {
        Snackbar.make(view_pager, message, Snackbar.LENGTH_LONG)
            .setAction("ปิด", null).show()
    }

    override fun showBackButton(showing: Boolean) {
        supportActionBar?.setDisplayHomeAsUpEnabled(showing)
        supportActionBar?.setDisplayShowHomeEnabled(showing)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        when (lawPref.userId) {
            0 -> menuInflater.inflate(R.menu.main_menu, menu)
            else -> menuInflater.inflate(R.menu.main_menu_login, menu)
        }
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        item?.let {
            when (it.itemId) {
                R.id.menu_user -> {
                    if (lawPref.premium) {
                        if (lawPref.userId == 0) {
                            startActivity<LoginActivity>()
                        }
                    } else {
                        startActivity<PurchaseActivity>()
                    }
                }
                R.id.menu_bookmark -> view_pager.setCurrentItem(2, true)
                R.id.menu_change_password -> startActivity<ChangePasswordActivity>()
                R.id.menu_logout -> {
                    lawPref.userId = 0
                    invalidateOptionsMenu()
                }
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        if (pageListener != null) {
            pageListener?.onBackPressed()
        } else {
            super.onBackPressed()
        }
    }

    override fun onBack() {
        super.onBackPressed()
    }

    interface PagerFragmentListener {
        fun onBackPressed()
    }

}