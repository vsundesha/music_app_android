package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class SongActivity extends AppCompatActivity {

    String passedName = null;
    String passedDuration = null;
    String passedArtist = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        passedName=getIntent().getStringExtra("name");
        TextView name=(TextView)findViewById(R.id.name);
        name.setText(passedName);
        passedDuration=getIntent().getStringExtra("duration");
        TextView duration=(TextView)findViewById(R.id.duration);
        duration.setText(passedDuration);
        passedArtist=getIntent().getStringExtra("artist");
        TextView artist=(TextView)findViewById(R.id.artist);
        artist.setText(passedArtist);
        System.out.println(passedArtist+""+passedDuration+""+passedName);


    }
}
