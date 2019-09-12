package com.example.noortaskmanger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class signUp extends AppCompatActivity
{
    private EditText edtName,edtFName,edtphone,edtmail,edtPass,edtRePass;
    private Button btnS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        edtFName=findViewById(R.id.edtFName);
        edtName=findViewById(R.id.edtName);
        edtphone=(EditText)findViewById(R.id.edtphone);
        edtmail=(EditText)findViewById(R.id.edtEmail);
        edtPass=(EditText)findViewById(R.id.edtPass);
        edtRePass=(EditText)findViewById(R.id.edtRePass);
        btnS=(Button)findViewById(R.id.btnS);
    }
}
