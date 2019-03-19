package com.example.todolist.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.todolist.R;

import java.util.List;

public class TodoAdapter  extends ArrayAdapter<Todo> {

    public TodoAdapter(Context context, List<Todo>todoList) {
        super(context, 0, todoList);
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        Todo item = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_todo, parent, false);
        }


        TextView textDescription = convertView.findViewById(R.id.textDescripiton);
        TextView textDate = convertView.findViewById(R.id.textDate);

        textDescription.setText(item.getDesciption());
        textDate.setText(item.getDate());

        return convertView;

    }


}
