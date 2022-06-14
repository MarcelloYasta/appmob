package com.example.threecoffee;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void TAKEAWAY(View view) {
        Intent i = new Intent(HomeActivity.this, MenuActivity.class);
        startActivity(i);
    }

    public void DELIVERY(View view) {
        Intent i = new Intent(HomeActivity.this, MenuActivity.class);
        startActivity(i);
    }
}