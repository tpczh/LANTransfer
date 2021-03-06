package com.czh.ffmpeg;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.czh.ffmpeg.jni.MediaKit;

public class MainActivity extends AppCompatActivity {

    private MediaKit mMediaKit = new MediaKit();
    private static final String INPUT_FILE_PATH =
            Environment.getExternalStorageDirectory().getAbsolutePath()+"/AVData/input.mp4";
    private static final String OUTPUT_FILE_PATH =
            Environment.getExternalStorageDirectory().getAbsolutePath()+"/AVData/out.yuv";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.text_view);
        //tv.setText(mMediaKit.getAvcodecConfiguration());
        tv.setText("out = " + OUTPUT_FILE_PATH + "\n\nin = " + INPUT_FILE_PATH);

    }

    public void doClick(View v) {
        switch (v.getId()) {
            case R.id.decode_btn:
                //mMediaKit.decode(INPUT_FILE_PATH, OUTPUT_FILE_PATH);
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;
            case R.id.texture_test_btn:
                //VideoGridActivity.startActivity(this);
                Intent intent2 = new Intent(this, ThirdActivity.class);
                startActivity(intent2);
                break;
        }
    }
}
