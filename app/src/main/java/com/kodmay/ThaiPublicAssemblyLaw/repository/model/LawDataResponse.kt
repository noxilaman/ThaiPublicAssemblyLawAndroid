package com.kodmay.ThaiPublicAssemblyLaw.repository.model

import androidx.room.Entity
import androidx.room.PrimaryKey

data class LawDataResponse(
    val dataList: List<LawData>
)

@Entity(tableName = "law_data")
data class LawData(
    @PrimaryKey val i_id: Int,
    val c_comment: String?,
    val app_id: Int,
    val c_desc: String?,
    val c_name: String,
    val c_url: String?,
    val i_lawcat: Int,
    val i_lawno: Int,
    val i_no: Int,
    val i_subno: Int,
    val note: String?
)