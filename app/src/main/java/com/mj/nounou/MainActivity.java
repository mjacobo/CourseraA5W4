package com.mj.nounou;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bebeB = (Button) findViewById(R.id.acbButtonBebe);
        bebeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bebeMonitor();
            }
        });

        Button nanaB = (Button) findViewById(R.id.acbButtonNana);
        nanaB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nanaMonitor();
            }
        });

    }

    public void nanaMonitor() {
        Intent myIntent = new Intent(this, NanaActivity.class);
        this.startActivity(myIntent);
    }

    public void bebeMonitor() {
        Intent myIntent = new Intent(this, BebeActivity.class);
        this.startActivity(myIntent);
    }
}
