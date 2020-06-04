package com.example.task_03;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;

import java.io.File;

public class recorder extends AppCompatActivity {
    MediaRecorder mediaRecorder;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recorder);
        ActivityCompat.requestPermissions(this,new String[] {Manifest.permission.WRITE_EXTERNAL_STORAGE}, PackageManager.PERMISSION_GRANTED);

        ActivityCompat.requestPermissions(this,new String[] {Manifest.permission.RECORD_AUDIO}, PackageManager.PERMISSION_GRANTED);
        mediaRecorder= new MediaRecorder();
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public void startrecording(View view){
        try {

            mediaRecorder.setAudioSource(MediaRecorder.AudioSource.DEFAULT);
            mediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);

            File path= new File(Environment.getExternalStorageState(new File(Environment.DIRECTORY_DOWNLOADS)));
            File file = new File(path, "/YouTube.3gp");

            mediaRecorder.setOutputFile(file);
            mediaRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);

            mediaRecorder.prepare();
            mediaRecorder.start();
        }
        catch (Exception e){
            e.printStackTrace();
        }





    }
    public void stoprecording(View view){
        mediaRecorder.stop();
        mediaRecorder.release();

    }
}
