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

    // note transactions

    public List<NoteInfo> getNoteInfoList(){
        return noteInfoList;
    }

    public int createNewNote(){
        NoteInfo note = new NoteInfo(null, null, null);
        noteInfoList.add(note);
        return noteInfoList.size() - 1;
    }

    public int findNote(NoteInfo note){
        for(int i = 0; i < noteInfoList.size(); i++){
            if(note.equals(noteInfoList.get(i)))
                return i;
        }
        return -1;
    }

    public void deleteNote(int i){
        noteInfoList.remove(i);
    }

    // category transactions

    public List<CategoryInfo> getCategoryInfoList(){
        return categoryInfoList;
    }

    public CategoryInfo getCategory(String id){
        for(CategoryInfo category : categoryInfoList){
            if(id.equals(category.getCategoryId()))
                return category;
        }
        return null;
    }

    public List<NoteInfo> getNotesInCategory(CategoryInfo category){
        ArrayList<NoteInfo> notes = new ArrayList<>();
        for(NoteInfo note : noteInfoList){
            if(category.equals(note.getCategoryOfNote()))
                notes.add(note);
        }
        return notes;
    }

    public int getNoteCountInCategory(CategoryInfo category){
        int count = 0;
        for(NoteInfo note : noteInfoList){
            if(category.equals(note.getCategoryOfNote()))
                count++;
        }
        return count;
    }
}

