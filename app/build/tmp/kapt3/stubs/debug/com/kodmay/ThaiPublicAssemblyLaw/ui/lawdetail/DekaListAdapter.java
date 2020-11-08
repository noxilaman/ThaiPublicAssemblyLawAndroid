package com.kodmay.ThaiPublicAssemblyLaw.ui.lawdetail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0018\u0019B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\u0014\u0010\u0016\u001a\u00020\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/ui/lawdetail/DekaListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kodmay/ThaiPublicAssemblyLaw/ui/lawdetail/DekaListAdapter$ViewHolder;", "mValues", "", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/DekaData;", "dekaListener", "Lcom/kodmay/ThaiPublicAssemblyLaw/ui/lawdetail/DekaListAdapter$DekaListener;", "(Ljava/util/List;Lcom/kodmay/ThaiPublicAssemblyLaw/ui/lawdetail/DekaListAdapter$DekaListener;)V", "getDekaListener", "()Lcom/kodmay/ThaiPublicAssemblyLaw/ui/lawdetail/DekaListAdapter$DekaListener;", "clear", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateData", "itemList", "DekaListener", "ViewHolder", "app_debug"})
public final class DekaListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.kodmay.ThaiPublicAssemblyLaw.ui.lawdetail.DekaListAdapter.ViewHolder> {
    private java.util.List<com.kodmay.ThaiPublicAssemblyLaw.repository.model.DekaData> mValues;
    @org.jetbrains.annotations.NotNull()
    private final com.kodmay.ThaiPublicAssemblyLaw.ui.lawdetail.DekaListAdapter.DekaListener dekaListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.kodmay.ThaiPublicAssemblyLaw.ui.lawdetail.DekaListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.ui.lawdetail.DekaListAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kodmay.ThaiPublicAssemblyLaw.repository.model.DekaData> itemList) {
    }
    
    public final void clear() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kodmay.ThaiPublicAssemblyLaw.ui.lawdetail.DekaListAdapter.DekaListener getDekaListener() {
        return null;
    }
    
    public DekaListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kodmay.ThaiPublicAssemblyLaw.repository.model.DekaData> mValues, @org.jetbrains.annotations.NotNull()
    com.kodmay.ThaiPublicAssemblyLaw.ui.lawdetail.DekaListAdapter.DekaListener dekaListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/ui/lawdetail/DekaListAdapter$DekaListener;", "", "onSelectDeka", "", "dekaData", "Lcom/kodmay/ThaiPublicAssemblyLaw/repository/model/DekaData;", "app_debug"})
    public static abstract interface DekaListener {
        
        public abstract void onSelectDeka(@org.jetbrains.annotations.NotNull()
        com.kodmay.ThaiPublicAssemblyLaw.repository.model.DekaData dekaData);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/kodmay/ThaiPublicAssemblyLaw/ui/lawdetail/DekaListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "mView", "Landroid/view/View;", "(Lcom/kodmay/ThaiPublicAssemblyLaw/ui/lawdetail/DekaListAdapter;Landroid/view/View;)V", "mContentView", "Landroid/widget/TextView;", "getMContentView", "()Landroid/widget/TextView;", "getMView", "()Landroid/view/View;", "toString", "", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView mContentView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.view.View mView = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getMContentView() {
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