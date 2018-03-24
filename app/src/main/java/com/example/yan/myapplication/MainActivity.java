package com.example.yan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("1","onCreat:");

    }
    @Override
    protected  void onStart(){
        super.onStart();
        Log.d("2","onStart:");
    }
    @Override
    protected  void onResume(){
        super.onResume();
        Log.d("3","onResume:");
    }
    @Override
    protected  void onPause(){
        super.onPause();
        Log.d("4","onPause:");
    }
    @Override
    protected  void onStop(){
        super.onStop();
        Log.d("5","onStop:");
    }
    @Override
    protected  void onDestroy(){
        super.onDestroy();
        Log.d("6","onDestroy:");
    }
}
