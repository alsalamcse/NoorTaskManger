package com.example.noortaskmanger;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.security.Key;

import Data.myTask;

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
        if (isOk)
        {
            myTask t=new myTask();
            t.setTittle(tittle);
            createTask(t);
            createTask(tittle,subject,seeekBar);

        }

        }
        private void createTask(myTask t)
        {
            FirebaseDatabase database=FirebaseDatabase.getInstance();
            DatabaseReference reference = database.getReference();
            String key = reference.child("tasks").push().getKey();
            reference.child("tasks").child(key).setValue(t).addOnCompleteListener(addTask.this, new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task)
                {
                    if (task.isSuccessful())
                    {
                    Toast.makeText(addTask.this, "add successful", Toast.LENGTH_SHORT).show();
                     finish();
                }
                    else
                        {
                            Toast.makeText(addTask.this, "add failed"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            task.getException().printStackTrace();
                    }
                }

            });



        }


    private void createTask(String tittle, String subject, int seeekBar)
    {
    }
}

