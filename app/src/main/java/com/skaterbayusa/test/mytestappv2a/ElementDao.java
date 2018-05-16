package com.skaterbayusa.test.mytestappv2a;

//import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface ElementDao {

    @Insert
    void insert(Element element);

    @Delete
    void delete(Element element);

    @Query("DELETE FROM element_table")
    void deleteAll();

    @Query("SELECT * from element_table ORDER BY elementID ASC")  //original working
    //@Query("SELECT * from element_table ORDER BY element ASC")  //original working
    // @Query("SELECT * from element_table ORDER BY elementID ASC") // first multi-field attempt
    //LiveData<List<Element>> getAllElements();
    LiveData<List<Element>> getAllElements();
}
