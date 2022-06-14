package com.example.threecoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PaymentActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment2);
    }

    public void Cod(View view) {
        Intent i = new Intent(PaymentActivity2.this, ThanksActivity.class);
        startActivity(i);
    }

    public void cek(View view) {
        Intent i = new Intent(PaymentActivity2.this, ThanksActivity.class);
        startActivity(i);
    }
}