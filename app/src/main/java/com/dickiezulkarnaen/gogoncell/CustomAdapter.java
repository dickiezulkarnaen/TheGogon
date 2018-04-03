package com.dickiezulkarnaen.gogoncell;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.dickiezulkarnaen.gogoncell.R;

public class CustomAdapter extends ArrayAdapter<String> {

    Activity activity;
    int[] gambar;
    String[] judul;

    public CustomAdapter (Activity menuActivity, int[]gbrProvider, String[] nmProvider) {
        super(menuActivity, R.layout.list_item, nmProvider);

        activity = menuActivity;
        gambar = gbrProvider;
        judul = nmProvider;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View view = inflater.inflate(R.layout.list_item, null, true);
        TextView textnmProvider = (TextView) view.findViewById(R.id.textListView);
        ImageView gbrProvider = (ImageView) view.findViewById(R.id.gambarListView);

        textnmProvider.setText(judul[position]);
        gbrProvider.setImageResource(gambar[position]);

        return view;
    }
}
