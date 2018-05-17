package com.skaterbayusa.test.mytestappv2a;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.support.annotation.NonNull;

import java.util.concurrent.Executors;

@Database(entities = {Element.class}, version = 1)
public abstract class ElementRoomDatabase extends RoomDatabase {

    public abstract ElementDao elementDao();

    //private static ElementRoomDatabase elementDB;
    private static ElementRoomDatabase INSTANCE;

    static ElementRoomDatabase getInstance(final Context context) {
        if (INSTANCE == null) {
            synchronized (ElementRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            ElementRoomDatabase.class, "element_table")
                            .build();

                }
            }
        }
        return INSTANCE;
    }

    /*
    public synchronized static ElementRoomDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = buildDatabase(context);
        }
        return INSTANCE;
    }

    private static ElementRoomDatabase buildDatabase (final Context context){
        return Room.databaseBuilder(context,
                ElementRoomDatabase.class,
                "element_table")
                .addCallback(new Callback() {
                    @Override
                    public void onCreate(@NonNull SupportSQLiteDatabase db) {
                        super.onCreate(db);
                        Executors.newSingleThreadScheduledExecutor().execute(new Runnable() {
                            @Override
                            public void run() {
                                getInstance(context).elementDao().insertAll(Element.populateElementTable());
                            }
                        });
                    }
                })
                .build();
    }*/
}
