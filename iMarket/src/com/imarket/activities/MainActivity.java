package com.imarket.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import com.imarket.R;
import com.imarket.model.events.OnBottomFragmentChanged;
import com.imarket.model.events.StackFragmentList;

import de.greenrobot.event.EventBus;

public class MainActivity extends BaseMainActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		_stack.push(_dashBoardFragment);

	}

	@Override
	public void onBackPressed() {
		Fragment fragment = _stack.pop();

		if (fragment == null) {
			finish();
		} else {
			if (fragment == _dashBoardFragment) {
				_stack = new StackFragmentList();
				_stack.push(_dashBoardFragment);
			}

			FragmentTransaction ft = (FragmentTransaction) getSupportFragmentManager()
					.beginTransaction();
			ft.setCustomAnimations(R.anim.slide_in_right,
					R.anim.slide_out_right);
			ft.replace(R.id.layout_content, fragment).commit();
		}
	}

	private void replaceFragment(Fragment fragment) {
		if (fragment == _dashBoardFragment) {
			_stack = new StackFragmentList();
		}
		_stack.push(fragment);

		FragmentTransaction ft = (FragmentTransaction) getSupportFragmentManager()
				.beginTransaction();
		ft.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_left);
		ft.replace(R.id.layout_content, fragment).commit();
	}

	public void onEventMainThread(OnBottomFragmentChanged result) {

		switch (result.menuSelected) {
		case DASHBOARD:
			replaceFragment(_dashBoardFragment);
			_textViewHeaderTitle.setText(R.string.bottom_tab_first_label);
			break;
		case MEDIA:
			replaceFragment(_mediaFragment);
			_textViewHeaderTitle.setText(R.string.bottom_tab_second_label);
			break;
		case THEMES:
			replaceFragment(_themesFragment);
			_textViewHeaderTitle.setText(R.string.bottom_tab_third_label);
			break;
		case TRAINING:
			replaceFragment(_trainingFragment);
			_textViewHeaderTitle.setText(R.string.bottom_tab_fourth_label);
			break;
		case MORE:

			break;
		}
	}

	@Override
	protected void onDestroy() {
		EventBus.getDefault().unregister(this);
		super.onDestroy();
	}

}
