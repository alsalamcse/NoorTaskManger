package com.example.noortaskmanger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class addTask extends AppCompatActivity {
    private EditText edttittle,edtsubject;
    private SeekBar skpro;
    private TextView tvpro;
    private Button btnSave;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        edttittle=(EditText)findViewById(R.id.edttittle);
        edtsubject=(EditText) findViewById(R.id.edtsubject);
        skpro=(SeekBar) findViewById(R.id.skpro);
        tvpro=(TextView) findViewById(R.id.tvpro);
        btnSave=(Button) findViewById(R.id.btnSave);

    }
}
