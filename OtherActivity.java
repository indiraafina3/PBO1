package com.codepolitan.pbo1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class OtherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        TextView textView1 = (TextView) findViewById(R.id.textview1);

        Intent in = getIntent();
        String tv1= in.getExtras().getString("location");
        textView1.setText(tv1);

        }
    }
