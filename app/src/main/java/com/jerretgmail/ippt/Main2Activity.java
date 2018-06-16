package com.jerretgmail.ippt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

                TextView iptsb = (TextView) findViewById(R.id.iptsb);
                TextView ipptrs = (TextView) findViewById(R.id.ipptrs);
                TextView iptwk = (TextView) findViewById(R.id.iptwk);

                iptsb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(Main2Activity.this, Main4Activity.class));
                    }
                });

                ipptrs.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(Main2Activity.this, Main3Activity.class));
                    }
                });

                iptwk.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(Main2Activity.this, Main5Activity.class));
                    }
                });

            }
    }
