package com.example.badulla.dbconnect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText uname,pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname=(EditText)findViewById(R.id.uname);
        pwd=(EditText)findViewById(R.id.pwd);

    }
    public void login(View view){

    }
    public void register(View view){
        startActivity(new Intent(this,Register.class));
    }
    public  void register1(View view){
        startActivity(new Intent(this,Register1.class));
    }

}
