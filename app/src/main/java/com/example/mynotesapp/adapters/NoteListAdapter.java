package com.example.mynotesapp.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynotesapp.R;
import com.example.mynotesapp.model.CategoryInfo;
import com.example.mynotesapp.model.NoteInfo;

import java.util.List;

public class NoteListAdapter extends RecyclerView.Adapter<NoteListAdapter.NoteListViewHolder> {
    private final List<NoteInfo> notes;
    private final Context context;
    private final LayoutInflater layoutInflater;

    public NoteListAdapter(List<NoteInfo> notes, Context context) {
        this.notes = notes;
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public NoteListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = layoutInflater.inflate(R.layout.activity_note_item, parent, false);
        return new NoteListViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull NoteListViewHolder holder, int position) {
        NoteInfo note = notes.get(position);
        CategoryInfo categoryOfNote = note.getCategoryOfNote();
        holder.noteTitleTextView.setText(note.getNoteTitle());
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    public class NoteListViewHolder extends RecyclerView.ViewHolder {
        public final TextView noteTitleTextView;

        public NoteListViewHolder(@NonNull View itemView) {
            super(itemView);
            noteTitleTextView = itemView.findViewById(R.id.noteTitleText);
        }
    }
}
