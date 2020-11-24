package com.coin.leranandroid.Pogressbar;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.coin.leranandroid.R;

public class PogressbarActivity extends AppCompatActivity {

    private TextView textView;
    private Button button1;
    private TextView textView1;
    private Button button2;
    ProgressDialog progress1, progress2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pogressbar);
        initView();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                progress1 = new ProgressDialog(PogressbarActivity.this);
                progress1.setMessage("Downloading Progress bar demo horizontal");
                progress1.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                progress1.setIndeterminate(true);
                progress1.setProgress(0);
                progress1.show();

                final int totalProgressTime = 100;
                final Thread t = new Thread() {
                    @Override
                    public void run() {
                        int jumpTime = 0;

                        while (jumpTime < totalProgressTime) {
                            try {
                                sleep(200);
                                jumpTime += 5;
                                progress1.setProgress(jumpTime);

                            } catch (InterruptedException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                        }
                    }
                };
                t.start();
            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progress1 = new ProgressDialog(PogressbarActivity.this);
                progress1.setMessage("Downloading Progress Spinner");
                progress1.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                progress1.setIndeterminate(true);
                progress1.setProgress(0);
                progress1.show();

                final int totalProgressTime = 100;
                final Thread t = new Thread() {
                    @Override
                    public void run() {
                        int jumpTime = 0;

                        while (jumpTime < totalProgressTime) {
                            try {
                                sleep(200);
                                jumpTime += 5;
                                progress1.setProgress(jumpTime);
                            } catch (InterruptedException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                        }
                    }
                };
                t.start();
            }
        });


    }

    private void initView() {
        textView = findViewById(R.id.textView);
        button1 = findViewById(R.id.button1);
        textView1 = findViewById(R.id.textView1);
        button2 = findViewById(R.id.button2);
    }
}