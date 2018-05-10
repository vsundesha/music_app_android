/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.music;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("hello bells",3.45,"acbc"));
        songs.add(new Song("parafries city",2.43,"gun and rose"));
        songs.add(new Song("sweet home albania",4.40,"lizard sizard"));
        songs.add(new Song("aint talkin bout hate",3.00,"van helsing"));
        songs.add(new Song("bright side of the sun",1.11,"yellow floyd"));
        songs.add(new Song("stone man",3.33,"Slack Babbath"));
        songs.add(new Song("when the mary cries wind",3.33,"jimmy henries"));
        songs.add(new Song("number of the feast",3.33,"iron madam"));
        songs.add(new Song("hello bells",3.45,"acbc"));
        songs.add(new Song("parafries city",2.43,"gun and rose"));
        songs.add(new Song("sweet home albania",4.40,"lizard sizard"));
        songs.add(new Song("aint talkin bout hate",3.00,"van helsing"));
        songs.add(new Song("bright side of the sun",1.11,"yellow floyd"));
        songs.add(new Song("stone man",3.33,"Slack Babbath"));
        songs.add(new Song("when the mary cries wind",3.33,"jimmy henries"));

        SongAdapter adapter = new SongAdapter(this,songs);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent numbersIntent = new Intent(MainActivity.this, SongActivity.class);
                numbersIntent.putExtra("name", String.valueOf(songs.get(i).getName()));
                numbersIntent.putExtra("duration", String.valueOf(songs.get(i).getDuration()));
                numbersIntent.putExtra("artist", String.valueOf(songs.get(i).getArtist()));
                startActivity(numbersIntent);
            }
        });
    }
}
