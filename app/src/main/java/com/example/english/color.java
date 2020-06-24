package com.example.english;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class color extends AppCompatActivity {
    MediaPlayer md;
    int con ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
    }

    public void s1(View view) {
        md = MediaPlayer.create(this, R.raw.ama);
        md.start();
    }
    public void pasar(){
        Intent intent = new Intent(color.this,colors2.class);
        intent.putExtra("res",con);
        startActivity(intent);
    }

    public void a1(View view) {
        con =1;
        pasar();

    }

    public void az2(View view) {
        con =0;
        pasar();
    }

    public void c3(View view) {
        con =0;
        pasar();
    }

    public void n4(View view) {
        con =0;
        pasar();
    }
}
