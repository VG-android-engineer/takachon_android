package com.daybysay.helloproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class MyListActivity extends ListActivity implements OnItemClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ArrayList<RowInImage> rows = new ArrayList<RowInImage>();
		setContentView(R.layout.activity_list);
		for (int i = 0; i < 10; i++) {
			RowInImage row = new RowInImage();
			row.set_text("テキスト");
			row.set_title("タイトル");
			row.setImg(this.getResources().getDrawable(R.drawable.migi));
			rows.add(row);
		}
		RowInImageAdapter rAdapter = new RowInImageAdapter(this, rows);
		ListView list = getListView();
		list.setAdapter(rAdapter);
		list.setOnItemClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.list, menu);
		return true;
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
        // クリックされたアイテムを取得します
		String number = String.valueOf(arg2);
		CharSequence ch = number;
        Toast.makeText(this, ch, Toast.LENGTH_LONG).show();
	}

}
