package com.example.rajad.joat;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class cpay extends AppCompatActivity {
    TextView textView;
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpay);
        textView = (TextView) findViewById(R.id.textView3);
        textView1 = (TextView) findViewById(R.id.textVieww);
        String Tempholder = getIntent().getStringExtra("clist");
        String Wageholder = getIntent().getStringExtra("wlist");
        textView.setText(Tempholder);
        textView1.setText(Wageholder);
        Button probtn = (Button) findViewById(R.id.cpayb);
        probtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(cpay.this,User.class);
                startActivity(intent);
            }
        });

    }

}

