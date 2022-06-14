package com.example.threecoffee;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class complateprofile extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complateprofile);

    }

    public void LOGINN(View view) {
        Intent i = new Intent(complateprofile.this, HomeActivity.class);
        startActivity(i);
    }

    public void SIGNUP(View view) {
        Intent i = new Intent(complateprofile.this, RegisterActivity.class);
        startActivity(i);
    }
}
