package com.skaterbayusa.test.mytestappv2a;

import android.os.AsyncTask;

import java.util.ArrayList;
import java.util.List;

public class DatabaseInitializer {
    /*
    public static void populateAsync(final ElementRoomDatabase elementDB) {
        new PopulateDbAsync(elementDB).execute();
    }

    private static class PopulateDbAsync extends AsyncTask<Void, Void, Void> {

        private final ElementRoomDatabase elementDB;

        PopulateDbAsync(ElementRoomDatabase elementDB) {
            this.elementDB = elementDB;
        }

        @Override
        protected Void doInBackground(final Void... params) {
            // If the Database is empty, add the initial data.
            if (elementDB.elementDao().rowCount() == 0) {
                List<Element> element = new ArrayList<>();
                element.add(new Element("1T", "Single Toe"));
                element.add(new Element("1S", "Single Salchow"));
                element.add(new Element("1F", "Single Flip"));
                element.add(new Element("1A", "Single Axel"));
                elementDB.elementDao()
                        .insertAll(
                                element.toArray(new Element[element.size()]));
            }

            return null;
        }
    }
    */
}

