package com.jerretgmail.ippt;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button b=(Button) findViewById(R.id.btnLog);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Welcome", Toast.LENGTH_SHORT).show();

                final Button d=(Button) findViewById(R.id.btnLog);

                d.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent myintent = new Intent(getBaseContext(),Main2Activity.class);
                        startActivity(myintent);
                    }
                });
            }
        });

    }
}