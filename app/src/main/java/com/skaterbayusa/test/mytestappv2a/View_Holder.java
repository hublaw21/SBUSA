package com.skaterbayusa.test.mytestappv2a;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


public class View_Holder extends RecyclerView.ViewHolder {

    TextView elementID;
    TextView elementName;

    View_Holder(View itemView) {
        super(itemView);
        elementID = (TextView) itemView.findViewById(R.id.textViewID);
        elementName = (TextView) itemView.findViewById(R.id.textViewName);
    }
}


