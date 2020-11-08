package com.kodmay.ThaiPublicAssemblyLaw.api

import com.kodmay.ThaiPublicAssemblyLaw.repository.model.*
import io.reactivex.Flowable
import retrofit2.Response
import retrofit2.http.*

interface ApiEndpoint {

    @FormUrlEncoded
    @POST("register")
    fun registerUser(@Field("email") email: String,
                     @Field("password") password: String,
                     @Field("appId") appId: Int):Flowable<Response<UserResponse>>

    @FormUrlEncoded
    @POST("login")
    fun login(@Field("email") email: String,
              @Field("password") password: String,
              @Field("appId") appId: Int):Flowable<Response<UserResponse>>

    @FormUrlEncoded
    @POST("changepassword")
    fun changePassword(@Field("userId") userId: Int,
                       @Field("oldpassword") oldPassword: String,
                       @Field("newpassword") newPassword: String):Flowable<Response<ChangePasswordResponse>>

    @FormUrlEncoded
    @POST("requestnewpassword")
    fun forgotPassword(@Field("email") email: String):Flowable<Response<UserResponse>>

    @GET("getappdata")
    fun loadAppData(@Query("android_id") packageName: String):Flowable<Response<AppDataResponse>>

    @GET("getlawdata")
    fun loadLawData(@Query("app_id") appId: Int):Flowable<Response<LawDataResponse>>

    @GET("getlawbycat")
    fun loadLawByCate(@Query("app_id") appId: Int):Flowable<Response<LawByCatResponse>>

    @GET("getdetaillawbycat/{catId}")
    fun loadCateLawItem(@Path("catId") catId: Int, @Query("app_id") appId: Int):Flowable<Response<LawByCatResponse>>

    @GET("getlawdatabycat/{catId}")
    fun loadLawDataByCat(@Path("catId") catId: Int, @Query("app_id") appId: Int):Flowable<Response<LawByCatResponse>>

    @GET("getlawdetail/{id}")
    fun loadLawDetail(@Path("id") catId: Int, @Query("app_id") appId: Int):Flowable<Response<LawDataResponse>>

    @GET("getdekalaw/{lawId}")
    fun loadDekaListByLawId(@Path("lawId") lawId: Int):Flowable<Response<DekaLawResponse>>

    @GET("listapp")
    fun loadAppStoreList():Flowable<Response<AppListResponse>>

    @GET("getbookmark/{userId}")
    fun loadBookmark(@Path("userId") userId: Int, @Query("app_id") app_id: Int):Flowable<Response<BookmarkResponse>>

    @GET("getbookmarknote/{userId}")
    fun loadBookmarkNote(@Path("userId") userId: Int, @Query("lawId") lawId: Int):Flowable<Response<BookmarkNoteResponse>>

    @FormUrlEncoded
    @POST("addbookmark")
    fun addBookmark(@Field("lawId") lawId: Int, @Field("userId") userId: Int):Flowable<Response<AddBookmarkResponse>>

    @GET("deletebookmark/{userId}")
    fun deleteBookmark(@Path("userId") userId: Int, @Query("lawId") lawId: Int):Flowable<Response<AddBookmarkResponse>>

    @FormUrlEncoded
    @POST("addbookmarknote")
    fun addBookmarkNote(@Field("lawId") lawId: Int, @Field("userId") userId: Int, @Field("note") note: String):Flowable<Response<AddBookmarkResponse>>
}