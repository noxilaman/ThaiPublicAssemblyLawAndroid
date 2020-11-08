package com.kodmay.ThaiPublicAssemblyLaw.ui.lawdetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kodmay.ThaiPublicAssemblyLaw.R
import com.kodmay.ThaiPublicAssemblyLaw.ui.main.FragmentInteractionListener
import kotlinx.android.synthetic.main.activity_law_detail.*

class LawDetailActivity : AppCompatActivity(), FragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_law_detail)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        var bookmarkMode = if(intent.hasExtra("bookmark")) intent.getBooleanExtra("bookmark", false) else false
        supportFragmentManager.beginTransaction()
            .replace(R.id.container,LawDetailFragment.newInstance(intent.getIntExtra("id",0),bookmarkMode))
            .commit()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
    override fun popupTitleBackStack() {

    }

    override fun onTitleChange(title: String, isBackStack: Boolean) {
        supportActionBar?.title = title
    }

    override fun onShowSnackBar(message: String) {

    }

    override fun showBackButton(showing: Boolean) {

    }

    override fun onBack() {

    }


}
