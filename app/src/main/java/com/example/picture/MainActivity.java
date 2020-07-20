package com.example.picture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void clickNext(View view){
        ImageView image = (ImageView) findViewById(R.id.image1);
        image.setImageResource(R.drawable.tom);
        Button prev = (Button) findViewById(R.id.prev);
        Button next = (Button) findViewById(R.id.Next);
        prev.setClickable(true);
        next.setClickable(false);
    }

    public void clickPrev(View view){
        ImageView image = (ImageView) findViewById(R.id.image1);
        image.setImageResource(R.drawable.minion);
        Button next = (Button) findViewById(R.id.Next);
        Button prev = (Button) findViewById(R.id.prev);
        next.setClickable(true);
        prev.setClickable(false);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}