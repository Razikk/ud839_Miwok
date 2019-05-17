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
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        // Set a clickListener on that View
        if (numbers != null) {
            numbers.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers view is clicked on.
                @Override
                public void onClick(View view) {
                    Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                    startActivity(numbersIntent);
                }
            });
        }

        // Find the view that shows the family category
        TextView family = (TextView) findViewById(R.id.family);

        // Set a clickListener on that View
        if (family != null) {
            family.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the family view is clicked on.
                @Override
                public void onClick(View view) {
                    Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                    startActivity(familyIntent);
                }
            });
        }

        //Find the view that shows the colors category
        TextView colors = (TextView) findViewById(R.id.colors);

        // Set a clickListener on that view
        if (colors != null) {
            colors.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the colors view is clicked on.
                @Override
                public void onClick(View view) {
                    Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                    startActivity(colorsIntent);
                }
            });
        }

        //Find the view that shows the phrases category
        TextView phrases = (TextView) findViewById(R.id.phrases);

        // Set a clickListener on that view
        if (phrases != null) {
            phrases.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the phrases view is clicked on.
                @Override
                public void onClick(View view) {
                    Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                    startActivity(phrasesIntent);
                }
            });
        }
    }
}
