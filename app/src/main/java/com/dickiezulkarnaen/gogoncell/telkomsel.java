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

public class telkomsel extends AppCompatActivity {
    TextView ket_telkomsel, harga_telkomsel;
    EditText nohp_telkomsel;
    Button beli_telkomsel;
    Spinner spinner_telkomsel;
    String textharga = "Harga      :  Rp ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telkomsel);

        ket_telkomsel = (TextView)findViewById(R.id.kettelkomsel);
        harga_telkomsel = (TextView)findViewById(R.id.hargatelkomsel);
        nohp_telkomsel = (EditText)findViewById(R.id.nohptelkomsel);
        beli_telkomsel = (Button)findViewById(R.id.belitelkomsel);
        spinner_telkomsel = (Spinner)findViewById(R.id.spinnertelkomsel);

        spinner_telkomsel.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (spinner_telkomsel.getSelectedItem().equals("SG50")) {
                    ket_telkomsel.setText("SG50 TSEL DATA FLASH | 5.2GB ( Zona 6) | 30 Hari | 1.2GB (3G/4G)+1GB(00-07)+3GB VIDEO&Lggn HOOQ&VIU");
                    harga_telkomsel.setText(textharga + " 55,000");
                } else if (spinner_telkomsel.getSelectedItem().equals("SG100")) {
                    ket_telkomsel.setText("SG100 TSEL DATA FLASH | 10.5GB ( Zona 6) | 30 Hari | 3.5GB (3G/4G)+2GB(00-07)+5GB VIDEO&Lggn HOOQ&VIU");
                    harga_telkomsel.setText(textharga + " 104,000");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        beli_telkomsel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nohp_telkomsel.getText().toString().equals("")) {
                    nohp_telkomsel.setError("Masukkan No HP!");
                } else {
                    showDialog();
                }
            }
        });
    }

    public void showDialog(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder
                .setMessage("Paket Data "+spinner_telkomsel.getSelectedItem().toString()+" ke nomor "+nohp_telkomsel.getText()+" akan segera diproses!")
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