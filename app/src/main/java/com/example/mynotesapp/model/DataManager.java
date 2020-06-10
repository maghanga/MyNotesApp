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

    // notes

    public List<NoteInfo> getNoteInfoList(){
        return noteInfoList;
    }

//    public int createNewNote(){
//        NoteInfo note = new NoteInfo(null, null, null);
//        noteInfoList.add(note);
//        return noteInfoList.size() - 1;
//    }

    public List<CategoryInfo> getCategoryInfoList(){
        return categoryInfoList;
    }

}


//    public int createNewNote() {
//        NoteInfo note = new NoteInfo(null, null, null);
//        mNotes.add(note);
//        return mNotes.size() - 1;
//    }
//
//    public int findNote(NoteInfo note) {
//        for(int index = 0; index < mNotes.size(); index++) {
//            if(note.equals(mNotes.get(index)))
//                return index;
//        }
//
//        return -1;
//    }
//
//    public void removeNote(int index) {
//        mNotes.remove(index);
//    }