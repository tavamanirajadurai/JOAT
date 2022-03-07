package com.example.rajad.joat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Electricalworks extends AppCompatActivity {
    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry",
            "WebOS","Ubuntu","Windows7","Max OS X"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electricalworks);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, mobileArray);

        ListView listView = (ListView) findViewById(R.id.mobile_list4);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        //String value =(String)lv.getItemAtPosition(position);

                        if(position==0){
                            Intent intent=new Intent(getApplicationContext(),epay.class);
                            startActivity(intent);
                        }
                        else {
                            if (position == 1) {
                                Intent intent = new Intent(Electricalworks.this, epay.class);
                                startActivity(intent);

                            } else if (position == 2) {
                                Intent intent = new Intent(Electricalworks.this, epay.class);
                                startActivity(intent);
                            }
                        }
                    }
                });
    }
}
