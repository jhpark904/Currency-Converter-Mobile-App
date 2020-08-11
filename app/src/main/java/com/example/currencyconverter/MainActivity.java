package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {
        EditText amount = (EditText) findViewById(R.id.amount);
        double dollar = Double.parseDouble(amount.getText().toString());
        double rate = 1195;
        double krw = dollar * rate;
        Toast.makeText(this, krw + " KRW", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}