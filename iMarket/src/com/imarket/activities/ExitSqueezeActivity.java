package com.imarket.activities;

import android.os.Bundle;

import com.imarket.R;

public class ExitSqueezeActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBarWithSettings(getString(R.string.exit_squeeze_title));
		setContentView(R.layout.activity_exit_squeeze);

	}

}
