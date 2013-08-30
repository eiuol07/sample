package com.imarket.activities;

import android.os.Bundle;

import com.imarket.R;

public class LinkTrackerActivity extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBarWithSettings(getString(R.string.link_tracker_title));
		setContentView(R.layout.activity_link_tracker);

	}

}
