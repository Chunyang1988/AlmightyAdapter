package org.cy.customeradapter.adapter.item;

import org.cy.almighty.AlmightyItem;
import org.cy.customeradapter.R;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TextItem implements AlmightyItem<String> {

	private TextView mTV;

	@Override
	public View bindViews(LayoutInflater inflater, ViewGroup root) {
		View view = inflater.inflate(R.layout.item_listview_text, root, false);
		mTV = (TextView) view.findViewById(R.id.tv_item_listview_text);
		return view;
	}

	@Override
	public void getViewData(String data) {
		mTV.setText(data);
	}

}