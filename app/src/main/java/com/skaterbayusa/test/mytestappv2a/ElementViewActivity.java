package com.skaterbayusa.test.mytestappv2a;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElementViewActivity extends AppCompatActivity {

    private ElementRoomDatabase elementRoomDatabase;
    private List<Element> elements;
    private TextView testViewIDin;
    Button buttonElementView01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_element_view);
        elementRoomDatabase = ElementRoomDatabase.getInstance(ElementViewActivity.this);
        //populateElementTable();
        testViewIDin = findViewById(R.id.textViewIDin);
        buttonElementView01 = findViewById(R.id.buttonElementView01);

        buttonElementView01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(MainActivity.this, ElementViewActivity.class));
                String findElementByID = testViewIDin.getText().toString();
                elementRoomDatabase.elementDao().findElement(findElementByID);

            }
        });
        //loadElements();

        //List<Element> element = loadElements();
        /*
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        Recycler_View_Adapter adapter = new Recycler_View_Adapter(elements, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        */
    }

    public static Element[] populateElementTable(){
        return new Element[]{
                new Element("1T", "Single Toe"),
                new Element("1S", "Single Salchow"),
                new Element("1F", "Single Flip"),
                new Element("1A", "Single Axel")
        };
    }
/*
    private List<Element> loadElements(){
        // initialize database instance
        elementRoomDatabase = ElementRoomDatabase.getInstance(ElementViewActivity.this);
        // fetch list of notes in background thread
        new RetrieveElementDB(this).execute();
        return null;
    }

    private static class RetrieveElementDB extends AsyncTask<Void, Void, List<Element>>{
        private WeakReference<ElementViewActivity> activityReference;

        // only retain a weak reference to the activity
        RetrieveElementDB(ElementViewActivity context) {
            activityReference = new WeakReference<>(context);
        }

        @Override
        protected List<Element> doInBackground(Void... voids) {
            if (activityReference.get()!=null)
                return activityReference.get().elementRoomDatabase.elementDao().getAllElements();
            else
                return null;
        }

        @Override
        protected void onPostExecute(List<Element> elements) {
            if (elements!=null && elements.size()>0 ){
                activityReference.get().elements = elements;

                // hides empty text view
                //activityReference.get().textViewMsg.setVisibility(View.GONE);

                // create and set the adapter on RecyclerView instance to display list
                //activityReference.get().notesAdapter = new NotesAdapter(notes,activityReference.get());
                //activityReference.get().recyclerView.setAdapter(activityReference.get().notesAdapter);
            }
        }

    }*/
}
