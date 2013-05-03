package com.daybysay.helloproject;

import java.util.ArrayList;

import android.R.drawable;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class RowInImageAdapter extends BaseAdapter {
	private Context _context;
	private ArrayList<RowInImage> _rows;
	
	public RowInImageAdapter(Context context, ArrayList<RowInImage> rows)
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
		RowInImage row = (RowInImage) getItem(position);
		ViewHolder	viewHolder = new ViewHolder();
		
		if(convertView == null) {
			LayoutInflater inflater = LayoutInflater.from(_context);
			convertView = inflater.inflate(R.layout.row_image, null);

			viewHolder.title = (TextView) convertView.findViewById(R.id.textView1);
			viewHolder.text = (TextView) convertView.findViewById(R.id.textView2);
			viewHolder.img = (ImageView) convertView.findViewById(R.id.imageView1);
			convertView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}
		
		viewHolder.text.setText(row.get_text());
		viewHolder.title.setText(row.get_title());
		viewHolder.img.setImageDrawable(row.getImg());
		
		return convertView;
	}
	
	private static class ViewHolder
	{
		TextView title;
		TextView text;
		ImageView img;
	}
}
