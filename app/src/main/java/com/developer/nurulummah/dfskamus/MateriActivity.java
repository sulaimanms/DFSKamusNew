package com.developer.nurulummah.dfskamus;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MateriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);

        ActionBar menu = getSupportActionBar();
        menu.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void finish() {
        super.finish();

    }
}
