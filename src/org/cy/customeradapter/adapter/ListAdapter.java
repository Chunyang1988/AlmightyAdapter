package org.cy.customeradapter.adapter;

import java.util.List;

import org.cy.almighty.AlmightyAdapter;
import org.cy.almighty.AlmightyItem;
import org.cy.customeradapter.adapter.item.ButtonItem;
import org.cy.customeradapter.adapter.item.TextItem;

public class ListAdapter extends AlmightyAdapter<String> {

	List<String> mData;

	public ListAdapter(List<String> datas) {
		this.mData = datas;
	}

	@Override
	public int getCount() {
		return mData == null ? 0 : mData.size();
	}

	@Override
	public int getViewTypeCount() {
		return 2;
	}

	@Override
	public int getItemViewType(int position) {
		if (position == 0 || position == 2 || position == 3 || position == 5
				|| position == 9 || position == 7 || position == 13)
			return 0;
		else
			return 1;
	}

	@Override
	public AlmightyItem createItem(int position) {
		int type = getItemViewType(position);
		if (type == 0)
			return new TextItem();
		else
			return new ButtonItem();
	}

	@Override
	public String getViewData(int position) {
		return mData.get(position);
	}

}
