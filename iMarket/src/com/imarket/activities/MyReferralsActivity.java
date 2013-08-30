package com.imarket.activities;

import android.os.Bundle;

import com.imarket.R;

public class MyReferralsActivity extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBarWithSettings(getString(R.string.my_referrals_title));
		setContentView(R.layout.activity_my_referrals);

	}

}
