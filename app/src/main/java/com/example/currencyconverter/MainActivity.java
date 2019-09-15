package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onConvert(View view) {
        EditText dollars = findViewById(R.id.editDollars);
        Double doubleDollars = Double.parseDouble(dollars.getText().toString());

        Double lkr = doubleDollars * 174;

        Toast.makeText(getApplicationContext(), "Your amount is Rs:" + lkr.toString(), Toast.LENGTH_LONG).show();
    }
}
