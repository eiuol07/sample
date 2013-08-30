package com.imarket.views;

import com.imarket.model.events.OnSizeChanged;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import de.greenrobot.event.EventBus;

public class CustomRelativeLayout extends RelativeLayout {

	public CustomRelativeLayout(Context context) {
		super(context);
	}

	public CustomRelativeLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public CustomRelativeLayout(Context context, AttributeSet attrs,
			int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	protected void onSizeChanged(int w, int h, int oldw, int oldh) {
		super.onSizeChanged(w, h, oldw, oldh);
		EventBus.getDefault().post(new OnSizeChanged(w, h, oldw, oldh));
	}

}
