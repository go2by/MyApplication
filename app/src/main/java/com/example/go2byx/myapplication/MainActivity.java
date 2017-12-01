package com.example.go2byx.myapplication;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    static final String[] LIST_MENU = {"LIST1", "LIST2", "LIST3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListViewAdapter adapter = new ListViewAdapter();

        ListView listView = (ListView)findViewById(R.id.listview1);
        listView.setAdapter(adapter);

        adapter.addItem(null, "Box", "Account Box Black 36dp");
        adapter.addItem(null, "Circle", "Account Circle Black 36dp");
        adapter.addItem(null, "Ind", "Assignment Ind Black 36dp");

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                ListViewItem item = (ListViewItem)parent.getItemAtPosition(position);

                String title = item.getTitle();
                String desc = item.getDesc();
                Drawable icon = item.getIcon();
            }
        });
    }
}
