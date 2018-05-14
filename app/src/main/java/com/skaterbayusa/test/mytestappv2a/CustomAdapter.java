package com.skaterbayusa.test.mytestappv2a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
        Context context;
        String elementList[][];
        String elementIDList[];
        String elementNameList[];

    LayoutInflater inflter;

        public CustomAdapter(Context applicationContext, String[] elementIDList, String[] elementNameList) {
        //public CustomAdapter(Context applicationContext, String[][] elementList) {
            this.context = context;
            this.elementIDList = elementIDList;
            this.elementNameList = elementNameList;
            //this.elementList = elementList;
            inflter = (LayoutInflater.from(applicationContext));
        }

        @Override
        public int getCount() {
            return elementIDList.length;
            //return elementList.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = inflter.inflate(R.layout.activity_element_listview_base, null);
            TextView elementID = (TextView)           view.findViewById(R.id.textViewID);
            TextView elementName = (TextView)           view.findViewById(R.id.textViewName);
            elementID.setText(elementIDList[i]);
            elementName.setText(elementNameList[i]);
            //elementID.setText(elementList[0][i]);
            //elementName.setText(elementList[1][i]);
            return view;
        }
    }
