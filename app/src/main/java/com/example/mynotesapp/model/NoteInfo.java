package com.example.mynotesapp.model;

import java.time.LocalDateTime;

public class NoteInfo {
    private String noteTitle;
    private String noteBody;
    private LocalDateTime timeNoteCreated;

    public NoteInfo(String noteTitle, String noteBody, LocalDateTime timeNoteCreated) {
        this.noteTitle = noteTitle;
        this.noteBody = noteBody;
        this.timeNoteCreated = timeNoteCreated;
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

    public LocalDateTime getTimeNoteCreated() {
        return timeNoteCreated;
    }

    public void setTimeNoteCreated(LocalDateTime timeNoteCreated) {
        this.timeNoteCreated = timeNoteCreated;
    }
}
