package com.example.user.shadysaf;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,DialogInterface.OnClickListener {

   Button btStart;
   TextView tvBarcelona;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btStart=(Button)findViewById(R.id.btStart);
        tvBarcelona=(TextView) findViewById(R.id.tvBarcelona);
        tvBarcelona.setOnClickListener(this);
        btStart.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v==btStart) {
            Intent intent = new Intent(getApplication(), Main2Activity.class);
            startActivity(intent);
        }
        if(v==tvBarcelona) {
            Intent intent1 = new Intent(getApplication(), AboutBarcelonaActivity.class);
            startActivity(intent1);
        }

    }
    @Override
    public void onClick(DialogInterface dialog, int which) {

        if(which==dialog.BUTTON_NEGATIVE);
        {
            Toast.makeText(this,"No",Toast.LENGTH_LONG).show();
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
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.aboutApp:
                Intent i = new Intent(this, AboutApplicationActivity.class);
                startActivity(i);
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
