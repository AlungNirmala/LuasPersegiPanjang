package com.example.hp.luas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity_Luas extends AppCompatActivity {
    TextView txtHasil;
    EditText txtPanjang, txtLebar;
    Button btnHitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__luas);

        txtHasil = (TextView)findViewById(R.id.txtHasil);
        txtPanjang = (EditText)findViewById(R.id.txtPanjang);
        txtLebar = (EditText)findViewById(R.id.txtLebar);
        btnHitung = (Button)findViewById(R.id.btnHitung);

        //Listener Button
        btnHitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int p, l, h;
                p = Integer.parseInt(txtPanjang.getText().toString());
                l = Integer.parseInt(txtLebar.getText().toString());
                h = p * l;
                txtHasil.setText("Luas Persegi Panjang : "+h);
            }
            });
        }
    }

