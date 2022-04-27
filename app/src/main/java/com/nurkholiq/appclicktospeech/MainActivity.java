package com.nurkholiq.appclicktospeech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    }

    public void btnClickToSpeech(View view) {
        int id = view.getId();
        String getIdResource;

        getIdResource = view.getResources().getResourceEntryName(id);
        int resourceIdRaw = getResources().getIdentifier(getIdResource, "raw", "com.nurkholiq.appclicktospeech");
        MediaPlayer mediaPlayer = MediaPlayer.create(this, resourceIdRaw);
        mediaPlayer.start();
        Log.i("BUTTON CLICK:", getIdResource);
        Log.i("CHECK:", String.valueOf(mediaPlayer));
    }
}