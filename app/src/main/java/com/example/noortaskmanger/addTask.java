package com.example.noortaskmanger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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
       edtsubject=findViewById(R.id.edtsubject);
        skpro=(SeekBar) findViewById(R.id.skpro);
        tvpro=(TextView) findViewById(R.id.tvpro);
        btnSave=(Button) findViewById(R.id.btnSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataHandler();
            }

        });

    }
    private void dataHandler()
    {
        String tittle=edttittle.getText().toString();
        String subject=edtsubject.getText().toString();
        int seeekBar=skpro.getProgress();
        boolean isOk=true;

        if(tittle.length()<1)
        {
            edttittle.setError("tittle length is error");
            isOk=false;
        }
        if(subject.length()<1)
        {
            edtsubject.setError("subject length error");
        }
        if(isOk)
        {
            createTask(tittle,subject,seeekBar);
        }
    }

    private void createTask(String tittle, String subject, int seeekBar)
    {
    }
}
