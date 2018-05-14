package com.skaterbayusa.test.mytestappv2a;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;

@Database(entities = {Element.class}, version = 1)
public abstract class ElementRoomDatabase extends RoomDatabase {

    public abstract ElementDao elementDao();

    private static ElementRoomDatabase INSTANCE;

    static ElementRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (ElementRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            ElementRoomDatabase.class, "element_database")
                            .addCallback(sRoomDatabaseCallback) //Include this to clear and repopulate the database
                            .build();

                }
            }
        }
        return INSTANCE;
    }
    // Delete/clear databsse on app open
    private static RoomDatabase.Callback sRoomDatabaseCallback =
            new RoomDatabase.Callback(){

                @Override
                public void onOpen (@NonNull SupportSQLiteDatabase db){
                    super.onOpen(db);
                    new PopulateDbAsync(INSTANCE).execute();
                }
            };
    // Deletes prior content and repopuulates the database
    private static class PopulateDbAsync extends AsyncTask<Void, Void, Void> {

        private final ElementDao mDao;

        PopulateDbAsync(ElementRoomDatabase db) {
            mDao = db.elementDao();
        }

        @Override
        protected Void doInBackground(final Void... params) {
            mDao.deleteAll();
            // Original working
            Element element = new Element("Hello");
            mDao.insert(element);
            element = new Element("World");
            mDao.insert(element);
            return null;

            /* New try
            Element element = new Element();
            element.setElementID("1F");
            element.setElementName("Single Flip");
            mDao.insert(element);
            element.setElementID("1T");
            element.setElementName("Single Toe");
            mDao.insert(element);
            return null;
            */
        }
    }
}