package com.lenivenko.aleksandr.gridlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    SizeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.list);
        adapter = new SizeAdapter();
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void onResume() {
        super.onResume();


        GridLayoutManager layout = new GridLayoutManager(this, 5);
        recyclerView.setLayoutManager(layout);

        layout.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return adapter.getItem(position).getLength();
            }
        });

        List<RowItem> list = new ArrayList<>();
        list.add(new SizeModel(5, "hi"));
        list.add(new SizeModel(5, "Hello"));
        list.add(new SizeModel(3, "HEE"));
        list.add(new SizeModel(5,"Long1"));
        list.add(new SizeModel(5,"Long2"));
        adapter.setList(list);
    }
}
