package com.myapplicationdev.android.tw_listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ModuleAdapter extends ArrayAdapter<Module> {

    private ArrayList<Module> modules;
    private Context context;
    private ImageView imageView;
    private TextView textView;

    public ModuleAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Module> objects) {
        super(context, resource, objects);
        this.modules = objects;
        this.context = context;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);

        Module currentModule = modules.get(position);

        imageView = rowView.findViewById(R.id.ivProg);
        textView = rowView.findViewById(R.id.tvModule);

        imageView.setImageResource(currentModule.getResourceImageCode());
        textView.setText(currentModule.getCode());

        return rowView;
    }
}
