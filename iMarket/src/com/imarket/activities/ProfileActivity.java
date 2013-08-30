package com.imarket.activities;

import com.imarket.R;

import android.os.Bundle;

public class ProfileActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBarWithSettings(getString(R.string.profile_title));
		setContentView(R.layout.activity_profile);

	}

}
