package com.example.user.shadysaf;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CalendarView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class CalendarActivity extends AppCompatActivity implements View.OnClickListener,DialogInterface.OnClickListener {
    ArrayList<Item2> items1;
    CustomAdapter2 arrayAdapter;
    ListView GamesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        GamesList = findViewById(R.id.GamesList);
        items1 = new ArrayList<>();
        items1.add(new Item2("shadi","siba","layan","absr"));

        arrayAdapter = new CustomAdapter2(this,R.layout.custom_row2, items1);
        GamesList.setAdapter(arrayAdapter);

    }


    public void onClick(DialogInterface dialog, int which) {
        if (which == dialog.BUTTON_POSITIVE)
        {
            Intent intent= new Intent(getApplication(),Main2Activity.class);
            startActivity(intent);

        }

    }

    @Override
    public void onBackPressed() {
        //
        AlertDialog.Builder builder= new AlertDialog.Builder(this);
        //
        builder.setMessage("are you sure");
        //
        builder.setCancelable(false);
        //
        builder.setPositiveButton("yes",this);
        //
        builder.setNegativeButton("no",this);
        //
        AlertDialog dialog = builder.create();
        //
        dialog.show();
    }

    @Override
    public void onClick(View v) {

    }
}
