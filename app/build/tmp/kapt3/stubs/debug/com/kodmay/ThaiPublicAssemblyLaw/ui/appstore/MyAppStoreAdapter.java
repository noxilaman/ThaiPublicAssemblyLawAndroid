package com.kodmay.ThaiPublicAssemblyLaw.ui.appstore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0015B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/ui/appstore/MyAppStoreAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kodmay/ThaiPublicAssemblyLaw/ui/appstore/MyAppStoreAdapter$ViewHolder;", "mValues", "", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/AppStoreData;", "mListener", "Lcom/kodmay/ThaiPublicAssemblyLaw/ui/appstore/AppStoreFragment$OnListFragmentInteractionListener;", "(Ljava/util/List;Lcom/kodmay/ThaiPublicAssemblyLaw/ui/appstore/AppStoreFragment$OnListFragmentInteractionListener;)V", "mOnClickListener", "Landroid/view/View$OnClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class MyAppStoreAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.kodmay.ThaiPublicAssemblyLaw.ui.appstore.MyAppStoreAdapter.ViewHolder> {
    private final android.view.View.OnClickListener mOnClickListener = null;
    private final java.util.List<com.kodmay.ThaiPublicAssemblyLaw.repository.model.AppStoreData> mValues = null;
    private final com.kodmay.ThaiPublicAssemblyLaw.ui.appstore.AppStoreFragment.OnListFragmentInteractionListener mListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.kodmay.ThaiPublicAssemblyLaw.ui.appstore.MyAppStoreAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.ui.appstore.MyAppStoreAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public MyAppStoreAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kodmay.ThaiPublicAssemblyLaw.repository.model.AppStoreData> mValues, @org.jetbrains.annotations.Nullable()
    com.kodmay.ThaiPublicAssemblyLaw.ui.appstore.AppStoreFragment.OnListFragmentInteractionListener mListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/ui/appstore/MyAppStoreAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "mView", "Landroid/view/View;", "(Lcom/kodmay/ThaiPublicAssemblyLaw/ui/appstore/MyAppStoreAdapter;Landroid/view/View;)V", "img", "Landroid/widget/ImageView;", "getImg", "()Landroid/widget/ImageView;", "getMView", "()Landroid/view/View;", "title", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "toString", "", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView img = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView title = null;
        @org.jetbrains.annotations.NotNull()
        private final android.view.View mView = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImg() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getMView() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View mView) {
            super(null);
        }
    }
}