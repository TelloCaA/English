package com.example.english;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class video extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        VideoView video  = (VideoView)findViewById(R.id.videoView);
        Uri path = Uri.parse("android.resource://" + getPackageName()+ "/" + R.raw.vid);
        MediaController a = new MediaController(this);
        video.setMediaController(a);
        video.setVideoURI(path);
        video.start();

        VideoView video2  = (VideoView)findViewById(R.id.videoView2);
        Uri path1 = Uri.parse("android.resource://" + getPackageName()+ "/" + R.raw.vo);
        MediaController b = new MediaController(this);
        video2.setMediaController(b);
        video2.setVideoURI(path1);
        video2.start();



    }
}
