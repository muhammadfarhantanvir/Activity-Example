package com.example.activityexample;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends Activity {

    TextView receivedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        receivedText = findViewById(R.id.received_text_tv);

        if (getIntent().getExtras() != null) {
            Bundle b = getIntent().getExtras();

            String hello = b.getString("hello_text","None");
            String hello1 = b.getString("hello_text_x","None");

            receivedText.setText(hello);
        }

    }
}
