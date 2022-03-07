package com.example.rajad.joat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Plumberingworks extends AppCompatActivity {
    String[] pArray = {"Tap","Wash Bashin"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plumberingworks);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, pArray);

        ListView listView = (ListView) findViewById(R.id.mobile_list2);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        //String value =(String)lv.getItemAtPosition(position);

                        if(position==0){
                            Intent intent=new Intent(getApplicationContext(),ppay.class);
                            startActivity(intent);
                        }

                    }
                });
    }
}
