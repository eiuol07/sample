package com.imarket.activities;

import android.os.Bundle;

import com.imarket.R;

public class PageTwoStepThreeActivity extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBarWithSettings(getString(R.string.page_two_step_three_title));
		setContentView(R.layout.activity_page_two_step_three);

	}

}
