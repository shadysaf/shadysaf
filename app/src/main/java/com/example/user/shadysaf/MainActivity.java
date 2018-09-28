package com.example.user.shadysaf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnCalculate;
    EditText etHeight, etWeight;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculate = (Button) findViewById(R.id.btCalculate);
        btnCalculate.setOnClickListener(this);
        etHeight = (EditText) findViewById(R.id.etHeight);
        etWeight = (EditText) findViewById(R.id.etWeight);
        tvResult = (TextView) findViewById(R.id.tvResult);
    }

    @Override
    public void onClick(View v) {
        if(v == btnCalculate){
            String height = etHeight.getText().toString();
            String weight = etWeight.getText().toString();

            if(height.equals("") || weight.equals("")){
                Toast.makeText(this, "Empty height or wieght", Toast.LENGTH_SHORT).show();

            }else{
                double h = Double.parseDouble(height);
                double w = Double.parseDouble(weight);
                double bmi = w/(h*h);
                tvResult.setText(bmi+"");
            }
        }
    }
}
