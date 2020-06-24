package com.example.english;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class numero extends AppCompatActivity {
    MediaPlayer md;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero2);
    }

    public void n1(View view) {
        md = MediaPlayer.create(this, R.raw.one);
        md.start();

    }

    public void n2(View view) {
        md = MediaPlayer.create(this, R.raw.two);
        md.start();
    }

    public void n3(View view) {
        md = MediaPlayer.create(this, R.raw.three);
        md.start();
    }

    public void n4(View view) {
        md = MediaPlayer.create(this, R.raw.four);
        md.start();
    }

    public void n5(View view) {
        md = MediaPlayer.create(this, R.raw.five);
        md.start();
    }

    public void n6(View view) {
        md = MediaPlayer.create(this, R.raw.six);
        md.start();
    }

    public void n7(View view) {
        md = MediaPlayer.create(this, R.raw.seven);
        md.start();
    }

    public void n9(View view) {
        md = MediaPlayer.create(this, R.raw.nine);
        md.start();
    }

    public void n10(View view) {
        md = MediaPlayer.create(this, R.raw.ten);
        md.start();
    }

    public void n8(View view) {
        md = MediaPlayer.create(this, R.raw.eight);
        md.start();
    }
}
