package com.sbsj.mycalculator

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sbsj.mycalculator.dao.HistoryDao
import com.sbsj.mycalculator.model.History

@Database(entities = [History::class], version = 1)
abstract class AppDatabase :RoomDatabase(){
    abstract fun historyDao() : HistoryDao

}