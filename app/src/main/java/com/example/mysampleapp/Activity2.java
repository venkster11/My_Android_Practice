package com.example.mysampleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent=getIntent();
        String msg1=intent.getStringExtra("code1");
        TextView t1=(TextView)findViewById(R.id.dispalymsg);
        t1.setText(msg1);
    }
}
