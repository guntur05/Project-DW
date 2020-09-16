package com.z.guntur;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtpanjang , edtlebar;
    private TextView txthasil;
    private Button hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtpanjang= (EditText) findViewById(R.id.panjang);
        edtlebar= (EditText) findViewById(R.id.lebar);
        hasil= (Button) findViewById(R.id.hasil);
        txthasil=(TextView) findViewById(R.id.txt_hasil);

        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pjg , lbr;
                pjg = edtpanjang.getText().toString();
                lbr = edtlebar.getText().toString();

                if(TextUtils.isEmpty(pjg)){
                    edtpanjang.setError("Harap isi kolom ini !!!");
                    edtpanjang.requestFocus();
                }else if(TextUtils.isEmpty(lbr)){
                    edtlebar.setError("Tidak boleh kosong!!!");
                    edtlebar.requestFocus();
                }else{
                    double p = Double.parseDouble(pjg);
                    double l = Double.parseDouble(lbr);
                    double hasil1 = p * l;

                    txthasil.setText("hasil luas: "+hasil1);
                }
            }
        });
    }
}
