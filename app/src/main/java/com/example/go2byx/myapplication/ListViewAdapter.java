package com.example.go2byx.myapplication;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by go2byx on 2017-11-30.
 */

public class ListViewAdapter extends BaseAdapter {
    private ArrayList<ListViewItem> itemList = new ArrayList<ListViewItem>();

    public ListViewAdapter() {

    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //final int pos = position;
        final Context context = parent.getContext();

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listview_item, parent, false);
        }

        ImageView iconImageView = (ImageView)convertView.findViewById(R.id.imageView1);
        TextView titleTextView = (TextView)convertView.findViewById(R.id.textView1);
        TextView descTextView = (TextView)convertView.findViewById(R.id.textView2);

        ListViewItem item = itemList.get(position);

        iconImageView.setImageDrawable(item.getIcon());
        titleTextView.setText(item.getTitle());
        descTextView.setText(item.getDesc());

        return convertView;
    }

    @Override
    public Object getItem(int position) {
        return itemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void addItem(Drawable icon, String title, String desc) {
        ListViewItem item = new ListViewItem();

        item.setIcon(icon);
        item.setTitle(title);
        item.setDesc(desc);

        itemList.add(item);
    }
}
