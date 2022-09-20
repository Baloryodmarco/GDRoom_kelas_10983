package com.example.gdroom_kelas_10983.room

Entity
data class Note (
    PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val note: String
)