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

public class three extends AppCompatActivity {
    TextView ket_three, harga_three;
    EditText nohp_three;
    Button beli_three;
    Spinner spinner_three;
    String textharga = "Harga      :  Rp ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        ket_three = (TextView)findViewById(R.id.ketthree);
        harga_three = (TextView)findViewById(R.id.hargathree);
        nohp_three = (EditText)findViewById(R.id.nohpthree);
        beli_three = (Button)findViewById(R.id.belithree);
        spinner_three = (Spinner)findViewById(R.id.spinnerthree);

        spinner_three.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (spinner_three.getSelectedItem().equals("TIK1")) {
                    ket_three.setText("ISI ULANG AON | 2GB -> KUOTA 1GB (3G/4G)+1GB(4G)7 Hari | M.a ikut kuota utama | -");
                    harga_three.setText(textharga + " 24,000");
                } else if (spinner_three.getSelectedItem().equals("TIK2")) {
                    ket_three.setText("ISI ULANG AON | 6GB -> KUOTA 2GB (3G/4G)+4GB(4G)7 Hari | M.a ikut kuota utama | -");
                    harga_three.setText(textharga + " 41,000");
                } else if (spinner_three.getSelectedItem().equals("TIK3")) {
                    ket_three.setText("ISI ULANG AON | 9GB -> KUOTA 3GB (3G/4G)+6GB(4G)7 Hari | M.a ikut kuota utama | -");
                    harga_three.setText(textharga + " 52,000");
                } else if (spinner_three.getSelectedItem().equals("TIK4")) {
                    ket_three.setText("ISI ULANG AON | 12GB -> KUOTA 4GB (3G/4G)+8GB(4G)15 Hari | M.a ikut kuota utama | -");
                    harga_three.setText(textharga + " 60,000");
                } else if (spinner_three.getSelectedItem().equals("TIK5")) {
                    ket_three.setText("ISI ULANG AON | 15GB -> KUOTA 5GB (3G/4G)+10GB(4G)15 Hari | M.a ikut kuota utama | -");
                    harga_three.setText(textharga + " 76,000");
                } else if (spinner_three.getSelectedItem().equals("TIK6")) {
                    ket_three.setText("ISI ULANG AON | 18GB -> KUOTA 6GB (3G/4G)+12GB(4G)30 Hari | M.a ikut kuota utama | -");
                    harga_three.setText(textharga + " 84,000");
                } else if (spinner_three.getSelectedItem().equals("TIK8")) {
                    ket_three.setText("ISI ULANG AON | 24GB -> KUOTA 8GB (3G/4G)+16GB(4G)30 Hari | M.a ikut kuota utama | -");
                    harga_three.setText(textharga + " 109,000");
                } else if (spinner_three.getSelectedItem().equals("TIK10")) {
                    ket_three.setText("ISI ULANG AON | 30GB -> KUOTA 10GB (3G/4G)+20GB(4G)30 Hari | M.a ikut kuota utama | -");
                    harga_three.setText(textharga + " 132,000");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        beli_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nohp_three.getText().toString().equals("")) {
                    nohp_three.setError("Masukkan No HP!");
                } else {
                    showDialog();
                }
            }
        });
    }

    public void showDialog(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder
                .setMessage("Paket Data "+spinner_three.getSelectedItem().toString()+" ke nomor "+nohp_three.getText()+" akan segera diproses!")
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