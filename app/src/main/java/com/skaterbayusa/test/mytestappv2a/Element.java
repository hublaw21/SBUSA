package com.skaterbayusa.test.mytestappv2a;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "element_table")

public class Element {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "elementID")
    private String mElementID;
    @ColumnInfo(name = "elementName")
    private String mElementName;

    public Element(String mElementID, String mElementName) {
        this.mElementID = mElementID;
        this.mElementName = mElementName;
    }

    public String getElementID() {return mElementID;}
    public  void setElementID(String elementID) { this.mElementID = elementID;}
    public String getElementName() {return mElementName;}
    public  void setElementName(String elementName) { this.mElementName = elementName;}

    @Override
    public String toString(){
        return "Element{" +
                "mElementID='" +mElementID + '\'' +
                ", mElementName=" + mElementName + '\'' +
                '}';
    }
}
