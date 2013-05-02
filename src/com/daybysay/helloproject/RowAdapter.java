package com.daybysay.helloproject;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class RowAdapter extends BaseAdapter {
	private int _layoutId;
	private Context _context;
	private ArrayList<Row> _rows;
	
	public RowAdapter(Context context, ArrayList<Row> rows)
	{
		_context = context;
		_rows = rows;
	}

	@Override
	public int getCount() {
		// TODO 自動生成されたメソッド・スタブ
		return _rows.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO 自動生成されたメソッド・スタブ
		return _rows.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO 自動生成されたメソッド・スタブ
		Row row = (Row) getItem(position);
		ViewHolder viewHolder;
		
		LayoutInflater inflater = LayoutInflater.from(_context);
		convertView = inflater.inflate(R.layout.row, null);
		
		viewHolder = new ViewHolder();
		viewHolder.title = (TextView) convertView.findViewById(R.id.textView1);
		viewHolder.text = (TextView) convertView.findViewById(R.id.textView2);
		convertView.setTag(viewHolder);
		
		viewHolder.text.setText(row.get_text());
		viewHolder.title.setText(row.get_title());
		android.util.Log.d("tag", viewHolder.text.getText().toString());
		
		return convertView;
	}
	
	private static class ViewHolder
	{
		TextView title;
		TextView text;
	}

}
