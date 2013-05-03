package com.daybysay.helloproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MyListActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		ArrayList<Row> rows= new ArrayList<Row>();
		ArrayList<RowInImage> rows = new ArrayList<RowInImage>();
		setContentView(R.layout.activity_list);
		for (int i = 0; i < 100; i++) {
			RowInImage row = new RowInImage();
			row.set_text("テキスト");
			row.set_title("タイトル");
			row.setImg(this.getResources().getDrawable(R.drawable.migi));
			rows.add(row);
		}
		RowInImageAdapter rAdapter = new RowInImageAdapter(this, rows);
		ListView list = getListView();
		list.setAdapter(rAdapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.list, menu);
		return true;
	}

}
