package com.example.user.shadysaf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PLAYERLISTActivity extends AppCompatActivity implements AdapterView.OnClickListener{
    ArrayList<Item> items;
    CustomAdapter arrayAdapter;
    ListView playersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playerlist);

        playersList = findViewById(R.id.playersList);
        items = new ArrayList<>();
        items.add(new Item(R.drawable.stegen,"shady"));
        items.add(new Item(R.drawable.stegen,"shady"));
        items.add(new Item(R.drawable.stegen,"shady"));
        items.add(new Item(R.drawable.stegen,"shady"));

        arrayAdapter = new CustomAdapter(this,R.layout.custom_row,items);
        playersList.setAdapter(arrayAdapter);

    }

    @Override
    public void onClick(View v) {

    }
}
