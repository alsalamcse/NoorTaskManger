package com.example.noortaskmanger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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

        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datahandler();
            }
    }};

    private void datahandler()
    {
        String first=edtFName.getText().toString();
        String Name=edtName.getText().toString();
        String phone=edtphone.getText().toString();
        String email=edtmail.getText().toString();
        String pass=edtPass.getText().toString();
        String repass=edtRePass.getText().toString();
        boolean isOk=true;
        if(email.length()<4||email.indexOf('@')<0||email.indexOf('.')<0)
        {
            edtmail.setError(("wrong email"));
            isOk=false;
        }
        if(pass.length()<8||repass.equals(pass)==false)
        {
            edtRePass.setError("Have to be at least 8 char");
            edtPass.setError("Have to be at least 8 char");
        }
        if(first.length()==0)
        {
            edtFName.setError("enter name ");
            isOk=false;
        }
        if (isOk)
        {
            //create Accoint (email,pass)
        }
    }
}
