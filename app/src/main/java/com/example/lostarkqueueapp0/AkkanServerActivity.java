package com.example.lostarkqueueapp0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AkkanServerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akkan_server);
    }

    public void akkanSubmit(View view) {
        TextView text = (EditText) findViewById(R.id.queueNumAkkan);
        int num = Integer.parseInt(text.getText().toString());
        TextView displayNum = findViewById(R.id.akkanLastValue);
        displayNum.setText(String.valueOf(num));
        text.setText("");
    }
}