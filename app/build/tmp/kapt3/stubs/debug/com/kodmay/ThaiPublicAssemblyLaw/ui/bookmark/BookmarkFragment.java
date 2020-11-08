package com.kodmay.ThaiPublicAssemblyLaw.ui.bookmark;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \"2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0003H\u0016J\u001a\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006#"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/ui/bookmark/BookmarkFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/HttpCallback;", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/BookmarkResponse;", "Lcom/kodmay/ThaiPublicAssemblyLaw/ui/bookmark/BookmarkAdapter$OnListFragmentInteractionListener;", "()V", "lawPref", "Lcom/avalue/phsc/data/preferences/LawPrefs;", "getLawPref", "()Lcom/avalue/phsc/data/preferences/LawPrefs;", "lawPref$delegate", "Lkotlin/Lazy;", "loadData", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDelete", "item", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/LawData;", "onFailure", "error", "", "onListFragmentInteraction", "onSuccess", "data", "onViewCreated", "view", "Companion", "app_debug"})
public final class BookmarkFragment extends androidx.fragment.app.Fragment implements com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<com.kodmay.ThaiPublicAssemblyLaw.repository.model.BookmarkResponse>, com.kodmay.ThaiPublicAssemblyLaw.ui.bookmark.BookmarkAdapter.OnListFragmentInteractionListener {
    private final kotlin.Lazy lawPref$delegate = null;
    public static final com.kodmay.ThaiPublicAssemblyLaw.ui.bookmark.BookmarkFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.avalue.phsc.data.preferences.LawPrefs getLawPref() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onSuccess(@org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.model.BookmarkResponse data) {
    }
    
    @java.lang.Override()
    public void onFailure(@org.jetbrains.annotations.NotNull()
    java.lang.String error) {
    }
    
    @java.lang.Override()
    public void onListFragmentInteraction(@org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData item) {
    }
    
    @java.lang.Override()
    public void onDelete(@org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData item) {
    }
    
    public final void loadData() {
    }
    
    public BookmarkFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.kodmay.ThaiPublicAssemblyLaw.ui.bookmark.BookmarkFragment newInstance() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/ui/bookmark/BookmarkFragment$Companion;", "", "()V", "newInstance", "Lcom/kodmay/ThaiPublicAssemblyLaw/ui/bookmark/BookmarkFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.kodmay.ThaiPublicAssemblyLaw.ui.bookmark.BookmarkFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}