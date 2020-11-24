package com.coin.leranandroid.Email;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.coin.leranandroid.R;

public class EmailActivity extends AppCompatActivity {

    private LinearLayout linearLayout1;
    private TextView destinationLable;
    private EditText destinationAddress;
    private TextView subjectLabel;
    private EditText subject;
    private TextView messageBodyLabel;
    private EditText messageBody;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        initView();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String subjects = subject.getText().toString();
                String message_string = messageBody.getText().toString();
                String to = destinationAddress.getText().toString();

                Intent emailActivity = new Intent(Intent.ACTION_SEND);

                //set up the recipient address
                emailActivity.putExtra(Intent.EXTRA_EMAIL, new String[]{to});

                //set up the email subject
                emailActivity.putExtra(Intent.EXTRA_SUBJECT, subjects);

                //you can specify cc addresses as well
                // email.putExtra(Intent.EXTRA_CC, new String[]{ ...});
                // email.putExtra(Intent.EXTRA_BCC, new String[]{ ... });

                //set up the message body
                emailActivity.putExtra(Intent.EXTRA_TEXT, message_string);

                emailActivity.setType("message/rfc822");

                startActivity(Intent.createChooser(emailActivity, "Select your Email Application :"));
            }
        });
    }

    private void initView() {
        linearLayout1 = findViewById(R.id.linearLayout1);
        destinationLable = findViewById(R.id.destinationLable);
        destinationAddress = findViewById(R.id.destinationAddress);
        subjectLabel = findViewById(R.id.subjectLabel);
        subject = findViewById(R.id.subject);
        messageBodyLabel = findViewById(R.id.message_body_label);
        messageBody = findViewById(R.id.messageBody);
        button = findViewById(R.id.button);
    }
}