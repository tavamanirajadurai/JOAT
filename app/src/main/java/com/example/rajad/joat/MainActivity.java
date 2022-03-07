package com.example.rajad.joat;

import android.content.Intent;

import android.os.Bundle;

import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView card1=(CardView)findViewById(R.id.card1);
        CardView card2=(CardView)findViewById(R.id.card2);
        CardView card3=(CardView)findViewById(R.id.card3);
        CardView card4=(CardView)findViewById(R.id.card4);
        card1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(MainActivity.this,Carpentaryworks.class);
                startActivity(intent);
            }
        });
        card2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(MainActivity.this,Plumberingworks.class);
                startActivity(intent);
            }
        });
        card3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(MainActivity.this,Maisonaryworks.class);
                startActivity(intent);
            }
        });
        card4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(MainActivity.this,Electricalworks.class);
                startActivity(intent);
            }
        });
        }
    }

