package com.example.english;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void m1(View view) {
        Intent intent = new Intent(MainActivity.this,color.class);
        startActivity(intent);
    }

    public void m2(View view) {
        Intent intent = new Intent(MainActivity.this,animal.class);
        startActivity(intent);
    }

    public void m3(View view) {
        Intent intent = new Intent(MainActivity.this,numero.class);
        startActivity(intent);
    }

    public void m4(View view) {
        Intent intent = new Intent(MainActivity.this,video.class);
        startActivity(intent);

    }
}
