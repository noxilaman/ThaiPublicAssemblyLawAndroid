package com.kodmay.ThaiPublicAssemblyLaw.ui.bookmark;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\fH\u0016J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0003H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0019"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/ui/bookmark/BookmarkNoteActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/HttpCallback;", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/AddBookmarkResponse;", "()V", "lawId", "", "getLawId", "()I", "setLawId", "(I)V", "note", "", "getNote", "()Ljava/lang/String;", "setNote", "(Ljava/lang/String;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onFailure", "error", "onSuccess", "data", "app_debug"})
public final class BookmarkNoteActivity extends androidx.appcompat.app.AppCompatActivity implements com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.AddBookmarkResponse> {
    private int lawId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String note;
    private java.util.HashMap _$_findViewCache;
    
    public final int getLawId() {
        return 0;
    }
    
    public final void setLawId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNote() {
        return null;
    }
    
    public final void setNote(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onSuccess(@org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.model.AddBookmarkResponse data) {
    }
    
    @java.lang.Override()
    public void onFailure(@org.jetbrains.annotations.NotNull()
    java.lang.String error) {
    }
    
    public BookmarkNoteActivity() {
        super();
    }
}