package com.example.counterhomework;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mCount;
    private TextView mCountshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCountshow = (TextView) findViewById(R.id.counter);
        if (savedInstanceState != null){
            String i = savedInstanceState.getString("count");
            mCountshow.setText(i);
            mCount = Integer.parseInt(i);
        }
    }

    public void countUp(View view) {
        mCount++;

        if (mCountshow != null){
            mCountshow.setText(Integer.toString(mCount));
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("count", mCountshow.getText().toString());
    }
}