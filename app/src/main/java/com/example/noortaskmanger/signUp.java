package com.example.noortaskmanger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class signUp extends AppCompatActivity
{
    private EditText edtName,edtFName,edtphone,edtmail,edtPass,edtRePass;
    private Button btnSave2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        edtFName=findViewById(R.id.edtFName);
        edtName=findViewById(R.id.edtName);
        edtphone=findViewById(R.id.edtphone);
        
    }
}
