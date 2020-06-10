package com.example.mynotesapp.model;

import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private static DataManager myInstance = null;
    private List<NoteInfo> noteInfoList = new ArrayList<>();
    private List<CategoryInfo> categoryInfoList = new ArrayList<>();

    public static DataManager getInstance() {
        if(myInstance == null) {
            myInstance = new DataManager();
        }
        return myInstance;
    }

    private DataManager() {
    }

    public List<NoteInfo> getNoteInfoList(){
        return noteInfoList;
    }

    public List<CategoryInfo> getCategoryInfoList(){
        return categoryInfoList;
    }

}
