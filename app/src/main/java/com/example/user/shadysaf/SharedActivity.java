package com.example.user.shadysaf;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SharedActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnSave;
    TextView etName,tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared);
        btnSave = findViewById(R.id.btnSave);
        etName = findViewById(R.id.etName);
        btnSave.setOnClickListener(this);

        SharedPreferences pref = getSharedPreferences("mypref",MODE_PRIVATE);

        String name=pref.getString("name",null);

        tvName = findViewById(R.id.tvName);
        if(name != null){
            tvName.setText(name);
        }
    }

    @Override
    public void onClick(View v) {
        SharedPreferences pref = getSharedPreferences("mypref",MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("name",etName.getText().toString());
        editor.commit();
    }
}
