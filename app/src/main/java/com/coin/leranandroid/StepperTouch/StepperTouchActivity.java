package com.coin.leranandroid.StepperTouch;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.coin.leranandroid.R;

import nl.dionsegijn.steppertouch.OnStepCallback;
import nl.dionsegijn.steppertouch.StepperTouch;

public class StepperTouchActivity extends AppCompatActivity {

    private StepperTouch stepperTouch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stepper_touch);

//        https://github.com/DanielMartinus/Stepper-Touch


        initView();
        stepperTouch.setMinimumHeight(50);

//        stepperTouch.valu
//
//                stepperTouch.minValue = 0
//        stepperTouch.minValue = 10
//        stepperTouch.sideTapEnabled = true
//        stepperTouch.addStepCallback(object : OnStepCallback {
//            override fun onStep(value: Int, positive: Boolean) {
//                Toast.makeText(applicationContext, value.toString(), Toast.LENGTH_SHORT).show()
//            }
//        });


    }

    private void initView() {
        stepperTouch = findViewById(R.id.stepperTouch);
    }
}
