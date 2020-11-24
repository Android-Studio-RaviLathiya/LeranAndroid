package com.coin.leranandroid;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LifecycleActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        initView();

        text.setText("on Creat");
        Toast.makeText(this, "Create", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onStart() {
        super.onStart();
        text.setText("on Start");
        Toast.makeText(this, "Start", Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onResume() {
        super.onResume();

        text.setText("on Resume");
        Toast.makeText(this, "Resum", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        text.setText("on Pause");
        Toast.makeText(this, "Pause", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();

        text.setText("on Stop");
        Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show();


    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        text.setText("on Destroy");
        Toast.makeText(this, "Destroy", Toast.LENGTH_SHORT).show();


    }

    private void initView() {
        text = findViewById(R.id.text);
    }

}