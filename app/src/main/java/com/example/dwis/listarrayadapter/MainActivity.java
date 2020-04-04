package com.example.dwis.listarrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Array of strings...
    ListView simpleList;
    String departmentList[] = {"CSE","ECE","EEE","IT","MECH","FT","CIVIL"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        final TextView tv = (TextView) findViewById(R.id.tv);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_list_view, R.id.textView, departmentList);
        simpleList.setAdapter(arrayAdapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem=(String) parent.getItemAtPosition(position);
                tv.setText("Your Department :"+ selectedItem);
                switch(position) {
                    case 0:
                        Intent cse = new Intent(MainActivity.this, Cse.class);
                        startActivity(cse);
                        break;
                    case 1:
                        Intent Ece = new Intent(MainActivity.this, Ece.class);
                        startActivity(Ece);
                        break;
                    case 2:
                        Intent pieceOfCake = new Intent(MainActivity.this, Eee.class);
                        startActivity(pieceOfCake);
                        break;
                    case 3:
                        Intent it = new Intent(MainActivity.this, It.class);
                        startActivity(it);
                        break;
                    case 4:
                        Intent mech = new Intent(MainActivity.this, Mech.class);
                        startActivity(mech);
                        break;
                    case 5:
                        Intent ft = new Intent(MainActivity.this, Ft.class);
                        startActivity(ft);
                        break;
                    case 6:
                        Intent Ci = new Intent(MainActivity.this, Civil.class);
                        startActivity(Ci);
                        break;
                            }
             }

            });
        }
    }


