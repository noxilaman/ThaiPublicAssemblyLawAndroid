package com.kodmay.ThaiPublicAssemblyLaw.repository.model

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey

data class LawByCatResponse(
    val dataList: ArrayList<CatData>
)

@Entity(tableName = "law_cat")
data class CatData(
    @PrimaryKey val i_id: Int,
    val app_id: Int,
    val c_desc: String,
    val c_law_code: String,
    val c_name: String,
    val i_level: Int,
    val i_parent_id: Int,
    val i_seq: Int
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(i_id)
        parcel.writeInt(app_id)
        parcel.writeString(c_desc)
        parcel.writeString(c_law_code)
        parcel.writeString(c_name)
        parcel.writeInt(i_level)
        parcel.writeInt(i_parent_id)
        parcel.writeInt(i_seq)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<CatData> {
        override fun createFromParcel(parcel: Parcel): CatData {
            return CatData(parcel)
        }

        override fun newArray(size: Int): Array<CatData?> {
            return arrayOfNulls(size)
        }
    }
}