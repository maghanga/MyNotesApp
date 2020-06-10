package com.example.mynotesapp.model;

import java.util.List;

public class CategoryInfo {
    private int categoryId;
    private String categoryTitle;
    private String categoryDescription;
    private List<NoteInfo> notesInCategory;


    public CategoryInfo(int categoryId, String categoryTitle, String categoryDescription, List<NoteInfo> notesInCategory) {
        this.categoryId = categoryId;
        this.categoryTitle = categoryTitle;
        this.categoryDescription = categoryDescription;
        this.notesInCategory = notesInCategory;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {

        this.categoryId = categoryId;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public List<NoteInfo> getNotesInCategory() {
        return notesInCategory;
    }

    public void setNotesInCategory(List<NoteInfo> notesInCategory) {
        this.notesInCategory = notesInCategory;
    }
}
