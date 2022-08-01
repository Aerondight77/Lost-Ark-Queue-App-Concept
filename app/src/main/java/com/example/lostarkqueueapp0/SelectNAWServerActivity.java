package com.example.lostarkqueueapp0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SelectNAWServerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_nawserver);
    }

    public void goToAkkan(View view) {
        Intent intent = new Intent(this, AkkanServerActivity.class);
        startActivity(intent);
    }

    public void goToBergstrom(View view) {
        Intent intent = new Intent(this, BergstromServerActivity.class);
        startActivity(intent);
    }
}