package com.imarket.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.imarket.Constants.MenuType;
import com.imarket.R;
import com.imarket.model.events.OnBottomFragmentChanged;

import de.greenrobot.event.EventBus;

public class BottomFragment extends Fragment {

	private Button _buttonDashboard;
	private Button _buttonMedia;
	private Button _buttonThemes;
	private Button _buttonTraining;
	private Button _buttonMore;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_bottom_navigation,
				container, false);

		_buttonDashboard = (Button) view.findViewById(R.id.button_dashboard);
		_buttonMedia = (Button) view.findViewById(R.id.button_media);
		_buttonThemes = (Button) view.findViewById(R.id.button_themes);
		_buttonTraining = (Button) view.findViewById(R.id.button_training);
		_buttonMore = (Button) view.findViewById(R.id.button_more);

		_buttonDashboard.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				OnBottomFragmentChanged onMenuChanged = new OnBottomFragmentChanged();
				onMenuChanged.menuSelected = MenuType.DASHBOARD;
				EventBus.getDefault().post(onMenuChanged);

			}
		});

		_buttonMedia.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				OnBottomFragmentChanged onMenuChanged = new OnBottomFragmentChanged();
				onMenuChanged.menuSelected = MenuType.MEDIA;
				EventBus.getDefault().post(onMenuChanged);

			}
		});
		_buttonThemes.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				OnBottomFragmentChanged onMenuChanged = new OnBottomFragmentChanged();
				onMenuChanged.menuSelected = MenuType.THEMES;
				EventBus.getDefault().post(onMenuChanged);

			}
		});
		_buttonTraining.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				OnBottomFragmentChanged onMenuChanged = new OnBottomFragmentChanged();
				onMenuChanged.menuSelected = MenuType.TRAINING;
				EventBus.getDefault().post(onMenuChanged);

			}
		});
		_buttonMore.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				OnBottomFragmentChanged onMenuChanged = new OnBottomFragmentChanged();
				onMenuChanged.menuSelected = MenuType.MORE;
				EventBus.getDefault().post(onMenuChanged);

			}
		});

		return view;
	}
	
	

}
