package com.coin.leranandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.coin.leranandroid.Bluetooth.BluetoothActivity;
import com.coin.leranandroid.Discroll.DiscrollActivity;
import com.coin.leranandroid.Email.EmailActivity;
import com.coin.leranandroid.ExplosionImage.ExplosionImageActivity;
import com.coin.leranandroid.Pogressbar.PogressbarActivity;
import com.coin.leranandroid.ReadMore.ReadMoreActivity;
import com.coin.leranandroid.ShineButton.ShineButtonActivity;
import com.coin.leranandroid.StepperTouch.StepperTouchActivity;
import com.coin.leranandroid.SwipSelector.SwipSelectorActivity;
import com.coin.leranandroid.SwipeCards.SwipeCardsActivity;
import com.coin.leranandroid.WiFI.WifionoffActivity;
import com.coin.leranandroid.simandmobile.SimandMobileActivity;
import com.roughike.swipeselector.SwipeSelector;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Discroll(View view) {
        startActivity(new Intent(MainActivity.this, DiscrollActivity.class));
    }

    public void ReadMore(View view) {
        startActivity(new Intent(MainActivity.this, ReadMoreActivity.class));
    }

    public void StepperTouch(View view) {
        startActivity(new Intent(MainActivity.this, StepperTouchActivity.class));

    }

    public void SwipeCard(View view) {
        startActivity(new Intent(MainActivity.this, SwipeCardsActivity.class));

    }

    public void ExprolerImg(View view) {

        startActivity(new Intent(MainActivity.this, ExplosionImageActivity.class));

    }

    public void ShineButton(View view) {
        startActivity(new Intent(MainActivity.this, ShineButtonActivity.class));

    }

    public void SwipeItem(View view) {
        startActivity(new Intent(MainActivity.this, SwipSelectorActivity.class));

    }

    public void Email(View view) {
        startActivity(new Intent(MainActivity.this, EmailActivity.class));

    }

    public void Simandmobile(View view) {
        startActivity(new Intent(MainActivity.this, SimandMobileActivity.class));

    }

    public void Bluetooth(View view) {
        startActivity(new Intent(MainActivity.this, BluetoothActivity.class));

    }

    public void Progressbar(View view) {
        startActivity(new Intent(MainActivity.this, PogressbarActivity.class));

    }

    public void Toast(View view) {
        startActivity(new Intent(MainActivity.this,ToastActivity.class));
    }

    public void LifeCycle(View view) {
        startActivity(new Intent(MainActivity.this,LifecycleActivity.class));

    }

    public void wifionoff(View view) {
        startActivity(new Intent(MainActivity.this, WifionoffActivity.class));
    }
}