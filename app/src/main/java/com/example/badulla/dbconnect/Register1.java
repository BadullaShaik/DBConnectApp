package com.example.badulla.dbconnect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register1 extends AppCompatActivity {
EditText fn,ln,pno;
    String fname,lname,phno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register1);
        fn=(EditText)findViewById(R.id.fname);
        ln=(EditText)findViewById(R.id.lname);
        pno=(EditText)findViewById(R.id.phno);

    }
    public void register1(View view){
        fname=fn.getText().toString();
        lname=ln.getText().toString();
        phno=pno.getText().toString();
/*
        Toast.makeText(Register1.this, "hi Mr. "+fname+" "+lname+"\nThis si ur phone no "+phno, Toast.LENGTH_SHORT).show();
*/
        RegBackground regback=new RegBackground(this);
        regback.execute(fname,lname,phno);
        finish();
    }
}
