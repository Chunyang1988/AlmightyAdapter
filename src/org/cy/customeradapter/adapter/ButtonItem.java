package org.cy.customeradapter.adapter;

import org.cy.customeradapter.R;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ButtonItem implements AlmightyItem<String> {

	Button btn;

	@Override
	public View bindViews(LayoutInflater inflater, ViewGroup root) {
		View view = inflater
				.inflate(R.layout.item_listview_button, root, false);
		btn = (Button) view.findViewById(R.id.btn_item_listview);
		return view;
	}

	@Override
	public void getViewData(String data) {
		btn.setText(data);
	}

}
