package com.example.noortaskmanger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

public class Setting extends AppCompatActivity {
    private Switch sw;
    private TextView tvSiz;
    private SeekBar sb2;
    private Button btnS2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        sw=(Switch)findViewById(R.id.sw);
        tvSiz=findViewById(R.id.tvSiz);
        sb2=findViewById(R.id.sb2);
        btnS2=findViewById(R.id.btnS2);
    }
}
