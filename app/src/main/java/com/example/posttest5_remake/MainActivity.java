package com.example.posttest5_remake;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "mainactivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
        Toast.makeText(MainActivity.this, "welcome", Toast.LENGTH_SHORT).show();
    }


    public void kevolume() {
        Intent pindahvolume = new Intent(MainActivity.this, volume.class);
        startActivity(pindahvolume);
    }
    public void kebiodata(){
        Intent pindahbiodata = new Intent(MainActivity.this, biodata.class);
        startActivity(pindahbiodata);
    }
    public void kefavorite(){
        Intent pindahfavorite = new Intent(MainActivity.this, favorite.class);
        startActivity(pindahfavorite);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.praktikum:
                kevolume();
                return true;
            case R.id.biodata:
                kebiodata();
                return true;
            case R.id.favorite:
                kefavorite();
                return true;

        }

        return false;
    }
}


