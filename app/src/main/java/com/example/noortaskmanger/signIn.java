package com.example.noortaskmanger;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class signIn extends AppCompatActivity
{
 private EditText edtEmail,edtPassword;
 private ImageView imageSign;
 private Button btnIn,btnUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        edtEmail=(EditText)findViewById(R.id.edtEmail);
        //edtPassword=(EditText)findViewById(R.id.edtPassword);
        imageSign=(ImageView)findViewById(R.id.imageSign);
        btnIn=(Button)findViewById(R.id.btnIn);
        btnUp=(Button)findViewById(R.id.btnUp);
    }
}
