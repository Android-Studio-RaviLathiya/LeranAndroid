package com.coin.leranandroid.WiFI;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.coin.leranandroid.R;

public class WifionoffActivity extends AppCompatActivity {

    private AppCompatButton wifiOn;
    private AppCompatButton wifiOff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifionoff);
        initView();

        wifiOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wifi.setWifiEnabled(true);
                Toast.makeText(getApplicationContext(), "WIFI On", Toast.LENGTH_SHORT).show();

            }
        });

        wifiOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wifi.setWifiEnabled(false);
                Toast.makeText(WifionoffActivity.this, "WIFI OFF", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initView() {
        wifiOn = findViewById(R.id.wifi_on);
        wifiOff = findViewById(R.id.wifi_off);
    }
}