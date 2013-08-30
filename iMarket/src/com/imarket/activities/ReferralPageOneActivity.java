package com.imarket.activities;

import android.os.Bundle;

import com.imarket.R;

public class ReferralPageOneActivity extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBarWithSettings(getString(R.string.referral_page_one_title));
		setContentView(R.layout.activity_referral_page_one);

	}

}
