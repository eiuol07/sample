package com.imarket.activities;

import android.os.Bundle;

import com.imarket.R;

public class ArchiveActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBarWithSettings(getString(R.string.archive_title));
		setContentView(R.layout.activity_archive);

	}

}
