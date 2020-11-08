package com.kodmay.ThaiPublicAssemblyLaw.ui.lawdetail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 ;2\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002:\u0001;B\u0005\u00a2\u0006\u0002\u0010\u0005J(\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u00020\u00192\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J&\u0010(\u001a\u0004\u0018\u00010\u001f2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u001b2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010,\u001a\u00020\u0019H\u0016J\u0010\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u0016H\u0016J\u0016\u0010/\u001a\u00020\u00192\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u001a\u00101\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u001f2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0016\u00103\u001a\u00020\u00192\f\u00100\u001a\b\u0012\u0004\u0012\u0002040\u0003H\u0002J\u0010\u00105\u001a\u00020\u00192\u0006\u00106\u001a\u00020\u0004H\u0002J\b\u00107\u001a\u00020\u0019H\u0002J\u0018\u00108\u001a\u00020\u00192\u0006\u00109\u001a\u00020:2\u0006\u00102\u001a\u00020\u001fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/ui/lawdetail/LawDetailFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/HttpCallback;", "", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/LawData;", "()V", "adapter", "Lcom/kodmay/ThaiPublicAssemblyLaw/ui/lawdetail/DekaListAdapter;", "bookmarkMode", "", "lawId", "", "lawList", "lawPref", "Lcom/avalue/phsc/data/preferences/LawPrefs;", "getLawPref", "()Lcom/avalue/phsc/data/preferences/LawPrefs;", "lawPref$delegate", "Lkotlin/Lazy;", "listener", "Lcom/kodmay/ThaiPublicAssemblyLaw/ui/main/FragmentInteractionListener;", "note", "", "pageIndex", "getDeepChildOffset", "", "mainParent", "Landroid/view/ViewGroup;", "parent", "Landroid/view/ViewParent;", "child", "Landroid/view/View;", "accumulatedOffset", "Landroid/graphics/Point;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "onDetach", "onFailure", "error", "onSuccess", "dataList", "onViewCreated", "view", "renderDeka", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/DekaData;", "renderNote", "noteData", "renderPage", "scrollToView", "scrollViewParent", "Landroidx/core/widget/NestedScrollView;", "Companion", "app_debug"})
public final class LawDetailFragment extends androidx.fragment.app.Fragment implements com.kodmay.ThaiPublicAssemblyLaw.repository.HttpCallback<java.util.List<? extends com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData>> {
    private com.kodmay.ThaiPublicAssemblyLaw.ui.lawdetail.DekaListAdapter adapter;
    private java.lang.String note;
    private int pageIndex;
    private int lawId;
    private boolean bookmarkMode;
    private com.kodmay.ThaiPublicAssemblyLaw.ui.main.FragmentInteractionListener listener;
    private java.util.List<com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData> lawList;
    private final kotlin.Lazy lawPref$delegate = null;
    public static final com.kodmay.ThaiPublicAssemblyLaw.ui.lawdetail.LawDetailFragment.Companion Companion = null;
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
    java.util.List<com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData> dataList) {
    }
    
    private final void renderPage() {
    }
    
    private final void renderNote(com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData noteData) {
    }
    
    private final void renderDeka(java.util.List<com.kodmay.ThaiPublicAssemblyLaw.repository.model.DekaData> dataList) {
    }
    
    @java.lang.Override()
    public void onFailure(@org.jetbrains.annotations.NotNull()
    java.lang.String error) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    /**
     * Used to scroll to the given view.
     *
     * @param scrollViewParent Parent ScrollView
     * @param view View to which we need to scroll.
     */
    private final void scrollToView(androidx.core.widget.NestedScrollView scrollViewParent, android.view.View view) {
    }
    
    /**
     * Used to get deep child offset.
     *
     *
     * 1. We need to scroll to child in scrollview, but the child may not the direct child to scrollview.
     * 2. So to get correct child position to scroll, we need to iterate through all of its parent views till the main parent.
     *
     * @param mainParent        Main Top parent.
     * @param parent            Parent.
     * @param child             Child.
     * @param accumulatedOffset Accumulated Offset.
     */
    private final void getDeepChildOffset(android.view.ViewGroup mainParent, android.view.ViewParent parent, android.view.View child, android.graphics.Point accumulatedOffset) {
    }
    
    public LawDetailFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.kodmay.ThaiPublicAssemblyLaw.ui.lawdetail.LawDetailFragment newInstance(int id, boolean bookmarkMode) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/ui/lawdetail/LawDetailFragment$Companion;", "", "()V", "newInstance", "Lcom/kodmay/ThaiPublicAssemblyLaw/ui/lawdetail/LawDetailFragment;", "id", "", "bookmarkMode", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.kodmay.ThaiPublicAssemblyLaw.ui.lawdetail.LawDetailFragment newInstance(int id, boolean bookmarkMode) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}