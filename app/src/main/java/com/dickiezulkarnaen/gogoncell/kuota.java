package com.dickiezulkarnaen.gogoncell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class kuota extends AppCompatActivity {

    String nmProvider[] = {"TELKOMSEL", "INDOSAT", "XL AXIATA", "THREE", "AXIS", "SMARTFREN", "BOLT"};
    int gbrProvider[] = {R.mipmap.telkomsel, R.mipmap.indosat, R.mipmap.xl, R.mipmap.three, R.mipmap.axis, R.mipmap.smart, R.mipmap.bolt};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuota);
        listView = (ListView) findViewById(R.id.listView);
        CustomAdapter adapter = new CustomAdapter(kuota.this, gbrProvider, nmProvider);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent nextActivity = new Intent(getApplicationContext(), telkomsel.class);
                    startActivity(nextActivity);
                }
                if (position == 1) {
                    Intent nextActivity = new Intent(getApplicationContext(), indosat.class);
                    startActivity(nextActivity);
                }
                if (position == 2) {
                    Intent nextActivity = new Intent(getApplicationContext(), xl.class);
                    startActivity(nextActivity);
                }
                if (position == 3) {
                    Intent nextActivity = new Intent(getApplicationContext(), three.class);
                    startActivity(nextActivity);
                }
                if (position == 4) {
                    Intent nextActivity = new Intent(getApplicationContext(), axis.class);
                    startActivity(nextActivity);
                }
                if (position == 5) {
                    Intent nextActivity = new Intent(getApplicationContext(), smart.class);
                    startActivity(nextActivity);
                }
                if (position == 6) {
                    Intent nextActivity = new Intent(getApplicationContext(), bolt.class);
                    startActivity(nextActivity);
                }

            }
        });
    }
}