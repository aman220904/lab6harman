package com.example.lab6harman;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.lab6harman.ChatMessage;

@Database(entities = {ChatMessage.class}, version = 1)
public abstract class DatabaseMessage extends RoomDatabase {
    public abstract ChatMessageDAO chatMessageDAO();
}
