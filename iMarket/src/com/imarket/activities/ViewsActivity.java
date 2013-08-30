package com.imarket.activities;

import android.os.Bundle;

import com.imarket.R;

public class ViewsActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBarWithSettings(getString(R.string.other_views_title));
		setContentView(R.layout.activity_views);

	}

}
