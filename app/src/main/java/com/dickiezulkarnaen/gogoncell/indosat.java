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

public class indosat extends AppCompatActivity {
    TextView ket_indosat, harga_indosat;
    EditText nohp_indosat;
    Button beli_indosat;
    Spinner spinner_indosat;
    String textharga = "Harga      :  Rp ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indosat);

        ket_indosat = (TextView)findViewById(R.id.ketindosat);
        harga_indosat = (TextView)findViewById(R.id.hargaindosat);
        nohp_indosat = (EditText)findViewById(R.id.nohpindosat);
        beli_indosat = (Button)findViewById(R.id.beliindosat);
        spinner_indosat = (Spinner)findViewById(R.id.spinnerindosat);

        spinner_indosat.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (spinner_indosat.getSelectedItem().equals("IFR2")) {
                    ket_indosat.setText("FREEDOM COMBO M | 5GB -> 2GB (3G/4G)+3GB (4G) | 30 Hari |Telepon Sesama 5000Menit+500 SMS Sesama+Spotify Premium 1bln pertama+1,5GB Stream ON VIDEO,SOSMED,CHAT ");
                    harga_indosat.setText(textharga + " 54,000");
                } else if (spinner_indosat.getSelectedItem().equals("IFR4")) {
                    ket_indosat.setText("FREEDOM COMBO L | 12GB | 30 Hari | 4GB (3G/4G)+8GB (4G) + Telepon Sesama 5000Menit+500 SMS Sesama+Spotify Premium 1bln ");
                    harga_indosat.setText(textharga + " 88,000");
                } else if (spinner_indosat.getSelectedItem().equals("IFR8")) {
                    ket_indosat.setText("FREEDOM COMBO XL | 20GB -> 8GB (3G/4G)+12GB (4G) | 30 Hari | Telepon Sesama 5000Menit+500 SMS Sesama+Spotify Premium 1bln pertama+3,5GB Stream ON VIDEO,SOSMED,CHAT ");
                    harga_indosat.setText(textharga + " 137,000");
                } else if (spinner_indosat.getSelectedItem().equals("IFR12")) {
                    ket_indosat.setText("FREEDOM COMBO XXL | 37GB -> 12GB (3G/4G)+25GB (4G) | 30 Hari | Telepon Sesama 5000Menit+500 SMS Sesama+Spotify Premium 1bln pertama+5,5GB Stream ON VIDEO,SOSMED,CHAT ");
                    harga_indosat.setText(textharga + "182,000");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        beli_indosat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nohp_indosat.getText().toString().equals("")) {
                    nohp_indosat.setError("Masukkan No HP!");
                } else {
                    showDialog();
                }
            }
        });
    }

    public void showDialog(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder
                .setMessage("Paket Data "+spinner_indosat.getSelectedItem().toString()+" ke nomor "+nohp_indosat.getText()+" akan segera diproses!")
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