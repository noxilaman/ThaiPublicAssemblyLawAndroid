package com.kodmay.ThaiPublicAssemblyLaw.repository.model

import androidx.room.Entity
import androidx.room.PrimaryKey

data class AppDataResponse(
    val dataList: List<AppData>
)

@Entity(tableName = "app_data")
data class AppData(
    @PrimaryKey val id: Int,
    val app_desc: String,
    val app_img: String,
    val app_id: String,
    val name: String,
    val store_id: Int
)