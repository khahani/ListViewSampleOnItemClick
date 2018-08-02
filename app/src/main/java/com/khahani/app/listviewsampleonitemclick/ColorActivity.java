package com.khahani.app.listviewsampleonitemclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        ArrayList<Integer> colors = new ArrayList<>();
        colors.add(R.color.myBlack);
        colors.add(R.color.myBlue);
        colors.add(R.color.myRed);
        colors.add(R.color.myGreen);
        colors.add(R.color.myOrange);

        ListView colorListView = findViewById(R.id.colorListView);

        NumberAdapter adapter = new NumberAdapter(this, colors, R.color.myOrange);

        colorListView.setAdapter(adapter);

    }
}
