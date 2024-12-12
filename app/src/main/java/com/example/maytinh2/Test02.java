package com.example.maytinh2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Test02 extends AppCompatActivity {
    private TextView k01;
    private TextView k02;
    private TextView k03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test02);
        String ten =getIntent().getStringExtra("btn13");
        String lop =getIntent().getStringExtra("btn14");
        String msv =getIntent().getStringExtra("btn15");
        k01 = findViewById(R.id.k01);
        k01.setText(ten);
        k02 = findViewById(R.id.k02);
        k02.setText(lop);
        k03 = findViewById(R.id.k03);
        k03.setText(msv);

    }
}