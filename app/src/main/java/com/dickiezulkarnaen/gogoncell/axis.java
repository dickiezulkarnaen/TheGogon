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

public class axis extends AppCompatActivity {
    TextView ket_axis, harga_axis;
    EditText nohp_axis;
    Button beli_axis;
    Spinner spinner_axis;
    String textharga = "Harga      :  Rp ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_axis);

        ket_axis = (TextView)findViewById(R.id.ketaxis);
        harga_axis = (TextView)findViewById(R.id.hargaaxis);
        nohp_axis = (EditText)findViewById(R.id.nohpaxis);
        beli_axis = (Button)findViewById(R.id.beliaxis);
        spinner_axis = (Spinner)findViewById(R.id.spinneraxis);

        spinner_axis.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (spinner_axis.getSelectedItem().equals("AXK1")) {
                    ket_axis.setText("BRONET KUOTA | 1GB (3G) | 30 Hari | 24 Jam");
                    harga_axis.setText(textharga+" 26,000");
                } else if (spinner_axis.getSelectedItem().equals("AXK2")) {
                    ket_axis.setText("BRONET KUOTA | 2GB (3G) | 60 Hari | 24 Jam");
                    harga_axis.setText(textharga+" 34,000");
                } else if (spinner_axis.getSelectedItem().equals("AXK3")) {
                    ket_axis.setText("BRONET KUOTA | 3GB (3G) | 60 Hari | 24 Jam");
                    harga_axis.setText(textharga+" 43,000");
                } else if (spinner_axis.getSelectedItem().equals("AXK5")) {
                    ket_axis.setText("BRONET KUOTA | 5GB (3G) | 60 Hari | 24 Jam");
                    harga_axis.setText(textharga+" 63,000");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        beli_axis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nohp_axis.getText().toString().equals("")) {
                    nohp_axis.setError("Masukkan No HP!");
                } else {
                    showDialog();
                }
            }
        });
    }

    public void showDialog(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder
                .setMessage("Paket Data "+spinner_axis.getSelectedItem().toString()+" ke nomor "+nohp_axis.getText()+" akan segera diproses!")
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
