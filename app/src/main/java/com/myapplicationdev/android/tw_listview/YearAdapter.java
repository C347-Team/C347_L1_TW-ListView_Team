package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class YearAdapter extends ArrayAdapter<Year> {
    private ArrayList<Year> years;
    private Context context;
    private TextView textView;

    public YearAdapter(@NonNull Context context, int resource, ArrayList<Year> years) {
        super(context, resource, years);
        this.years = years;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.year, parent, false);

        Year currentYear = years.get(position);

        textView = rowView.findViewById(R.id.tvYearName);
        textView.setText(currentYear.getYear());

        return rowView;
    }
}
