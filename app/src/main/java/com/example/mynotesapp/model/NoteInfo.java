package com.example.mynotesapp.model;

import android.os.Parcel;
import android.os.Parcelable;

public class NoteInfo implements Parcelable {
    private String noteTitle;
    private String noteBody;
    private CategoryInfo categoryOfNote;

    public NoteInfo(String noteTitle, String noteBody, CategoryInfo categoryOfNote) {
        this.noteTitle = noteTitle;
        this.noteBody = noteBody;
        this.categoryOfNote = categoryOfNote;
    }

    protected NoteInfo(Parcel parcel) {
        categoryOfNote = parcel.readParcelable(CategoryInfo.class.getClassLoader());
        noteTitle = parcel.readString();
        noteBody = parcel.readString();
    }

    public static final Parcelable.Creator<NoteInfo> CREATOR = new Creator<NoteInfo>() {
        @Override
        public NoteInfo createFromParcel(Parcel parcel) {
            return new NoteInfo(parcel);
        }

        @Override
        public NoteInfo[] newArray(int size) {
            return new NoteInfo[size];
        }
    };

    public CategoryInfo getCategoryOfNote() {
        return categoryOfNote;
    }

    public void setCategoryOfNote(CategoryInfo categoryOfNote) {
        this.categoryOfNote = categoryOfNote;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getNoteBody() {
        return noteBody;
    }

    public void setNoteBody(String noteBody) {
        this.noteBody = noteBody;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
//        parcel.writeParcelable(categoryOfNote, 0);
        parcel.writeString(noteTitle);
        parcel.writeString(noteBody);
    }
}
