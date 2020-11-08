package com.kodmay.ThaiPublicAssemblyLaw.ui.procedurelaw.catlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 @2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001@B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020#2\u0006\u0010\'\u001a\u00020\u001eH\u0016J\b\u0010(\u001a\u00020#H\u0016J\u0012\u0010)\u001a\u00020#2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J&\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u00102\u001a\u00020#H\u0016J\b\u00103\u001a\u00020#H\u0016J\u0010\u00104\u001a\u00020#2\u0006\u00105\u001a\u00020\tH\u0016J\u001a\u00106\u001a\u00020#2\u0006\u00107\u001a\u00020-2\b\u0010*\u001a\u0004\u0018\u00010+H\u0017J\u0010\u00108\u001a\u00020#2\u0006\u00109\u001a\u00020:H\u0002J \u0010;\u001a\u00020#2\u0016\u0010<\u001a\u0012\u0012\u0004\u0012\u00020\t0=j\b\u0012\u0004\u0012\u00020\t`>H\u0002J\u0006\u0010?\u001a\u00020\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R&\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001d\u001a\u00020\u001e8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\u001f\u0010 \u00a8\u0006A"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/ui/procedurelaw/catlist/CatListFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/kodmay/ThaiPublicAssemblyLaw/ui/procedurelaw/catlist/CatListAdapter$CatListener;", "Lcom/kodmay/ThaiPublicAssemblyLaw/ui/main/MainActivity$PagerFragmentListener;", "()V", "catAdapter", "Lcom/kodmay/ThaiPublicAssemblyLaw/ui/procedurelaw/catlist/CatListAdapter;", "catDataList", "", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/CatData;", "catStack", "", "getCatStack", "()Ljava/util/List;", "setCatStack", "(Ljava/util/List;)V", "isLawList", "", "()Z", "setLawList", "(Z)V", "lawPref", "Lcom/avalue/phsc/data/preferences/LawPrefs;", "getLawPref", "()Lcom/avalue/phsc/data/preferences/LawPrefs;", "lawPref$delegate", "Lkotlin/Lazy;", "listener", "Lcom/kodmay/ThaiPublicAssemblyLaw/ui/main/FragmentInteractionListener;", "mContext", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "mContext$delegate", "filterSearch", "", "text", "", "onAttach", "context", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDetach", "onResume", "onSelectCat", "catData", "onViewCreated", "view", "openDetail", "id", "", "openSubCat", "dataList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "popupBackStack", "Companion", "app_debug"})
public final class CatListFragment extends androidx.fragment.app.Fragment implements com.kodmay.ThaiPublicAssemblyLaw.ui.procedurelaw.catlist.CatListAdapter.CatListener, com.kodmay.ThaiPublicAssemblyLaw.ui.main.MainActivity.PagerFragmentListener {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mContext$delegate = null;
    private boolean isLawList;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.util.List<com.kodmay.ThaiPublicAssemblyLaw.repository.model.CatData>> catStack;
    private com.kodmay.ThaiPublicAssemblyLaw.ui.main.FragmentInteractionListener listener;
    private java.util.List<com.kodmay.ThaiPublicAssemblyLaw.repository.model.CatData> catDataList;
    private com.kodmay.ThaiPublicAssemblyLaw.ui.procedurelaw.catlist.CatListAdapter catAdapter;
    private final kotlin.Lazy lawPref$delegate = null;
    public static final com.kodmay.ThaiPublicAssemblyLaw.ui.procedurelaw.catlist.CatListFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final boolean isLawList() {
        return false;
    }
    
    public final void setLawList(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.util.List<com.kodmay.ThaiPublicAssemblyLaw.repository.model.CatData>> getCatStack() {
        return null;
    }
    
    public final void setCatStack(@org.jetbrains.annotations.NotNull()
    java.util.List<java.util.List<com.kodmay.ThaiPublicAssemblyLaw.repository.model.CatData>> p0) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final com.avalue.phsc.data.preferences.LawPrefs getLawPref() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void filterSearch(java.lang.CharSequence text) {
    }
    
    @java.lang.Override()
    public void onSelectCat(@org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.repository.model.CatData catData) {
    }
    
    private final void openSubCat(java.util.ArrayList<com.kodmay.ThaiPublicAssemblyLaw.repository.model.CatData> dataList) {
    }
    
    private final void openDetail(int id) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    public final boolean popupBackStack() {
        return false;
    }
    
    public CatListFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.kodmay.ThaiPublicAssemblyLaw.ui.procedurelaw.catlist.CatListFragment newInstance(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.kodmay.ThaiPublicAssemblyLaw.repository.model.CatData> catDataList, boolean isLawList) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/ui/procedurelaw/catlist/CatListFragment$Companion;", "", "()V", "newInstance", "Lcom/kodmay/ThaiPublicAssemblyLaw/ui/procedurelaw/catlist/CatListFragment;", "catDataList", "Ljava/util/ArrayList;", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/CatData;", "Lkotlin/collections/ArrayList;", "isLawList", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.kodmay.ThaiPublicAssemblyLaw.ui.procedurelaw.catlist.CatListFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.kodmay.ThaiPublicAssemblyLaw.repository.model.CatData> catDataList, boolean isLawList) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}