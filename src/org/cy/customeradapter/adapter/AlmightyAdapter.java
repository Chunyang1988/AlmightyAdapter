package org.cy.customeradapter.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public abstract class AlmightyAdapter<T> extends BaseAdapter {

	private LayoutInflater mInflater;

	public abstract AlmightyItem createItem(int position);

	public abstract T hybridData(int position);

	@Override
	public Object getItem(int position) {
		return position;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (mInflater == null)
			mInflater = LayoutInflater.from(parent.getContext());

		AlmightyItem item = null;
		if (convertView == null) {
			item = createItem(position);
			convertView = item.bindViews(mInflater, parent);
			convertView.setTag(item);
		} else {
			item = (AlmightyItem) convertView.getTag();
		}

		item.getViewData(hybridData(position));

		return convertView;
	}

}
