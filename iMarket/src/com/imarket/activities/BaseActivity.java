package com.imarket.activities;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.imarket.R;

public class BaseActivity extends SherlockFragmentActivity {

  protected Context _context;
  protected Button _buttonBack;
  protected TextView _textViewHeaderTitle;
  protected Button _buttonLeftSide;
  protected Button _buttonRightSide;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    _context = getSupportActionBar().getThemedContext();

  }

  protected void getActionBarWithSettings(String text) {
    getSupportActionBar().setCustomView(R.layout.activity_actionbar_custom_main);
    getSupportActionBar().setDisplayShowCustomEnabled(true);
    getSupportActionBar().setDisplayShowHomeEnabled(false);
    getSupportActionBar().setDisplayShowTitleEnabled(false);

    View v = getSupportActionBar().getCustomView();

    _buttonBack = (Button) v.findViewById(R.id.button_back);
    _buttonLeftSide = (Button) v.findViewById(R.id.button_left_side);
    _buttonRightSide = (Button) v.findViewById(R.id.button_right_side);
    _textViewHeaderTitle = (TextView) v.findViewById(R.id.textview_header_title);

    _buttonLeftSide.setVisibility(View.INVISIBLE);
    _buttonRightSide.setVisibility(View.INVISIBLE);
    _buttonBack.setVisibility(View.VISIBLE);

    _textViewHeaderTitle.setText(text);

    _buttonBack.setOnClickListener(new OnClickListener() {

      @Override
      public void onClick(View v) {
        finish();
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);

      }
    });
  }

  public void onBackPressed() {
    finish();
    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
  };
}
