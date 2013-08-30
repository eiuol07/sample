package com.imarket.activities;

import android.os.Bundle;

import com.imarket.R;

public class AutoRespondersActivity extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBarWithSettings(getString(R.string.auto_responders_title));
		setContentView(R.layout.activity_auto_responders);

	}

}
