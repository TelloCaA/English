package com.example.english;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class animal extends AppCompatActivity {
    MediaPlayer md;
    int pos=0;
    RadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10;
    int con;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        r1 = (RadioButton)findViewById(R.id.radioButton);
        r2 = (RadioButton)findViewById(R.id.radioButton2);
        r3 = (RadioButton)findViewById(R.id.radioButton3);
        r4 = (RadioButton)findViewById(R.id.radioButton4);
        r5 = (RadioButton)findViewById(R.id.radioButton5);
        r6 = (RadioButton)findViewById(R.id.radioButton6);
        r7 = (RadioButton)findViewById (R.id.radioButton7);
        r8 = (RadioButton)findViewById(R.id.radioButton8);
        r9 = (RadioButton)findViewById(R.id.radioButton9);
        r10=(RadioButton)findViewById(R.id.radioButton10);

    }

    public void e2(View view) {
        md = MediaPlayer.create(this, R.raw.e);
        if(md != null && md.isPlaying()==false) {
            md.seekTo(pos);
            md.start();
        }
    }

    public void l3(View view) {
        md = MediaPlayer.create(this, R.raw.ca);
        if(md != null && md.isPlaying()==false) {
            md.seekTo(pos);
            md.start();
        }
    }

    public void g4(View view) {
        md = MediaPlayer.create(this, R.raw.gato);
        if(md != null && md.isPlaying()==false) {
            md.seekTo(pos);
            md.start();

        }
    }


    public void v5(View view) {
        md = MediaPlayer.create(this, R.raw.vaca);
        if(md != null && md.isPlaying()==false) {
            md.seekTo(pos);
            md.start();
        }
    }

    public void p1(View view) {
        md = MediaPlayer.create(this, R.raw.p);
        if(md != null && md.isPlaying()==false) {
            md.seekTo(pos);
            md.start();
        }
    }



    public void ac(View view) {
        if (r1.isChecked()){
            con = con + 1 ;
        }
        if (r4.isChecked()){
            con = con + 1 ;
        }
        if (r6.isChecked()){
            con = con + 1 ;
        }
        if (r7.isChecked()){
            con = con + 1 ;
        }
        if (r10.isChecked()){
            con = con + 1 ;
        }

        Toast.makeText(this, "Respuestas correctas" + con, Toast.LENGTH_SHORT).show();
        con =0;
    }


}
