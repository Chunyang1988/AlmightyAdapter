package org.cy.customeradapter;

import java.util.ArrayList;
import java.util.List;
import org.cy.customeradapter.adapter.ListAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final ListView lv = (ListView) findViewById(R.id.listview);

		List<String> datas = new ArrayList<String>();
		for (int i = 0; i < 15; i++) {
			datas.add(String.valueOf(i));
		}

		ListAdapter adapter = new ListAdapter(datas);
		lv.setAdapter(adapter);

	}

}
