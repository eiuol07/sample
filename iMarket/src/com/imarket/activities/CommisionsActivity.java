package com.imarket.activities;

import android.os.Bundle;

import com.imarket.R;

public class CommisionsActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBarWithSettings(getString(R.string.commisions_title));
		setContentView(R.layout.activity_commisions);

	}

}
