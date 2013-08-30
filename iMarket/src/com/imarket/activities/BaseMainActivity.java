package com.imarket.activities;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.imarket.R;
import com.imarket.fragments.BottomFragment;
import com.imarket.fragments.DashboardFragment;
import com.imarket.fragments.MediaFragment;
import com.imarket.fragments.ThemesFragment;
import com.imarket.fragments.TrainingFragment;
import com.imarket.model.events.StackFragmentList;
import com.imarket.utils.LogUtil;

public class BaseMainActivity extends SecuredSlidingBaseActivity {

	protected TextView _textViewHeaderTitle;
	protected DashboardFragment _dashBoardFragment;
	protected MediaFragment _mediaFragment;
	protected ThemesFragment _themesFragment;
	protected TrainingFragment _trainingFragment;
	protected StackFragmentList _stack;
	protected BottomFragment _bottomFragment;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		_drawer.setLeftBehindContentView(R.layout.slide_menu_left);

		_dashBoardFragment = new DashboardFragment();
		_mediaFragment = new MediaFragment();
		_themesFragment = new ThemesFragment();
		_trainingFragment = new TrainingFragment();
		_stack = new StackFragmentList();
		_bottomFragment = new BottomFragment();

		getSupportActionBar().setCustomView(
				R.layout.activity_actionbar_custom_main);
		getSupportActionBar().setDisplayShowCustomEnabled(true);
		getSupportActionBar().setDisplayShowHomeEnabled(false);
		getSupportActionBar().setDisplayShowTitleEnabled(false);

		getSupportFragmentManager().beginTransaction()
				.add(R.id.layout_content, _dashBoardFragment).commit();
		getSupportFragmentManager().beginTransaction()
				.add(R.id.layout_bottom, _bottomFragment).commit();

		setupActionBarOnClickListeners();

	}

	private void setupActionBarOnClickListeners() {
		getSupportActionBar().getCustomView()
				.findViewById(R.id.button_left_side)
				.setOnClickListener(onActionBarViewClick);
		getSupportActionBar().getCustomView()
				.findViewById(R.id.button_right_side)
				.setOnClickListener(onActionBarViewClick);

		View v = getSupportActionBar().getCustomView();

		_textViewHeaderTitle = (TextView) v
				.findViewById(R.id.textview_header_title);

	}

	private OnClickListener onActionBarViewClick = new OnClickListener() {

		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.button_left_side:
				_drawer.toggleLeftDrawer();
				break;
			case R.id.button_right_side:

				break;
			}
		}
	};

	public OnClickListener getActionBarViewClickListener() {
		return onActionBarViewClick;
	}

	@Override
	public void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
	}
}
