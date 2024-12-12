package com.example.maytinh2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView k19;
    private TextView btn13;
    private TextView btn14;
    private TextView btn15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        k19 = findViewById(R.id.k19);
        btn13 = findViewById(R.id.btn13);
        btn14 = findViewById(R.id.btn14);
        btn15 = findViewById(R.id.btn15);
        k19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ten = btn13.getText().toString();
                String lop = btn14.getText().toString();
                String msv = btn15.getText().toString();
                Intent intent = new Intent(MainActivity .this, Test02.class);
                intent.putExtra("btn13",ten);
                intent.putExtra("btn14",lop);
                intent.putExtra("btn15",msv);
                startActivity(intent);

            }
        });



    }
}