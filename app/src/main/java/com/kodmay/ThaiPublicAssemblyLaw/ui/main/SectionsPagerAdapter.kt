package com.kodmay.ThaiPublicAssemblyLaw.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.kodmay.ThaiPublicAssemblyLaw.R
import com.kodmay.ThaiPublicAssemblyLaw.ui.appstore.AppStoreFragment
import com.kodmay.ThaiPublicAssemblyLaw.ui.bookmark.BookmarkFragment
import com.kodmay.ThaiPublicAssemblyLaw.ui.home.HomeFragment
import com.kodmay.ThaiPublicAssemblyLaw.ui.procedurelaw.LawListFragment

private val TAB_TITLES = arrayOf(
    R.string.tab_home,
    R.string.tab_2,
    R.string.tab_3,
    R.string.tab_4
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {

    val lawListFragment = LawListFragment.newInstance()
    val bookmarkFragment = BookmarkFragment.newInstance()

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> HomeFragment.newInstance()
            1 -> lawListFragment
            2 -> bookmarkFragment
            3 -> AppStoreFragment.newInstance()
            else -> PlaceholderFragment.newInstance(0)
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        return TAB_TITLES.size
    }

}