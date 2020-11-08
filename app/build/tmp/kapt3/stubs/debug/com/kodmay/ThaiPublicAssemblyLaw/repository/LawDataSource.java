package com.kodmay.ThaiPublicAssemblyLaw.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J&\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J.\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H&J\u001e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u001e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H&J\u001e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00170\u0007H&J\u0016\u0010\u0018\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00190\u0007H&J\u0016\u0010\u001a\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0007H&J\u001e\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007H&J\u001c\u0010\u001e\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u0007H&J\u001e\u0010!\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020 0\u0007H&J&\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020%0\u0007H&J\u001e\u0010&\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\'0\u0007H&J\u0018\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020*2\u0006\u0010\u0006\u001a\u00020+H&J\u001e\u0010,\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020%0\u0007H&J\u001e\u0010-\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020.0\u0007H&J&\u0010/\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020%0\u0007H&J&\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020.0\u0007H&J.\u00102\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H&J.\u00105\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H&\u00a8\u00066"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/repository/LawDataSource;", "", "addBookmark", "", "lawId", "", "callback", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/HttpCallback;", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/AddBookmarkResponse;", "addBookmarkNote", "note", "", "changePassword", "userId", "oldPassword", "newPassword", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/ChangePasswordResponse;", "deleteBookmark", "forgotPassword", "email", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/UserResponse;", "loadAppData", "packageName", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/AppDataResponse;", "loadAppStoreList", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/AppListResponse;", "loadBookmark", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/BookmarkResponse;", "loadBookmarkNote", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/BookmarkNoteResponse;", "loadCacheLaw", "", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/LawData;", "loadCacheLawDetail", "loadCatLawItem", "catId", "appID", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/LawByCatResponse;", "loadDekaByLawId", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/DekaLawResponse;", "loadInitial", "context", "Landroid/content/Context;", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/HttpVoidCallback;", "loadLawByCat", "loadLawData", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/LawDataResponse;", "loadLawDataByCat", "loadLawDetail", "lawID", "login", "password", "appId", "register", "app_debug"})
public abstract interface LawDataSource {
    
    public abstract void register(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, int appId, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.UserResponse> callback);
    
    public abstract void login(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, int appId, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.UserResponse> callback);
    
    public abstract void changePassword(int userId, @org.jetbrains.annotations.NotNull()
    java.lang.String oldPassword, @org.jetbrains.annotations.NotNull()
    java.lang.String newPassword, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.ChangePasswordResponse> callback);
    
    public abstract void forgotPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.UserResponse> callback);
    
    public abstract void loadAppData(@org.jetbrains.annotations.NotNull()
    java.lang.String packageName, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.AppDataResponse> callback);
    
    public abstract void loadLawData(int appID, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawDataResponse> callback);
    
    public abstract void loadLawByCat(int appID, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawByCatResponse> callback);
    
    public abstract void loadCatLawItem(int catId, int appID, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawByCatResponse> callback);
    
    public abstract void loadLawDataByCat(int catId, int appID, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawByCatResponse> callback);
    
    public abstract void loadLawDetail(int lawID, int appID, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawDataResponse> callback);
    
    public abstract void loadDekaByLawId(int lawId, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.DekaLawResponse> callback);
    
    public abstract void loadAppStoreList(@org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.AppListResponse> callback);
    
    public abstract void addBookmark(int lawId, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.AddBookmarkResponse> callback);
    
    public abstract void addBookmarkNote(int lawId, @org.jetbrains.annotations.NotNull()
    java.lang.String note, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.AddBookmarkResponse> callback);
    
    public abstract void loadBookmark(@org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.BookmarkResponse> callback);
    
    public abstract void loadBookmarkNote(int lawId, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.BookmarkNoteResponse> callback);
    
    public abstract void deleteBookmark(int lawId, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.AddBookmarkResponse> callback);
    
    public abstract void loadInitial(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpVoidCallback callback);
    
    public abstract void loadCacheLawDetail(int lawId, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData> callback);
    
    public abstract void loadCacheLaw(@org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<java.util.List<com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData>> callback);
}