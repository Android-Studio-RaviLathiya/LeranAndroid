package com.coin.leranandroid.SwipSelector;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.coin.leranandroid.R;
import com.roughike.swipeselector.SwipeItem;
import com.roughike.swipeselector.SwipeSelector;

public class SwipSelectorActivity extends AppCompatActivity {

    private SwipeSelector swipeSelector;
    private SwipeSelector swipeSelector1;
    private SwipeSelector swipeSelector2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swip_selector);
        initView();
        swipeSelector.setItems(
                new SwipeItem(0, "Small", "6 Inches Pizza"),
                new SwipeItem(1, "Medium", "10 Inches Pizza"),
                new SwipeItem(2, "Large", "14 Inches Pizza")

        );

        swipeSelector1.setItems(
                new SwipeItem(0, "Tikka", "Chicken"),
                new SwipeItem(1, "Pepperoin", "chicken with pepperoin"),
                new SwipeItem(2, "Veg", "Veg")
        );


        swipeSelector2.setItems(
                new SwipeItem(0, "vfdvTikka", "gvrfvfv"),
                new SwipeItem(1, "dfvdfvPepperoin", "dfvbfdvb"),
                new SwipeItem(2, "dfvdvVeg", "fdvf")
        );

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SwipeItem swipeItem = swipeSelector.getSelectedItem();
                SwipeItem swipeItem1 = swipeSelector1.getSelectedItem();
                SwipeItem swipeItem2 = swipeSelector2.getSelectedItem();

                Toast.makeText(SwipSelectorActivity.this, "" + swipeItem.title + "\n" + swipeItem1.title + "\n" + swipeItem2.title, Toast.LENGTH_SHORT).show();

            }
        });

    }

    private void initView() {
        swipeSelector = findViewById(R.id.swipeSelector);
        swipeSelector1 = findViewById(R.id.swipeSelector1);
        swipeSelector2 = findViewById(R.id.swipeSelector2);
        button = findViewById(R.id.button);
    }
}