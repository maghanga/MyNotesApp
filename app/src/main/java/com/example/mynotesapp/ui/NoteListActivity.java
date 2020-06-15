package com.example.mynotesapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mynotesapp.R;
import com.example.mynotesapp.adapters.NoteListAdapter;
import com.example.mynotesapp.model.DataManager;
import com.example.mynotesapp.model.NoteInfo;

import java.util.List;

public class NoteListActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_list);
        displayContent();

    }

    public void displayContent(){
        recyclerView = findViewById(R.id.noteListRecyclerView);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<NoteInfo> notes = DataManager.getInstance().getNoteInfoList();
        final NoteListAdapter noteListAdapter = new NoteListAdapter(notes, this);
        recyclerView.setAdapter(noteListAdapter);
    }
}