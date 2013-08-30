package com.imarket.activities;

import android.os.Bundle;

import com.imarket.R;

public class RotatorFunnelTwoActivity extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBarWithSettings(getString(R.string.rotator_funnel_two_theme_title));
		setContentView(R.layout.activity_rotator_funnel_two);

	}

}
