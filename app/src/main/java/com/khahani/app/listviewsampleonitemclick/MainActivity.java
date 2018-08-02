package com.khahani.app.listviewsampleonitemclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Toast myToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }

        ListView listView = findViewById(R.id.listView);

        NumberAdapter adapter = new NumberAdapter(this, numbers,R.color.myBlue);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (myToast != null)
                    myToast.cancel();

                myToast = Toast.makeText(MainActivity.this, position + " Clicked", Toast.LENGTH_SHORT);
                myToast.show();
            }
        });

    }
}
