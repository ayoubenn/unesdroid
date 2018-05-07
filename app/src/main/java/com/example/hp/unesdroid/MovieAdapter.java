package com.example.hp.unesdroid;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hp.unesdroid.R;

import java.util.ArrayList;

/**
 * Created by hp on 27/02/2018.
 */

public class MovieAdapter extends ArrayAdapter<Movie> {

    private ArrayList<Movie> movies = new ArrayList<>();
    private Context context;

    public MovieAdapter(Context context, int ressouce, ArrayList<Movie> movies){
        super(context, ressouce, movies);
        this.movies=movies;
        this.context=context;
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView =inflater.inflate(R.layout.activity_debut1, parent, false);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.cover);
        imageView.setBackgroundResource(movies.get(position).getImageID());
        TextView viewTitle = (TextView) convertView.findViewById(R.id.title);
        viewTitle.setText(movies.get(position).getTitle());

        return convertView;
    }
}

