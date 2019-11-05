package com.example.activityexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText hello;
    Button helloBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hello = findViewById(R.id.helloET);
        helloBtn = findViewById(R.id.helloBtn);
        helloBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isFieldsValid()){
                    Toast.makeText(getApplicationContext(),"Invalid Data",Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent i = new Intent(getApplicationContext(), NextActivity.class);
                i.putExtra("hello_text", hello.getText().toString());
                startActivity(i);
//                finish();
            }
        });
    }

    private boolean isFieldsValid(){
        String h = hello.getText().toString();
        if(h.isEmpty()) {
            return false;
        }
        return true;
    }
}
