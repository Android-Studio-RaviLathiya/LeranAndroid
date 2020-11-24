package com.coin.leranandroid.SwipeCards;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.coin.leranandroid.R;
import com.lorentzos.flingswipe.SwipeFlingAdapterView;

import java.util.ArrayList;

public class SwipeCardsActivity extends AppCompatActivity {

    private SwipeFlingAdapterView frame;
    ArrayList arrayList = new ArrayList();
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_cards);

//        https://github.com/Diolor/Swipecards
        initView();


        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("6");
        arrayList.add("7");
        arrayList.add("8");
        arrayList.add("9");
        arrayList.add("10");

        arrayAdapter = new ArrayAdapter(this, R.layout.swipecard_item, R.id.texts, arrayList);
        frame.setAdapter(arrayAdapter);

        frame.setFlingListener(new SwipeFlingAdapterView.onFlingListener() {
            @Override
            public void removeFirstObjectInAdapter() {
                arrayList.remove(0);
                arrayAdapter.notifyDataSetChanged();
            }

            @Override
            public void onLeftCardExit(Object o) {
//                toast("left");
            }

            @Override
            public void onRightCardExit(Object o) {
//                toast("right");
            }

            @Override
            public void onAdapterAboutToEmpty(int i) {
                arrayList.add("XML ".concat(String.valueOf(i)));
                arrayAdapter.notifyDataSetChanged();

            }

            @Override
            public void onScroll(float v) {
//                toast("scroller ");
//                arrayAdapter.notifyDataSetChanged();

            }
        });

        frame.setOnItemClickListener(new SwipeFlingAdapterView.OnItemClickListener() {
            @Override
            public void onItemClicked(int i, Object o) {

                toast("this postions is " + o);
            }
        });


    }

    public void toast(String msg) {

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    private void initView() {
        frame = findViewById(R.id.frame);
    }
}