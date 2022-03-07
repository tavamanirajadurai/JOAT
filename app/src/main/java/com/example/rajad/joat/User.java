package com.example.rajad.joat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class User extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        EditText name=(EditText)findViewById(R.id.name);
        EditText email=(EditText)findViewById(R.id.email);
        EditText mobile=(EditText)findViewById(R.id.phno);
        EditText address=(EditText)findViewById(R.id.address);
        Button track=(Button)findViewById(R.id.track);
        track.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(User.this,MapsMarkers.class);
                startActivity(intent);
            }
        });
    }
}
