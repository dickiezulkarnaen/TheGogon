package com.dickiezulkarnaen.gogoncell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtUser, txtPass;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUser = (EditText) findViewById(R.id.user);
        txtPass = (EditText) findViewById(R.id.pass);
        btnlogin = (Button) findViewById(R.id.login);

        txtPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtPass.setText("1234");
            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtUser.getText().toString().equals("")) {
                    txtUser.setError("Insert Email Address");
                } else if (txtPass.getText().toString().equals("")) {
                    txtPass.setError("Insert Password");
                } else {
                    if (txtUser.getText().toString().equals("username") && txtPass.getText().toString().equals("1234")) {
                        Intent I = new Intent(getApplicationContext(), MenuUtama.class);
                        startActivity(I);
                    } else {
                        Toast.makeText(getApplicationContext(), "Incorrect Email Or Password", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
