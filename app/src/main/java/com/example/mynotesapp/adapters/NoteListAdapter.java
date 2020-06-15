package com.example.mynotesapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynotesapp.R;

public class NoteListAdapter extends RecyclerView.Adapter<NoteListAdapter.NoteListViewHolder> {
    private final Context context;
    private final LayoutInflater layoutInflater;

    public NoteListAdapter(Context context) {
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public NoteListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = layoutInflater.inflate(R.layout.activity_note_list, parent, false);
        return new NoteListViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class NoteListViewHolder extends RecyclerView.ViewHolder {
        public TextView noteTitleTextView;
        public TextView categoryTitleTextView;

        public NoteListViewHolder(@NonNull View itemView) {
            super(itemView);
            noteTitleTextView = (TextView) itemView.findViewById(R.id.noteTitleText);
            categoryTitleTextView = (TextView) itemView.findViewById(R.id.categoryTitleText);

        }


    }
}
