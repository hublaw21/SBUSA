package com.skaterbayusa.test.mytestappv2a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonMain01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonMain01 = (Button) findViewById(R.id.buttonMain01);

        buttonMain01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(MainActivity.this, ElementViewActivity.class));
                Intent myIntent = new Intent(MainActivity.this, ElementViewActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
