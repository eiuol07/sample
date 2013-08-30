package com.imarket.activities;

import android.os.Bundle;

import com.imarket.R;

public class ReferralFunnelStatsActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBarWithSettings(getString(R.string.referral_funnel_stats_title));
		setContentView(R.layout.activity_referral_funnel_stats);

	}

}
