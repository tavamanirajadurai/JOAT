package com.example.rajad.joat;

import android.content.Intent;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class Carpentaryworks extends AppCompatActivity {
    String[] cArray = {"Wooden partition","Mesh","Making Wooden Bed","Making Wooden Chair",
            "Door Stopper","Handle","Door Chain","Door Latch","Hinges","Door Peephole","Locks","Furniture Repair","Mosquitoes Netting"
             ,"Full Home Health Check"};
    String[] wage={"ESTIMATED WAGES 100-190","ESTIMATED WAGES 100-190","ESTIMATED WAGES 100-190","ESTIMATED WAGES 100-190","ESTIMATED WAGES 100-190",
            "ESTIMATED WAGES 100-190","ESTIMATED WAGES 100-190","ESTIMATED WAGES 100-190","ESTIMATED WAGES 100-190","ESTIMATED WAGES 100-190",
            "ESTIMATED WAGES 100-190","ESTIMATED WAGES 100-190","ESTIMATED WAGES 100-190","ESTIMATED WAGES 100-190"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carpentaryworks);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, cArray);

        ListView listView = (ListView) findViewById(R.id.clist);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        //String value =(String)lv.getItemAtPosition(position);

                        if(position==0 || position==1||position==2 ||position==3 ||position==4 ||position==5 ||position==6
                        ||position==7||position==8 ||position==9 ||position==10 ||position==11 ||position==12
                        ||position==13){
                            String Templist=cArray[position].toString();
                            String wagelist=wage[position].toString();
                            Intent intent=new Intent(getApplicationContext(),cpay.class);
                            intent.putExtra("clist",Templist);
                            intent.putExtra("wlist",wagelist);
                            startActivity(intent);
                        }

                    }
                });

    }
}
