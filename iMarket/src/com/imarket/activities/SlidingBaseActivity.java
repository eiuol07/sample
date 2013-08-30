package com.imarket.activities;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.imarket.R;
import com.imarket.adpaters.SlideMenuAdapter;
import com.imarket.model.events.SwitchToAnotherActivity;
import com.imarket.model.events.ShowEvent;
import com.imarket.views.CustomRelativeLayout;
import com.navdrawer.SimpleSideDrawer;

import de.greenrobot.event.EventBus;

public class SlidingBaseActivity extends BaseActivity {

  protected SimpleSideDrawer _drawer;
  private ArrayList<String> _menu;
  private ListView _listViewMenu;
  private SlideMenuAdapter _adapter;
  private Button _buttonCloseDrawer;

  public SlidingBaseActivity() {
    _menu = new ArrayList<String>();
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    _context = getSupportActionBar().getThemedContext();
    _drawer = new SimpleSideDrawer(this);

    EventBus.getDefault().register(this);

  }

  @Override
  protected void onPostCreate(Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);

    _buttonCloseDrawer = (Button) findViewById(R.id.button_close_drawer);
    // Setting up the menu for the side drawer
    String[] listMenu = getResources().getStringArray(R.array.menu);

    for (int i = 0; i < listMenu.length; i++) {
      _menu.add(listMenu[i]);
    }

    _listViewMenu = new ListView(_context);
    _listViewMenu = (ListView) findViewById(R.id.listview_menu);

    _adapter = new SlideMenuAdapter(SlidingBaseActivity.this, R.layout.list_menu, _menu);

    _listViewMenu.setAdapter(_adapter);

    _buttonCloseDrawer.setOnClickListener(new OnClickListener() {

      @Override
      public void onClick(View v) {
        _drawer.toggleLeftDrawer();

      }

    });
  }

  public void onEventMainThread(ShowEvent event) {
    _adapter.notifyDataSetChanged();
  }

  @Override
  protected void onDestroy() {
    EventBus.getDefault().unregister(this);
    super.onDestroy();
  }

  public void onEventMainThread(SwitchToAnotherActivity event) {
    _drawer.toggleLeftDrawer();
    switch (event.view) {

    case R.id.layout_rotator_funnel_first:
      startActivity(new Intent(this, StepOneActivity.class));
      overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
      break;
    case R.id.layout_rotator_funnel_second:
      startActivity(new Intent(this, StepTwoActivity.class));
      overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
      break;
    case R.id.layout_rotator_funnel_third:
      startActivity(new Intent(this, StepThreeActivity.class));
      overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
      break;
    case R.id.layout_rotator_funnel_fourth:
      startActivity(new Intent(this, StepFourActivity.class));
      overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
      break;
    case R.id.layout_rotator_funnel_fifth:
      startActivity(new Intent(this, StepFiveActivity.class));
      overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
      break;
    case R.id.layout_rotator_funnel_sixth:
      startActivity(new Intent(this, RotatorThemeActivity.class));
      overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
      break;
    case R.id.layout_rotator_funnel_seventh:
      startActivity(new Intent(this, RotatorFunnelStatsActivity.class));
      overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
      break;
    case R.id.layout_additional_rotator_funnel_first:
      // no activity yet...
      break;
    case R.id.layout_additional_rotator_funnel_second:
      startActivity(new Intent(this, PageOneStepTwoActivity.class));
      overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
      break;
    case R.id.layout_additional_rotator_funnel_third:
      startActivity(new Intent(this, PageTwoStepThreeActivity.class));
      overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
      break;
    case R.id.layout_additional_rotator_funnel_fourth:
      startActivity(new Intent(this, RotatorFunnelTwoActivity.class));
      overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
      break;
    case R.id.layout_referral_panel_first:
      startActivity(new Intent(this, ReferralPageOneActivity.class));
      overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
      break;
    case R.id.layout_referral_panel_second:
      startActivity(new Intent(this, ReferralPageTwoActivity.class));
      overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
      break;
    case R.id.layout_referral_panel_third:
      startActivity(new Intent(this, ReferralThemeActivity.class));
      overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
      break;
    case R.id.layout_referral_panel_fourth:
      startActivity(new Intent(this, ReferralFunnelStatsActivity.class));
      overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
      break;
    case R.id.layout_credits_first:
      startActivity(new Intent(this, CommisionsActivity.class));
      overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
      break;
    case R.id.layout_credits_second:
      startActivity(new Intent(this, ArchiveActivity.class));
      overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
      break;
    case R.id.layout_settings_first:
      startActivity(new Intent(this, ExitSqueezeActivity.class));
      overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
      break;
    case R.id.layout_settings_second:
      startActivity(new Intent(this, ReferralLinksActivity.class));
      overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
      break;
    case R.id.layout_settings_third:
      startActivity(new Intent(this, AutoRespondersActivity.class));
      overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
      break;
    case R.id.layout_settings_fourth:
      startActivity(new Intent(this, MyReferralsActivity.class));
      overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
      break;
    case R.id.layout_settings_fifth:
      startActivity(new Intent(this, LinkTrackerActivity.class));
      overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
      break;
    case R.id.layout_support_first:
      startActivity(new Intent(this, TicketsActivity.class));
      overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_left);
      break;

    }
  }

}
