package com.dickiezulkarnaen.gogoncell;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class bolt extends AppCompatActivity {
    TextView ket_bolt, harga_bolt;
    EditText nohp_bolt;
    Button beli_bolt;
    Spinner spinner_bolt;
    String textharga = "Harga      :  Rp ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bolt);

        ket_bolt = (TextView)findViewById(R.id.ketbolt);
        harga_bolt = (TextView)findViewById(R.id.hargabolt);
        nohp_bolt = (EditText)findViewById(R.id.nohpbolt);
        beli_bolt = (Button)findViewById(R.id.belibolt);
        spinner_bolt = (Spinner)findViewById(R.id.spinnerbolt);

        spinner_bolt.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (spinner_bolt.getSelectedItem().equals("DBL1500")) {
                    ket_bolt.setText("DATA BOLT | 1.5GB (4G) | 30 Hari | 24 Jam");
                    harga_bolt.setText(textharga + " 32,000");
                } else if (spinner_bolt.getSelectedItem().equals("DBL3000")) {
                    ket_bolt.setText("DATA BOLT | 3GB (4G) | 30 Hari | 24 Jam");
                    harga_bolt.setText(textharga + " 52,000");
                } if (spinner_bolt.getSelectedItem().equals("DBL8000")) {
                    ket_bolt.setText("DATA BOLT | 8GB (4G) | 30 Hari | 24 Jam");
                    harga_bolt.setText(textharga + " 100,000");
                } if (spinner_bolt.getSelectedItem().equals("DBL13000")) {
                    ket_bolt.setText("DATA BOLT | 13GB (4G) | 30 Hari | 24 Jam");
                    harga_bolt.setText(textharga + " 150,000");
                } if (spinner_bolt.getSelectedItem().equals("DBL17000")) {
                    ket_bolt.setText("DATA BOLT | 17GB (4G) | 30 Hari | 24 Jam");
                    harga_bolt.setText(textharga + " 203,000");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        beli_bolt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nohp_bolt.getText().toString().equals("")) {
                    nohp_bolt.setError("Masukkan No HP!");
                } else {
                    showDialog();
                }
            }
        });
    }

    public void showDialog(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder
                .setMessage("Paket Data "+spinner_bolt.getSelectedItem().toString()+" ke nomor "+nohp_bolt.getText()+" akan segera diproses!")
                .setCancelable(false)
                .setPositiveButton("OK",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        finish();
                    }
                });
        // membuat alert dialog dari builder
        AlertDialog alertDialog = alertDialogBuilder.create();

        // menampilkan alert dialog
        alertDialog.show();
    }
}