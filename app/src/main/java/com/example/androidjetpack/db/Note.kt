package com.example.androidjetpack.db

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by tho nguyen on 2019-05-28.
 */
@Entity(tableName = "notes_table")
data class Note(

    var title: String,

    var description: String

) {

    @PrimaryKey(autoGenerate = true)
    var id: Int = 0

}