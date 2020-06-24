package com.example.english;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class colors3 extends AppCompatActivity {
    MediaPlayer md;
    int con ;
    int aci =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors3);
        Bundle bundle=getIntent().getExtras();
        aci = bundle.getInt("res1");

    }

    public void s3(View view) {
        md = MediaPlayer.create(this, R.raw.pur);
        md.start();
    }
    public void pasar(){
        Intent intent = new Intent(colors3.this,MainActivity.class);
        startActivity(intent);
    }

    public void per(View view) {
        con =1+ aci;
        Toast.makeText(this, "llevas " + aci +" respuestas correctas de 3", Toast.LENGTH_SHORT).show();
    }

    public void az(View view) {
        con =0+ aci;

    }

    public void ne(View view) {
        con =0+ aci;

    }

    public void amar(View view) {
        con =0+ aci;

    }

    public void re(View view) {
        pasar();
    }
}
