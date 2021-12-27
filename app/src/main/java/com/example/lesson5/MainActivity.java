package com.example.lesson5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lesson5.fragments.FirstFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container_fragment,new FirstFragment()).commit();
        }

    }
}