package com.dickiezulkarnaen.gogoncell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuUtama extends AppCompatActivity {

    Button btnpulsa, btnkuota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        btnpulsa = (Button)findViewById(R.id.pulsa);
        btnkuota = (Button)findViewById(R.id.kuota);

        btnpulsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextActivity = new Intent(getApplicationContext(), pulsa.class);
                startActivity(nextActivity);
            }
        });

        btnkuota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextActivity = new Intent(getApplicationContext(), kuota.class);
                startActivity(nextActivity);
            }
        });
    }
}
