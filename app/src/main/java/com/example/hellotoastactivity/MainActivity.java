package com.example.hellotoastactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE";
    private int mCount = 0;
    private TextView mShowCount;
    private TextView mMessageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        mMessageEditText = findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Log.i("INFO", "Show Toast clicked");

        Toast toast = Toast.makeText(this, "Hello", Toast.LENGTH_SHORT);
        toast.show();

        String message = mMessageEditText.getText().toString();

        Intent intent =new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);


    }

    public void countUp(View view) {
        mCount++;

        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }


}