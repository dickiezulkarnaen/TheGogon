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

import org.w3c.dom.Text;

import java.lang.reflect.Array;

public class pulsa extends AppCompatActivity {
    TextView text_harga;
    Button btn_beli;
    Spinner spinner;
    EditText no_hp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pulsa);

        text_harga = (TextView) findViewById(R.id.textharga);
        btn_beli = (Button) findViewById(R.id.btnbeli);
        spinner = (Spinner) findViewById(R.id.spinnernominal);
        no_hp = (EditText) findViewById(R.id.nohp);



    spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            if (spinner.getSelectedItem().equals("5,000")) {
                text_harga.setText("HARGA      :  Rp 7,000");
            } else if (spinner.getSelectedItem().equals("10,000")) {
                text_harga.setText("HARGA      :  Rp 12,000");
            } else if (spinner.getSelectedItem().equals("20,000")) {
                text_harga.setText("HARGA      :  Rp 22,000");
            } else if (spinner.getSelectedItem().equals("25,000")) {
                text_harga.setText("HARGA      :  Rp 27,000");
            } else if (spinner.getSelectedItem().equals("50,000")) {
                text_harga.setText("HARGA      :  Rp 52,000");
            } else if (spinner.getSelectedItem().equals("100,000")) {
                text_harga.setText("HARGA      :  Rp 102,000");
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
        }
    });

    btn_beli.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            if (no_hp.getText().toString().equals("")) {
                no_hp.setError("Masukkan No HP!");
            } else {
                showDialog();
            }
        }
    });
}
    public void showDialog() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder
                .setMessage("Pulsa "+spinner.getSelectedItem().toString()+" ke nomor "+no_hp.getText()+" akan segera diproses!")
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

