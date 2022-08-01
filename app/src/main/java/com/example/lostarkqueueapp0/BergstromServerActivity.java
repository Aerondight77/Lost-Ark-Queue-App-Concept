package com.example.lostarkqueueapp0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BergstromServerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bergstrom_server);
    }

    public void bergstromSubmit(View view) {
        TextView text = (EditText) findViewById(R.id.queueNumBergstrom);
        int num = Integer.parseInt(text.getText().toString());
        TextView displayNum = findViewById(R.id.bergstromLastValue);
        displayNum.setText(String.valueOf(num));
        text.setText("");
    }
}