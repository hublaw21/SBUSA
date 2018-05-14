package com.skaterbayusa.test.mytestappv2a;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ElementsAdapter extends ArrayAdapter<Elements>{

    private Context mContext;
    private List<Elements> elementsList = new ArrayList<>();

    public ElementsAdapter(@NonNull Context context, @LayoutRes ArrayList<Elements> list){
        super(context, 0, list);
        mContext = context;
        elementsList = list;
    }
    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent){
        View listElement = convertView;
        if(listElement == null)
            listElement = LayoutInflater.from(mContext).inflate(R.layout.list_element,parent,false);

        Elements currentElement = elementsList.get(position);

        TextView elementID = (TextView) listElement.findViewById(R.id.textViewID);
        elementID.setText(currentElement.getmElementID());

        TextView elementName = (TextView) listElement.findViewById(R.id.textViewName);
        elementName.setText(currentElement.getmElementName());

        return listElement;
    }
}


