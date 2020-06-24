package com.example.english;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class colors2 extends AppCompatActivity {
    MediaPlayer md;
    int con ;
    int aci =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors2);
        Bundle bundle=getIntent().getExtras();
        aci = bundle.getInt("res");
        Toast.makeText(this, "llevas " + aci +" respuestas correctas de 3", Toast.LENGTH_SHORT).show();
    }

    public void s2(View view) {
        md = MediaPlayer.create(this, R.raw.na);
        md.start();
    }
    public void pasar(){
        Intent intent = new Intent(colors2.this,colors3.class);
        intent.putExtra("res1",con);
        startActivity(intent);
    }

    public void r(View view) {
        con =0+ aci;
        pasar();
    }


    public void na(View view) {
        con =1+ aci;
        pasar();

}

    public void ama(View view) {
        con =0+ aci;
        pasar();
    }

    public void azul(View view) {
        con =0+ aci;
        pasar();
    }
}
