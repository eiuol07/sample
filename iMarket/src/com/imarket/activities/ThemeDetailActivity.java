package com.imarket.activities;

import android.os.Bundle;

import com.imarket.R;

public class ThemeDetailActivity extends BaseActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBarWithSettings(getString(R.string.theme_detail_title));
		setContentView(R.layout.activity_theme_detail);

	}

}
