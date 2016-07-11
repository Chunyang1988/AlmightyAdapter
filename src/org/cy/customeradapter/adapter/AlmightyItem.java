package org.cy.customeradapter.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public interface AlmightyItem<T> {

	public View bindViews(LayoutInflater inflater, ViewGroup root);

	public void getViewData(T data);

}
