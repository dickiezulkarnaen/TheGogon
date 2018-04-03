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

public class smart extends AppCompatActivity {
    TextView ket_smart, harga_smart;
    EditText nohp_smart;
    Button beli_smart;
    Spinner spinner_smart;
    String textharga = "Harga      :  Rp ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smart);

        ket_smart = (TextView)findViewById(R.id.ketsmart);
        harga_smart = (TextView)findViewById(R.id.hargasmart);
        nohp_smart = (EditText)findViewById(R.id.nohpsmart);
        beli_smart = (Button)findViewById(R.id.belismart);
        spinner_smart = (Spinner)findViewById(R.id.spinnersmart);

        spinner_smart.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (spinner_smart.getSelectedItem().equals("MSP50")) {
                    ket_smart.setText("SMARTPLAN BRONZE | 1GB (4G) | 30 Hari | Bonus Telepon ke semua 10Menit,Telepon sesama 100Menit,100SMS ke semua");
                    harga_smart.setText(textharga + " 56,000");
                } else if (spinner_smart.getSelectedItem().equals("MSP60")) {
                    ket_smart.setText("SMARTPLAN SILVER | 2GB (4G) | 30 Hari | Bonus Telepon ke semua 10Menit,Telepon sesama 100Menit,100SMS ke semua");
                    harga_smart.setText(textharga + " 66,000");
                } else if (spinner_smart.getSelectedItem().equals("MSP75")) {
                    ket_smart.setText("SMARTPLAN SILVER | 3GB (4G) | 30 Hari | Bonus Telepon ke semua 10Menit,Telepon sesama 100Menit,100SMS ke semua,Up Size Kuota 1GB+Kuota Chat 1GB (Line,Whatsapp,BBM)");
                    harga_smart.setText(textharga + " 82,000");
                } else if (spinner_smart.getSelectedItem().equals("MSP100")) {
                    ket_smart.setText("SMARTPLAN GOLD | 5GB (4G) | 30 Hari | Bonus Telepon ke semua 10Menit,Telepon sesama 100Menit,100SMS ke semua,Up Size Kuota 1GB+Kuota Chat 1GB (Line,Whatsapp,BBM)+Kuota Streaming 10GB(KlikFilm, Genflix, Moviebay, Siaranku)");
                    harga_smart.setText(textharga + " 108,000");
                } else if (spinner_smart.getSelectedItem().equals("MSP150")) {
                    ket_smart.setText("SMARTPLAN PLATINUM | 9GB (4G) | 30 Hari | Bonus Telepon ke semua 10Menit,Telepon sesama 100Menit,SMS ke semua 100SMS,Up Size Kuota 1GB+Kuota Chat 1GB (Line,Whatsapp,BBM)+Kuota Streaming 15GB(KlikFilm, Genflix, Moviebay, Siaranku)");
                    harga_smart.setText(textharga + " 159,000");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        beli_smart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nohp_smart.getText().toString().equals("")) {
                    nohp_smart.setError("Masukkan No HP!");
                } else {
                    showDialog();
                }
            }
        });
    }

    public void showDialog(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder
                .setMessage("Paket Data "+spinner_smart.getSelectedItem().toString()+" ke nomor "+nohp_smart.getText()+" akan segera diproses!")
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