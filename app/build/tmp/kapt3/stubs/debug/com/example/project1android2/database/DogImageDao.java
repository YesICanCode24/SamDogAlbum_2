package com.example.project1android2.database;

import java.lang.System;

/**
 * Provides access to read/write operations on the schedule table.
 * Used by the view models to format the query results for use in the UI.
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\nH\'J\b\u0010\f\u001a\u00020\u0005H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/project1android2/database/DogImageDao;", "", "addDogImage", "", "dogImageEntity", "Lcom/example/project1android2/database/DogImageEntity;", "(Lcom/example/project1android2/database/DogImageEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteDog", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllDogImages", "Lkotlinx/coroutines/flow/Flow;", "", "getMostRecentlyAddDog", "app_debug"})
public abstract interface DogImageDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM DogImages")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.project1android2.database.DogImageEntity>> getAllDogImages();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM DogImages ORDER BY id DESC LIMIT 1")
    public abstract com.example.project1android2.database.DogImageEntity getMostRecentlyAddDog();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE from DogImages where id=(select max(id)-1 from DogImages)")
    public abstract java.lang.Object deleteDog(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object addDogImage(@org.jetbrains.annotations.NotNull()
    com.example.project1android2.database.DogImageEntity dogImageEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}