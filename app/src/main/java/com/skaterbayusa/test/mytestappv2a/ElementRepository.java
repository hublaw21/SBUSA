package com.skaterbayusa.test.mytestappv2a;



import java.util.List;
/*
public class ElementRepository {
    private ElementDao mElementDao;
    private LiveData<List<Element>> mAllElements;

    ElementRepository(Application application) {
        ElementRoomDatabase db = ElementRoomDatabase.getElementDB(application);
        mElementDao = db.elementDao();
        mAllElements = mElementDao.getAllElements();
    }

    LiveData<List<Element>> getAllElements() {
        return mAllElements;
    }


    public void insert (Element element) {
        new insertAsyncTask(mElementDao).execute(element);
    }

    private static class insertAsyncTask extends AsyncTask<Element, Void, Void> {

        private ElementDao mAsyncTaskDao;

        insertAsyncTask(ElementDao dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final Element... params) {
            mAsyncTaskDao.insert(params[0]);
            return null;
        }
    }
}
*/

