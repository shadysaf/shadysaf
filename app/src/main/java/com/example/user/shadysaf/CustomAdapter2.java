package com.example.user.shadysaf;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class CustomAdapter2 extends ArrayAdapter<Item2>{
    private int resourcelLayout;
    private Context mContext;

    public CustomAdapter2(@NonNull Context context, int resource, ArrayAdapter<Item2> objects) {
        super(context, resource);
        this.resourcelLayout = resource;
        this.mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
