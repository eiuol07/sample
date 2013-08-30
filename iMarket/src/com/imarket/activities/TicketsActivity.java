package com.imarket.activities;

import android.os.Bundle;

import com.imarket.R;

public class TicketsActivity extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBarWithSettings(getString(R.string.tickets_title));
		setContentView(R.layout.activity_tickets);

	}

}
