package com.coin.leranandroid.ExplosionImage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.coin.leranandroid.R;

import tyrantgit.explosionfield.ExplosionField;

public class ExplosionImageActivity extends AppCompatActivity {

    ExplosionField explosionField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explosion_image);

//        https://github.com/tyrantgit/ExplosionField

        explosionField = ExplosionField.attach2Window(this);
        addListioner(findViewById(R.id.explode_layout));
        Button btn = findViewById(R.id.reset_btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View root = findViewById(R.id.explode_layout);

                explosionField.clear();
                reset(root);
                addListioner(root);

            }

        });

    }

    private void reset(View root) {
        if (root instanceof ViewGroup) {
            ViewGroup parent = (ViewGroup) root;
            for (int i = 0; i < parent.getChildCount(); i++) {
                reset(parent.getChildAt(i));

            }

        } else {
            root.setScaleX(1);
            root.setScaleY(1);
            root.setAlpha(1);

        }

    }

    private void addListioner(View root) {
        if (root instanceof ViewGroup) {
            ViewGroup parent = (ViewGroup) root;
            for (int i = 0; i < parent.getChildCount(); i++) {
                addListioner(parent.getChildAt(i));
            }
        } else {

            root.setClickable(true);

            root.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    explosionField.explode(v);
                }
            });
        }
    }
}