package com.example.blackbox20;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        VideoView videoView = (VideoView)findViewById(R.id.video);

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/raw/sample");
        // 파일에 저장되어있는 영상이 출력될 수 있도록 연결
        videoView.setMediaController(new MediaController(this));
        videoView.setVideoURI(uri);
        videoView.start();
        // 바로 재생되도록 함
    }
}