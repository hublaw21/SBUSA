package com.skaterbayusa.test.mytestappv2a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    //ListView simpleList;
    //private ListView listView;
    //private ElementsAdapter mAdapter;
    //String elementIDList[] = {"1T", "1S", "1F", "1Lo", "1Lz", "1A"};
    //String elementNameList[] = {"Single Toe", "Single Salchow", "Single Flip", "Single Loop", "Single Lutz", "Single Axel"};
    //String elementList[][] = {{"1T","Single Toe"},{"1S","Single Salchow"},{"1F","Single Flip"},{"1Lo","Single Loop"},{"1Lz", "Single Lutz"},{"1A","Single Axel"}};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        List<Data> data = fill_with_data();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        Recycler_View_Adapter adapter = new Recycler_View_Adapter(data, getApplication());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

/*
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        final ElementListAdapter adapter = new ElementListAdapter(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
*/

        /*
        listView = (ListView) findViewById(R.id.elements_list);

        ArrayList<Elements> elementsList = new ArrayList<>();

        elementsList.add(new Elements("1T","Single Toe"));
        elementsList.add(new Elements("1S","Single Salchow"));
        elementsList.add(new Elements("1F","Single Flip"));

        mAdapter = new ElementsAdapter(this,elementsList);
        listView.setAdapter(mAdapter);
        */

        /* Baseview attempt
        simpleList = (ListView) findViewById(R.id.simpleListView);
         CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), elementIDList, elementNameList);
        //CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), elementList);
        simpleList.setAdapter(customAdapter);
        */
    }
    public List<Data> fill_with_data() {

        List<Data> data = new ArrayList<>();

        data.add(new Data("1T","Single Toe"));
        data.add(new Data("1S","Single Salchow"));
        data.add(new Data("1F","Single Flip"));

        return data;
    }
}
