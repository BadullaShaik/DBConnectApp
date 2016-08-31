package com.example.badulla.dbconnect;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

/**
 * Created by WIN 10 on 23-08-2016.
 */
public class RegBackground extends AsyncTask<String,String,String>{

    Context context;
    public RegBackground(Context context) {
        this.context=context;
    }
    @Override
    protected String doInBackground(String... strings) {
        String fname=strings[0];
        String lname=strings[1];
        String phno=strings[2];
        return fname+lname+phno;
    }

    @Override
    protected void onPostExecute(String s) {
        Toast.makeText(context, "hi"+s, Toast.LENGTH_SHORT).show();
    }
}
