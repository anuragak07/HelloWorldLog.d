package com.masai.helloworldlogd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Anurag","onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Anurag","onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Anurag","onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Anurag","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Anurag","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Anurag","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Anurag","onDestroy");
    }
}