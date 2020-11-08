package com.kodmay.ThaiPublicAssemblyLaw.repository.model

import android.os.Parcel
import android.os.Parcelable

data class DekaLawResponse(
    val dataList: List<DekaData>
)

data class DekaData(
    val id: Int,
    val i_no: Int,
    val c_comments: String,
    val c_desc: String,
    val c_name: String,
    val created: String,
    val deka_id: Int,
    val i_subno: Int,
    val lawdata_id: Int
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeInt(i_no)
        parcel.writeString(c_comments)
        parcel.writeString(c_desc)
        parcel.writeString(c_name)
        parcel.writeString(created)
        parcel.writeInt(deka_id)
        parcel.writeInt(i_subno)
        parcel.writeInt(lawdata_id)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DekaData> {
        override fun createFromParcel(parcel: Parcel): DekaData {
            return DekaData(parcel)
        }

        override fun newArray(size: Int): Array<DekaData?> {
            return arrayOfNulls(size)
        }
    }
}