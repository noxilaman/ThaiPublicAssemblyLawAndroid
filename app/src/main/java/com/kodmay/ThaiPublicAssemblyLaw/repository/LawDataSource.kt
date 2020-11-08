package com.kodmay.ThaiPublicAssemblyLaw.repository

import android.content.Context
import com.kodmay.ThaiPublicAssemblyLaw.repository.model.*

interface LawDataSource {

    fun register(email: String, password: String, appId: Int, callback: HttpCallback<UserResponse>)

    fun login(email: String, password: String, appId: Int, callback: HttpCallback<UserResponse>)

    fun changePassword(userId: Int, oldPassword: String, newPassword: String, callback: HttpCallback<ChangePasswordResponse>)

    fun forgotPassword(email: String, callback: HttpCallback<UserResponse>)

    fun loadAppData(packageName: String, callback: HttpCallback<AppDataResponse>)

    fun loadLawData(appID: Int, callback: HttpCallback<LawDataResponse>)

    fun loadLawByCat(appID: Int, callback: HttpCallback<LawByCatResponse>)

    fun loadCatLawItem(catId: Int, appID: Int, callback: HttpCallback<LawByCatResponse>)

    fun loadLawDataByCat(catId: Int, appID: Int, callback: HttpCallback<LawByCatResponse>)

    fun loadLawDetail(lawID: Int, appID: Int, callback: HttpCallback<LawDataResponse>)

    fun loadDekaByLawId(lawId: Int,callback: HttpCallback<DekaLawResponse>)

    fun loadAppStoreList(callback: HttpCallback<AppListResponse>)

    fun addBookmark(lawId: Int, callback: HttpCallback<AddBookmarkResponse>)

    fun addBookmarkNote(lawId: Int, note: String, callback: HttpCallback<AddBookmarkResponse>)

    fun loadBookmark(callback: HttpCallback<BookmarkResponse>)

    fun loadBookmarkNote(lawId: Int,callback: HttpCallback<BookmarkNoteResponse>)

    fun deleteBookmark(lawId: Int,callback: HttpCallback<AddBookmarkResponse>)

    fun loadInitial(context: Context, callback: HttpVoidCallback)

    fun loadCacheLawDetail(lawId: Int, callback: HttpCallback<LawData>)

    fun loadCacheLaw(callback: HttpCallback<List<LawData>>)

}