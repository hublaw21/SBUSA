package com.skaterbayusa.test.mytestappv2a;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collections;
import java.util.List;

public class Recycler_View_Adapter extends RecyclerView.Adapter<View_Holder> {

    //List<Data> list = Collections.emptyList();
    List<Element> list = Collections.emptyList();
    Context context;

        //public Recycler_View_Adapter(List<Data> list, Context context) {
        public Recycler_View_Adapter(List<Element> list, Context context) {
                this.list = list;
            this.context = context;
        }

        @Override
        public View_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
            //Inflate the layout, initialize the View Holder
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
            View_Holder holder = new View_Holder(v);
            return holder;
        }

        @Override
        public void onBindViewHolder(View_Holder holder, int position) {

            //Use the provided View Holder on the onCreateViewHolder method to populate the current row on the RecyclerView
            //holder.elementID.setText(list.get(position).elementID);
            //holder.elementName.setText(list.get(position).elementName);
            holder.elementID.setText(list.get(position).getElementID());
            holder.elementName.setText(list.get(position).getElementName());
        }

        @Override
        public int getItemCount() {
            //returns the number of elements the RecyclerView will display
            return list.size();
        }

        @Override
        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
            super.onAttachedToRecyclerView(recyclerView);
        }

        // Insert a new item to the RecyclerView on a predefined position
        //public void insert(int position, Data data) {list.add(position, data);
        public void insert(int position, Element element) {
            list.add(position, element);
            notifyItemInserted(position);
        }

        // Remove a RecyclerView item containing a specified Data object
        //public void remove(Data data) {int position = list.indexOf(data);
        public void remove(Element element) {
            int position = list.indexOf(element);
            list.remove(position);
            notifyItemRemoved(position);
        }
    }

