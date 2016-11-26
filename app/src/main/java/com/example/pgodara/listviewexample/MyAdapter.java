package com.example.pgodara.listviewexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pgodara.listviewexample.R;

public class MyAdapter extends ArrayAdapter<String> {
    public MyAdapter(Context context, String[] values) {
        super(context, R.layout.row_layout_2, values);
    }

    //@NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater theInflater= LayoutInflater.from(getContext());
        View theView = theInflater.inflate(R.layout.row_layout_2,parent,false);
        String tvShow = getItem(position);
        TextView theTextView=(TextView) theView.findViewById(R.id.textview1);
         theTextView.setText(tvShow);
        ImageView theImageView=(ImageView)theView.findViewById(R.id.imageview1);
        theImageView.setImageResource(R.mipmap.dot);
        return theView;
    }
}


