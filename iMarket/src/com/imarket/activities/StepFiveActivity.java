package com.imarket.activities;

import android.os.Bundle;

import com.imarket.R;

public class StepFiveActivity extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBarWithSettings(getString(R.string.step_five_title));
		setContentView(R.layout.activity_step_five);

	}

}
