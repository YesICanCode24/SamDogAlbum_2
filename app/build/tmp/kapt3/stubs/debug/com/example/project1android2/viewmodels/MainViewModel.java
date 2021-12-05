package com.example.project1android2.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\rJ\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00120\tJ\u0006\u0010\u0013\u001a\u00020\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/project1android2/viewmodels/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "dogImageDao", "Lcom/example/project1android2/database/DogImageDao;", "(Lcom/example/project1android2/database/DogImageDao;)V", "_currentlyDisplayedImage", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/project1android2/network/DogImage;", "currentlyDisplayedImage", "Landroidx/lifecycle/LiveData;", "getCurrentlyDisplayedImage", "()Landroidx/lifecycle/LiveData;", "addDog", "", "dogImageEntity", "Lcom/example/project1android2/database/DogImageEntity;", "deleteMostRecentDog", "getAllDogs", "", "getNewDog", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.project1android2.database.DogImageDao dogImageDao = null;
    private final androidx.lifecycle.MutableLiveData<com.example.project1android2.network.DogImage> _currentlyDisplayedImage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.project1android2.network.DogImage> currentlyDisplayedImage = null;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.project1android2.database.DogImageDao dogImageDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.project1android2.network.DogImage> getCurrentlyDisplayedImage() {
        return null;
    }
    
    public final void getNewDog() {
    }
    
    public final void addDog(@org.jetbrains.annotations.NotNull()
    com.example.project1android2.database.DogImageEntity dogImageEntity) {
    }
    
    public final void deleteMostRecentDog() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.project1android2.database.DogImageEntity>> getAllDogs() {
        return null;
    }
}