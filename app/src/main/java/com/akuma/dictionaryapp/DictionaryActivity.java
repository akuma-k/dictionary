package com.akuma.dictionaryapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.akuma.dictionary.GetMeaning;

public class DictionaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GetMeaning meaning = new GetMeaning();
        meaning.getMeaning("Hello");
    }
}
