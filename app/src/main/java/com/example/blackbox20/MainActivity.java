package com.example.blackbox20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button homepage = findViewById(R.id.homepage_btn);
        homepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "홈페이지로 이동", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
                startActivity(intent);
            }
        });
        // 블랙박스 제조 홈페이지 이동 (테스트를 위해 네이버로 연결)

        Button realtime = findViewById(R.id.realtime_btn);
        realtime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"실시간 영상 재생", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), VideoActivity.class);
                startActivity(intent);
            }
        });
        // 실시간 영상 재생 (전체 화면으로 출력)

        Button manage = findViewById(R.id.manage_btn);
        manage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"영상 관리", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), VideoListActivity.class);
                startActivity(intent);
            }
        });
        // 영상 관리

        Button site = findViewById(R.id.site_btn);
        site.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"위치 정보", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), GPSActivity.class);
                startActivity(intent);
            }
        });
        // 위치 정보 (미구현)

    }

}