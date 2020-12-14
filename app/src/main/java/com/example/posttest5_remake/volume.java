package com.example.posttest5_remake;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class volume extends AppCompatActivity {
     EditText Sisi1,Sisi2,Tinggi;
     TextView Resultvol;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);

        Sisi1 = (EditText) findViewById(R.id.sisi1);
        Sisi2 = (EditText) findViewById(R.id.sisi2);
        Tinggi = (EditText) findViewById(R.id.tinggi);
        Resultvol = (TextView) findViewById(R.id.resultvol);

       Button hit = findViewById(R.id.button);
       hit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (Sisi1.getText().toString().length() == 0) {
                   Sisi1.setText("0");
               }
               if (Sisi2.getText().toString().length() == 0) {
                   Sisi1.setText("0");
               }
               if (Tinggi.getText().toString().length() == 0) {
                   Sisi1.setText("0");
               }
               float p = Float.parseFloat(Sisi1.getText().toString());
               float l = Float.parseFloat(Sisi2.getText().toString());
               float t = Float.parseFloat(Tinggi.getText().toString());
               float volume = (p * l * t) / 3;
               Resultvol.setText(String.valueOf(volume));
           }
       });
    }
}