package com.skaterbayusa.test.mytestappv2a;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
/*
@Database(entities = {Element.class}, version = 1)
public abstract class ElementRoomDatabase extends RoomDatabase {

    public abstract ElementDao elementDao();

    private static ElementRoomDatabase elementDB;
    //private static ElementRoomDatabase INSTANCE;

    static ElementRoomDatabase getElementDB(final Context context) {
        if (null == elementDB) {
            // elementDB = buildDatabaseInstance(context);
            synchronized (ElementRoomDatabase.class) {
                if (elementDB == null) {
                    elementDB = Room.databaseBuilder(context.getApplicationContext(),
                            ElementRoomDatabase.class, "element_database")
                            //.addCallback(sRoomDatabaseCallback) //Include this to clear and repopulate the database
                            .build();
                }
            }
        }
        return elementDB;
    }
}
*/