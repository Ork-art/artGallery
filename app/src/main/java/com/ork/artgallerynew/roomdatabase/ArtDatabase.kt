package com.ork.artgallerynew.roomdatabase

import androidx.room.Database
import androidx.room.RoomDatabase

import com.ork.artgallerynew.model.Art


@Database(entities = [Art::class], version = 1)
abstract class ArtDatabase : RoomDatabase() {
    abstract fun artDao(): ArtDao
}
