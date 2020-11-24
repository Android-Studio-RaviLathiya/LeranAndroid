package com.coin.leranandroid.simandmobile;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.telecom.TelecomManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.coin.leranandroid.R;

public class SimandMobileActivity extends AppCompatActivity {

    private Button simType;
    private TextView simTypeText;
    private Button phoneType;
    private TextView phoneTypeText;
    TelephonyManager telecomManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simand_mobile);
        initView();
        TelephonyManager telecomManager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);

        simType.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.P)
            @Override


            public void onClick(View v) {
                simTypeText.setText("Sim Information " + "\n"
                        + "\nOperator Code : " + telecomManager.getSimOperator().toString()
                        + "\nOperator Name : " + telecomManager.getSimOperatorName().toString()
                        + "\nSignal Strength : " + telecomManager.getSignalStrength()
                        + "\nNetwork operator name :" + telecomManager.getNetworkOperatorName());
            }

        });

        phoneType.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View v) {

                phoneTypeText.setText("Phone Information" + "\n"
                        + "\n Model number :" + Build.MODEL
                        + "\n Board :" + Build.BOARD
                        + "\n Brand :" + Build.BRAND
                        + "\n Android Version :" + Build.VERSION.RELEASE
                        + "\n API LEVEL :" + Build.VERSION.SDK_INT);
            }

        });

    }

    private void initView() {
        simType = findViewById(R.id.sim_type);
        simTypeText = findViewById(R.id.sim_type_text);
        phoneType = findViewById(R.id.phone_type);
        phoneTypeText = findViewById(R.id.phone_type_text);
    }
}

