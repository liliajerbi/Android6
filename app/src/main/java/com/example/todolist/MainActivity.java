package com.example.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.todolist.adapters.Todo;
import com.example.todolist.adapters.TodoAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<Todo> todoList = new ArrayList<>();

        todoList.add(new Todo("Récupérer ma voiture","01/01/2019"));
        todoList.add(new Todo("Passer l'aspirateur", "03/01/2019"));
        todoList.add(new Todo("Acheter des tacos", "06/02/2019"));

        ListView listTodo = findViewById(R.id.listTodo);
        TodoAdapter adapter = new TodoAdapter(MainActivity.this, todoList);
        listTodo.setAdapter(adapter);
    }
}
