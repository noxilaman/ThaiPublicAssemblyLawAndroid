package com.kodmay.ThaiPublicAssemblyLaw.ui.main

interface FragmentInteractionListener {

    fun onTitleChange(title: String,addStack: Boolean)
    fun popupTitleBackStack()
    fun onShowSnackBar(message: String)
    fun showBackButton(showing: Boolean)
    fun onBack()
}