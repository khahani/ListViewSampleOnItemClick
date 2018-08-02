package com.khahani.app.listviewsampleonitemclick;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by dev on 8/2/2018.
 */

public class NumberAdapter extends ArrayAdapter<Integer> {

    private int mColor;

    public NumberAdapter(@NonNull Context context, @NonNull List<Integer> objects, int color) {
        super(context, 0, objects);
        mColor  = color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item, parent, false);
        }

        RelativeLayout container = convertView.findViewById(R.id.container);
        container.setBackgroundColor(getContext().getResources().getColor(mColor));

        int number = getItem(position);

        String numberString = Integer.toString(number);

        TextView numberTextView = convertView.findViewById(R.id.number);
        numberTextView.setText(numberString);

        ImageView imageView = convertView.findViewById(R.id.imageView);

        if (number % 2 != 0)
            imageView.setVisibility(View.INVISIBLE);
        else
            imageView.setVisibility(View.VISIBLE);

        return convertView;
    }
}
