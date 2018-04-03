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

public class xl extends AppCompatActivity {
    TextView ket_xl, harga_xl;
    EditText nohp_xl;
    Button beli_xl;
    Spinner spinner_xl;
    String textharga = "Harga      :  Rp ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xl);

        ket_xl = (TextView)findViewById(R.id.ketxl);
        harga_xl = (TextView)findViewById(R.id.hargaxl);
        nohp_xl = (EditText)findViewById(R.id.nohpxl);
        beli_xl = (Button)findViewById(R.id.belixl);
        spinner_xl = (Spinner)findViewById(R.id.spinnerxl);

        spinner_xl.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (spinner_xl.getSelectedItem().equals("XXC6")) {
                    ket_xl.setText("XTRA COMBO | 6GB -> 2GB + 4GB(4G) + 20 MENIT ALL + YOUTUBE | 30 Hari | 24 Jam, 2GB YOUTUBE + UNLI YOUTUBE 01-06");
                    harga_xl.setText(textharga + " 56,000");
                } else if (spinner_xl.getSelectedItem().equals("XXC12")) {
                    ket_xl.setText("XTRA COMBO | 12GB -> 4GB + 8GB(4G) + 40 MENIT ALL + YOUTUBE | 30 Hari | 24 Jam, 4GB YOUTUBE + UNLI YOUTUBE 01-06");
                    harga_xl.setText(textharga + " 81,000");
                } else if (spinner_xl.getSelectedItem().equals("XXC18")) {
                    ket_xl.setText("XTRA COMBO | 18GB -> 6GB + 12GB(4G) + 60 MENIT ALL + YOUTUBE | 30 Hari | 24 Jam, 6GB YOUTUBE + UNLI YOUTUBE 01-06");
                    harga_xl.setText(textharga + " 112,000");
                } else if (spinner_xl.getSelectedItem().equals("XXC30")) {
                    ket_xl.setText("XTRA COMBO | 30GB -> 10GB + 20GB(4G) + 100 MENIT ALL + YOUTUBE | 30 Hari | 24 Jam, 10GB YOUTUBE + UNLI YOUTUBE 01-06");
                    harga_xl.setText(textharga + " 151,000");
                } else if (spinner_xl.getSelectedItem().equals("XXC42")) {
                    ket_xl.setText("XTRA COMBO | 42GB -> 14GB + 28GB(4G) + 140 MENIT ALL + YOUTUBE | 30 Hari | 24 Jam, 14GB YOUTUBE + UNLI YOUTUBE 01-06");
                    harga_xl.setText(textharga + " 200,000");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        beli_xl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nohp_xl.getText().toString().equals("")) {
                    nohp_xl.setError("Masukkan No HP!");
                } else {
                    showDialog();
                }
            }
        });
    }

    public void showDialog(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder
                .setMessage("Paket Data "+spinner_xl.getSelectedItem().toString()+" ke nomor "+nohp_xl.getText()+" akan segera diproses!")
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