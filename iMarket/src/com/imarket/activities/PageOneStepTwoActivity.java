package com.imarket.activities;

import android.os.Bundle;

import com.imarket.R;

public class PageOneStepTwoActivity extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBarWithSettings(getString(R.string.page_one_step_two_title));
		setContentView(R.layout.activity_page_one_step_two);

	}

}
