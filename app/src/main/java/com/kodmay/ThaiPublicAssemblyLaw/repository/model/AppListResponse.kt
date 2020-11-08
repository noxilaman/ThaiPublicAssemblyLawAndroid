package com.kodmay.ThaiPublicAssemblyLaw.repository.model

data class AppListResponse(
    val dataList: List<AppStoreData>
)

data class AppStoreData(
    val id: Int,
    val name: String,
    val android_desc: String?,
    val android_id: String?,
    val android_store: String?,
    val app_desc: String,
    val app_img: String,
    val ios_id: String,
    val store_id: String
)