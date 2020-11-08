package com.kodmay.ThaiPublicAssemblyLaw.ui.bookmark;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0015\u0016B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/ui/bookmark/BookmarkAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kodmay/ThaiPublicAssemblyLaw/ui/bookmark/BookmarkAdapter$ViewHolder;", "mValues", "", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/LawData;", "mListener", "Lcom/kodmay/ThaiPublicAssemblyLaw/ui/bookmark/BookmarkAdapter$OnListFragmentInteractionListener;", "(Ljava/util/List;Lcom/kodmay/ThaiPublicAssemblyLaw/ui/bookmark/BookmarkAdapter$OnListFragmentInteractionListener;)V", "mOnClickListener", "Landroid/view/View$OnClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnListFragmentInteractionListener", "ViewHolder", "app_debug"})
public final class BookmarkAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.kodmay.ThaiPublicAssemblyLaw.ui.bookmark.BookmarkAdapter.ViewHolder> {
    private final android.view.View.OnClickListener mOnClickListener = null;
    private final java.util.List<com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData> mValues = null;
    private final com.kodmay.ThaiPublicAssemblyLaw.ui.bookmark.BookmarkAdapter.OnListFragmentInteractionListener mListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.kodmay.ThaiPublicAssemblyLaw.ui.bookmark.BookmarkAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.ui.bookmark.BookmarkAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public BookmarkAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData> mValues, @org.jetbrains.annotations.Nullable()
    com.kodmay.ThaiPublicAssemblyLaw.ui.bookmark.BookmarkAdapter.OnListFragmentInteractionListener mListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/ui/bookmark/BookmarkAdapter$OnListFragmentInteractionListener;", "", "onDelete", "", "item", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/LawData;", "onListFragmentInteraction", "app_debug"})
    public static abstract interface OnListFragmentInteractionListener {
        
        public abstract void onListFragmentInteraction(@org.jetbrains.annotations.NotNull()
        com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData item);
        
        public abstract void onDelete(@org.jetbrains.annotations.NotNull()
        com.kodmay.ThaiPublicAssemblyLaw.repository.model.LawData item);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/ui/bookmark/BookmarkAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "mView", "Landroid/view/View;", "(Lcom/kodmay/ThaiPublicAssemblyLaw/ui/bookmark/BookmarkAdapter;Landroid/view/View;)V", "imgDelete", "Landroid/widget/ImageView;", "getImgDelete", "()Landroid/widget/ImageView;", "getMView", "()Landroid/view/View;", "tvLabel", "Landroid/widget/TextView;", "getTvLabel", "()Landroid/widget/TextView;", "toString", "", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvLabel = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView imgDelete = null;
        @org.jetbrains.annotations.NotNull()
        private final android.view.View mView = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvLabel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImgDelete() {
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