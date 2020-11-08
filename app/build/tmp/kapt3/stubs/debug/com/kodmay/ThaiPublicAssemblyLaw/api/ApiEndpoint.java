package com.kodmay.ThaiPublicAssemblyLaw.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H\'J2\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u000bH\'J2\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u000e\u001a\u00020\u000b2\b\b\u0001\u0010\u000f\u001a\u00020\u000bH\'J(\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u000bH\'J\u001e\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00040\u00032\b\b\u0001\u0010\u0016\u001a\u00020\u000bH\'J\u0014\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u0003H\'J(\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u001b\u001a\u00020\u0007H\'J(\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J(\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00040\u00032\b\b\u0001\u0010 \u001a\u00020\u00072\b\b\u0001\u0010!\u001a\u00020\u0007H\'J\u001e\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00040\u00032\b\b\u0001\u0010!\u001a\u00020\u0007H\'J\u001e\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00040\u00032\b\b\u0001\u0010!\u001a\u00020\u0007H\'J(\u0010\'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00040\u00032\b\b\u0001\u0010 \u001a\u00020\u00072\b\b\u0001\u0010!\u001a\u00020\u0007H\'J(\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00040\u00032\b\b\u0001\u0010 \u001a\u00020\u00072\b\b\u0001\u0010!\u001a\u00020\u0007H\'J2\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u000b2\b\b\u0001\u0010*\u001a\u00020\u000b2\b\b\u0001\u0010!\u001a\u00020\u0007H\'J2\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u000b2\b\b\u0001\u0010*\u001a\u00020\u000b2\b\b\u0001\u0010!\u001a\u00020\u0007H\'\u00a8\u0006,"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/api/ApiEndpoint;", "", "addBookmark", "Lio/reactivex/Flowable;", "Lretrofit2/Response;", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/AddBookmarkResponse;", "lawId", "", "userId", "addBookmarkNote", "note", "", "changePassword", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/ChangePasswordResponse;", "oldPassword", "newPassword", "deleteBookmark", "forgotPassword", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/UserResponse;", "email", "loadAppData", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/AppDataResponse;", "packageName", "loadAppStoreList", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/AppListResponse;", "loadBookmark", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/BookmarkResponse;", "app_id", "loadBookmarkNote", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/BookmarkNoteResponse;", "loadCateLawItem", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/LawByCatResponse;", "catId", "appId", "loadDekaListByLawId", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/DekaLawResponse;", "loadLawByCate", "loadLawData", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/LawDataResponse;", "loadLawDataByCat", "loadLawDetail", "login", "password", "registerUser", "app_debug"})
public abstract interface ApiEndpoint {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "register")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Flowable<retrofit2.Response<com.kodmay.ThaiPublicAssemblyLaw.repository.model.UserResponse>> registerUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "email")
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "password")
    java.lang.String password, @retrofit2.http.Field(value = "appId")
    int appId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "login")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Flowable<retrofit2.Response<com.kodmay.ThaiPublicAssemblyLaw.repository.model.UserResponse>> login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "email")
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "password")
    java.lang.String password, @retrofit2.http.Field(value = "appId")
    int appId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "changepassword")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Flowable<retrofit2.Response<com.kodmay.ThaiPublicAssemblyLaw.repository.model.ChangePasswordResponse>> changePassword(@retrofit2.http.Field(value = "userId")
    int userId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "oldpassword")
    java.lang.String oldPassword, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "newpassword")
    java.lang.String newPassword);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "requestnewpassword")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Flowable<retrofit2.Response<com.kodmay.ThaiPublicAssemblyLaw.repository.model.UserResponse>> forgotPassword(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "email")
    java.lang.String email);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "getappdata")
    public abstract io.reactivex.Flowable<retrofit2.Response<com.kodmay.ThaiPublicAssemblyLaw.repository.model.AppDataResponse>> loadAppData(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "android_id")
    java.lang.String packageName);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "getlawdata")
    public abstract io.reactivex.Flowable<retrofit2.Response<com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawDataResponse>> loadLawData(@retrofit2.http.Query(value = "app_id")
    int appId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "getlawbycat")
    public abstract io.reactivex.Flowable<retrofit2.Response<com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawByCatResponse>> loadLawByCate(@retrofit2.http.Query(value = "app_id")
    int appId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "getdetaillawbycat/{catId}")
    public abstract io.reactivex.Flowable<retrofit2.Response<com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawByCatResponse>> loadCateLawItem(@retrofit2.http.Path(value = "catId")
    int catId, @retrofit2.http.Query(value = "app_id")
    int appId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "getlawdatabycat/{catId}")
    public abstract io.reactivex.Flowable<retrofit2.Response<com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawByCatResponse>> loadLawDataByCat(@retrofit2.http.Path(value = "catId")
    int catId, @retrofit2.http.Query(value = "app_id")
    int appId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "getlawdetail/{id}")
    public abstract io.reactivex.Flowable<retrofit2.Response<com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawDataResponse>> loadLawDetail(@retrofit2.http.Path(value = "id")
    int catId, @retrofit2.http.Query(value = "app_id")
    int appId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "getdekalaw/{lawId}")
    public abstract io.reactivex.Flowable<retrofit2.Response<com.kodmay.ThaiPublicAssemblyLaw.repository.model.DekaLawResponse>> loadDekaListByLawId(@retrofit2.http.Path(value = "lawId")
    int lawId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "listapp")
    public abstract io.reactivex.Flowable<retrofit2.Response<com.kodmay.ThaiPublicAssemblyLaw.repository.model.AppListResponse>> loadAppStoreList();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "getbookmark/{userId}")
    public abstract io.reactivex.Flowable<retrofit2.Response<com.kodmay.ThaiPublicAssemblyLaw.repository.model.BookmarkResponse>> loadBookmark(@retrofit2.http.Path(value = "userId")
    int userId, @retrofit2.http.Query(value = "app_id")
    int app_id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "getbookmarknote/{userId}")
    public abstract io.reactivex.Flowable<retrofit2.Response<com.kodmay.ThaiPublicAssemblyLaw.repository.model.BookmarkNoteResponse>> loadBookmarkNote(@retrofit2.http.Path(value = "userId")
    int userId, @retrofit2.http.Query(value = "lawId")
    int lawId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "addbookmark")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Flowable<retrofit2.Response<com.kodmay.ThaiPublicAssemblyLaw.repository.model.AddBookmarkResponse>> addBookmark(@retrofit2.http.Field(value = "lawId")
    int lawId, @retrofit2.http.Field(value = "userId")
    int userId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "deletebookmark/{userId}")
    public abstract io.reactivex.Flowable<retrofit2.Response<com.kodmay.ThaiPublicAssemblyLaw.repository.model.AddBookmarkResponse>> deleteBookmark(@retrofit2.http.Path(value = "userId")
    int userId, @retrofit2.http.Query(value = "lawId")
    int lawId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "addbookmarknote")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Flowable<retrofit2.Response<com.kodmay.ThaiPublicAssemblyLaw.repository.model.AddBookmarkResponse>> addBookmarkNote(@retrofit2.http.Field(value = "lawId")
    int lawId, @retrofit2.http.Field(value = "userId")
    int userId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "note")
    java.lang.String note);
}