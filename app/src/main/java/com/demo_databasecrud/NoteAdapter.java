package com.demo_databasecrud;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class NoteAdapter extends ArrayAdapter {
    Context context;
    ArrayList<Note> notes;
    int resource;

    public NoteAdapter(@NonNull Context context, int resource, ArrayList<Note> notes) {
        super(context, resource);
        this.context = context;
        this.notes = notes;
        this.resource = resource;
    }
}
