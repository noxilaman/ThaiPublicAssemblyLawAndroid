package com.kodmay.ThaiPublicAssemblyLaw.common

import android.content.Context


open class Prefs(context: Context) {
    val PREFS_FILENAME = "com.kodmay.thaicriminallaw.prefs"
    val prefs = context.getSharedPreferences(PREFS_FILENAME, 0)

}