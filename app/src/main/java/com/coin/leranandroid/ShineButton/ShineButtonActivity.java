package com.coin.leranandroid.ShineButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.coin.leranandroid.R;
import com.sackcentury.shinebuttonlib.ShineButton;

public class ShineButtonActivity extends AppCompatActivity {

    private ShineButton poImage1;
    private ShineButton poImage2;
    private ShineButton poImage3;
    private ShineButton poImage4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shine_button);
//        https://github.com/ChadCSong/ShineButton
        initView();

        poImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ShineButtonActivity.this, "Like", Toast.LENGTH_SHORT).show();
            }
        });

        poImage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ShineButtonActivity.this, "Heart", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initView() {
        poImage1 = findViewById(R.id.po_image1);
        poImage2 = findViewById(R.id.po_image2);
        poImage3 = findViewById(R.id.po_image3);
        poImage4 = findViewById(R.id.po_image4);
    }
}