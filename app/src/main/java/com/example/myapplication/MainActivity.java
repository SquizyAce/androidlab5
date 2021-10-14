package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    private VideoView myvideoplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myvideoplayer =  (VideoView)findViewById(R.id.videoView2);
        Uri myVideoUri= Uri.parse( "android.resource://" + getPackageName() + "/" + R.raw.videoplayback);
        myvideoplayer.setVideoURI(myVideoUri);
        MediaController mediaController = new MediaController(this);
        myvideoplayer.setMediaController(mediaController);
        mediaController.setMediaPlayer(myvideoplayer);


        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view)
            {
                myvideoplayer.start();
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                myvideoplayer.pause();
            }
        });

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //myvideoplayer.stopPlayback();
                myvideoplayer.start();
            }
        });
    }


}