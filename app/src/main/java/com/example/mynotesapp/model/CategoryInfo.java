package com.example.mynotesapp.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class CategoryInfo implements Parcelable {
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

    protected CategoryInfo(Parcel parcel) {
        categoryId = parcel.readInt();
        categoryTitle = parcel.readString();
        categoryDescription = parcel.readString();
        notesInCategory = parcel.createTypedArrayList(NoteInfo.CREATOR);
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeInt(categoryId);
        parcel.writeString(categoryTitle);
        parcel.writeString(categoryDescription);
        parcel.writeTypedList(notesInCategory);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Parcelable.Creator<CategoryInfo> CREATOR = new Creator<CategoryInfo>() {
        @Override
        public CategoryInfo createFromParcel(Parcel in) {
            return new CategoryInfo(in);
        }

        @Override
        public CategoryInfo[] newArray(int size) {
            return new CategoryInfo[size];
        }
    };

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
