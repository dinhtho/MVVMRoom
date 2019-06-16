package com.example.androidjetpack.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

/**
 * Created by tho nguyen on 2019-05-28.
 */

@Dao
interface NoteDao {

    @Insert
    suspend fun insert(note: Note)

    @Query("DELETE FROM notes_table")
    suspend fun deleteAllNotes()

    // coroutines do not support live data
    @Query("SELECT * FROM notes_table ")
    fun getAllNotes(): LiveData<List<Note>>

}