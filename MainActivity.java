package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private Integer counter = 0;
    private Integer numberSize = 130;
    private Integer lastcounter = 100;
    public static final String TAG = "StartActivity";
    private Integer count = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate()", Toast.LENGTH_LONG).show();
    }
    public void onClickBtnAddStudents(View view) {
        counter++;
        if(lastcounter == counter){
            lastcounter = counter * 10;
            numberSize -= 5;
        }
        TextView counterView = (TextView)findViewById(R.id.txt_counter);
        counterView.setText(counter.toString());
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
        resetUI();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onStart()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onResume()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onPause()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onStop()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onRestart()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onDestroy()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count", count);
        Log.d(TAG, "onSaveInstanceState");
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onInstanceState()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("count")) {
            count = savedInstanceState.getInt("count");
        }
        Log.d(TAG, "onRestoreInstanceState");
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onRestoreInstanceState()", Toast.LENGTH_LONG).show();
    }

    private void resetUI() {
        ((TextView) findViewById(R.id.txt_counter)).setText(count.toString());
        Log.d(TAG, "resetUI");
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onResetUI()", Toast.LENGTH_LONG).show();
    }
}