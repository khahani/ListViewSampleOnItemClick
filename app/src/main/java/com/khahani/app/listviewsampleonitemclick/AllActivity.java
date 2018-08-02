package com.khahani.app.listviewsampleonitemclick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AllActivity extends AppCompatActivity
implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);

        Button color = findViewById(R.id.color);
        Button main = findViewById(R.id.main);

        color.setOnClickListener(this);
        main.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        Intent intent = null;
        switch (id){
            case R.id.color:
                intent = new Intent(AllActivity.this, ColorActivity.class);
            break;
            case R.id.main:
                intent = new Intent(AllActivity.this, MainActivity.class);
                break;
        }

        startActivity(intent);
    }
}
