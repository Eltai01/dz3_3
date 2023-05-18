package com.example.dz3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Contact> contact = new ArrayList<>();
    private RecyclerView contactRecycleView;
    private ContactAdapter adapter = new ContactAdapter(contact);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactRecycleView = findViewById(R.id.recycler_view);
        loadData();
        adapter = new ContactAdapter(contact);
        contactRecycleView.setAdapter(adapter);
    }

    private void loadData() {
        contact.add(new Contact("Ibra","Kasymov","0559559288"));
        contact.add(new Contact("Ibra","Kasymov","0559559288"));
        contact.add(new Contact("Ibra","Kasymov","0559559288"));
        contact.add(new Contact("Ibra","Kasymov","0559559288"));
        contact.add(new Contact("Ibra","Kasymov","0559559288"));
        contact.add(new Contact("Ibra","Kasymov","0559559288"));
        contact.add(new Contact("Ibra","Kasymov","0559559288"));
        contact.add(new Contact("Ibra","Kasymov","0559559288"));
        contact.add(new Contact("Ibra","Kasymov","0559559288"));
        contact.add(new Contact("Ibra","Kasymov","0559559288"));
        contact.add(new Contact("Ibra","Kasymov","0559559288"));
        contact.add(new Contact("Ibra","Kasymov","0559559288"));
        contact.add(new Contact("Ibra","Kasymov","0559559288"));
        contact.add(new Contact("Ibra","Kasymov","0559559288"));
    }
}