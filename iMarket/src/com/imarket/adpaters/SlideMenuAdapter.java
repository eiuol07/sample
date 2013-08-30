package com.imarket.adpaters;

import java.util.ArrayList;

import com.imarket.R;
import com.imarket.model.events.SwitchToAnotherActivity;
import com.imarket.model.events.ShowEvent;
import com.imarket.utils.LogUtil;
import com.imarket.utils.ViewAnimationUtil;

import de.greenrobot.event.EventBus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SlideMenuAdapter extends ArrayAdapter<String> {

  private Context _context;
  private ArrayList<String> _menuNames;
  private LayoutInflater _inflater;
  private int _lastPosition = -1;
  private final int EXPAND = 0;
  private final int COLLAPSE = 1;
  private TextView _textViewMenuName;
  private RelativeLayout _layoutRotatorFunnelFirst;
  private RelativeLayout _layoutRotatorFunnelSecond;
  private RelativeLayout _layoutRotatorFunnelThird;
  private RelativeLayout _layoutRotatorFunnelFourth;
  private RelativeLayout _layoutRotatorFunnelFifth;
  private RelativeLayout _layoutRotatorFunnelSixth;
  private RelativeLayout _layoutRotatorFunnelSeventh;
  private RelativeLayout _layoutAdditionalRotatorFunnelFirst;
  private RelativeLayout _layoutAdditionalRotatorFunnelSecond;
  private RelativeLayout _layoutAdditionalRotatorFunnelThird;
  private RelativeLayout _layoutAdditionalRotatorFunnelFourth;
  private RelativeLayout _layoutReferralPanelFirst;
  private RelativeLayout _layoutReferralPanelSecond;
  private RelativeLayout _layoutReferralPanelThird;
  private RelativeLayout _layoutReferralPanelFourth;
  private RelativeLayout _layoutCreditsFirst;
  private RelativeLayout _layoutCreditsSecond;
  private RelativeLayout _layoutSettingsFirst;
  private RelativeLayout _layoutSettingsSecond;
  private RelativeLayout _layoutSettingsThird;
  private RelativeLayout _layoutSettingsFourth;
  private RelativeLayout _layoutSettingsFifth;
  private RelativeLayout _layoutSupportFirst;

  public class ViewHolder {
    int position;
    LinearLayout layoutRotatorFunnel;
    LinearLayout layoutAdditionalRotatorFunnel;
    LinearLayout layoutReferralPanel;
    LinearLayout layoutCredits;
    LinearLayout layoutSettings;
    LinearLayout layoutSupport;
    RelativeLayout layoutMenuHeader;
  }

  public SlideMenuAdapter(Context context, int resourceId, ArrayList<String> menuNames) {
    super(context, resourceId, menuNames);
    _context = context;
    _menuNames = menuNames;
    _inflater = (LayoutInflater) _context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

  }

  public int getCount() {
    return _menuNames.size();
  };

  @Override
  public String getItem(int position) {
    return _menuNames.get(position);
  }

  @Override
  public long getItemId(int position) {
    return position;
  }

  public View getView(final int position, View convertView, ViewGroup parent) {
    View row = convertView;
    final ViewHolder holder;
    final String menuName = _menuNames.get(position);
    View view = null;

    if (row == null) {
      row = _inflater.inflate(R.layout.list_menu, null, true);
      holder = new ViewHolder();

      holder.layoutMenuHeader = (RelativeLayout) row.findViewById(R.id.layout_menu_header);
      holder.layoutRotatorFunnel = (LinearLayout) row.findViewById(R.id.layout_rotator_funnel);
      holder.layoutAdditionalRotatorFunnel = (LinearLayout) row
          .findViewById(R.id.layout_additional_rotator_funnel);
      holder.layoutReferralPanel = (LinearLayout) row.findViewById(R.id.layout_referral_panel);
      holder.layoutCredits = (LinearLayout) row.findViewById(R.id.layout_credits);
      holder.layoutSettings = (LinearLayout) row.findViewById(R.id.layout_settings);
      holder.layoutSupport = (LinearLayout) row.findViewById(R.id.layout_support);

      row.setTag(holder);
    } else {
      holder = (ViewHolder) convertView.getTag();
    }

    _textViewMenuName = (TextView) row.findViewById(R.id.textview_menu_name);

    _layoutRotatorFunnelFirst = (RelativeLayout) row.findViewById(R.id.layout_rotator_funnel_first);
    _layoutRotatorFunnelSecond = (RelativeLayout) row
        .findViewById(R.id.layout_rotator_funnel_second);
    _layoutRotatorFunnelThird = (RelativeLayout) row.findViewById(R.id.layout_rotator_funnel_third);
    _layoutRotatorFunnelFourth = (RelativeLayout) row
        .findViewById(R.id.layout_rotator_funnel_fourth);
    _layoutRotatorFunnelFifth = (RelativeLayout) row.findViewById(R.id.layout_rotator_funnel_fifth);
    _layoutRotatorFunnelSixth = (RelativeLayout) row.findViewById(R.id.layout_rotator_funnel_sixth);
    _layoutRotatorFunnelSeventh = (RelativeLayout) row
        .findViewById(R.id.layout_rotator_funnel_seventh);
    _layoutAdditionalRotatorFunnelFirst = (RelativeLayout) row
        .findViewById(R.id.layout_additional_rotator_funnel_first);
    _layoutAdditionalRotatorFunnelSecond = (RelativeLayout) row
        .findViewById(R.id.layout_additional_rotator_funnel_second);
    _layoutAdditionalRotatorFunnelThird = (RelativeLayout) row
        .findViewById(R.id.layout_additional_rotator_funnel_third);
    _layoutAdditionalRotatorFunnelFourth = (RelativeLayout) row
        .findViewById(R.id.layout_additional_rotator_funnel_fourth);
    _layoutReferralPanelFirst = (RelativeLayout) row.findViewById(R.id.layout_referral_panel_first);
    _layoutReferralPanelSecond = (RelativeLayout) row
        .findViewById(R.id.layout_referral_panel_second);
    _layoutReferralPanelThird = (RelativeLayout) row.findViewById(R.id.layout_referral_panel_third);
    _layoutReferralPanelFourth = (RelativeLayout) row
        .findViewById(R.id.layout_referral_panel_fourth);
    _layoutCreditsFirst = (RelativeLayout) row.findViewById(R.id.layout_credits_first);
    _layoutCreditsSecond = (RelativeLayout) row.findViewById(R.id.layout_credits_second);
    _layoutSettingsFirst = (RelativeLayout) row.findViewById(R.id.layout_settings_first);
    _layoutSettingsSecond = (RelativeLayout) row.findViewById(R.id.layout_settings_second);
    _layoutSettingsThird = (RelativeLayout) row.findViewById(R.id.layout_settings_third);
    _layoutSettingsFourth = (RelativeLayout) row.findViewById(R.id.layout_settings_fourth);
    _layoutSettingsFifth = (RelativeLayout) row.findViewById(R.id.layout_settings_fifth);
    _layoutSupportFirst = (RelativeLayout) row.findViewById(R.id.layout_support_first);

    _layoutRotatorFunnelFirst.setOnClickListener(onMenuClick);
    _layoutRotatorFunnelSecond.setOnClickListener(onMenuClick);
    _layoutRotatorFunnelThird.setOnClickListener(onMenuClick);
    _layoutRotatorFunnelFourth.setOnClickListener(onMenuClick);
    _layoutRotatorFunnelFifth.setOnClickListener(onMenuClick);
    _layoutRotatorFunnelSixth.setOnClickListener(onMenuClick);
    _layoutRotatorFunnelSeventh.setOnClickListener(onMenuClick);
    _layoutAdditionalRotatorFunnelFirst.setOnClickListener(onMenuClick);
    _layoutAdditionalRotatorFunnelSecond.setOnClickListener(onMenuClick);
    _layoutAdditionalRotatorFunnelThird.setOnClickListener(onMenuClick);
    _layoutAdditionalRotatorFunnelFourth.setOnClickListener(onMenuClick);
    _layoutReferralPanelFirst.setOnClickListener(onMenuClick);
    _layoutReferralPanelSecond.setOnClickListener(onMenuClick);
    _layoutReferralPanelThird.setOnClickListener(onMenuClick);
    _layoutReferralPanelFourth.setOnClickListener(onMenuClick);
    _layoutCreditsFirst.setOnClickListener(onMenuClick);
    _layoutCreditsSecond.setOnClickListener(onMenuClick);
    _layoutSettingsFirst.setOnClickListener(onMenuClick);
    _layoutSettingsSecond.setOnClickListener(onMenuClick);
    _layoutSettingsThird.setOnClickListener(onMenuClick);
    _layoutSettingsFourth.setOnClickListener(onMenuClick);
    _layoutSettingsFifth.setOnClickListener(onMenuClick);
    _layoutSupportFirst.setOnClickListener(onMenuClick);

    _textViewMenuName.setText(menuName.toString());

    holder.position = position;

    try {
      switch (holder.position) {
      case 0:
        view = holder.layoutRotatorFunnel;
        break;
      case 1:
        view = holder.layoutAdditionalRotatorFunnel;
        break;
      case 2:
        view = holder.layoutReferralPanel;
        break;
      case 3:
        view = holder.layoutCredits;
        break;
      case 4:
        view = holder.layoutSettings;
        break;
      case 5:
        view = holder.layoutSupport;
        break;

      }

    } catch (Exception e) {
      LogUtil.e("Error", e);
    }

    if (_lastPosition == holder.position) {

      if (view.getVisibility() == View.VISIBLE) {
        holder.layoutMenuHeader.setBackgroundColor(_context.getResources().getColor(
            R.color.sidebar_dark_grey));
        animateView(view, COLLAPSE);
      } else {
        holder.layoutMenuHeader.setBackgroundColor(_context.getResources().getColor(R.color.blue));
        animateView(view, EXPAND);
      }

    } else {
      if (view.getVisibility() == View.VISIBLE) {
        animateView(view, COLLAPSE);
      } else {
        view.setVisibility(View.GONE);
      }
      holder.layoutMenuHeader.setBackgroundColor(_context.getResources().getColor(
          R.color.sidebar_dark_grey));
    }

    holder.layoutMenuHeader.setOnClickListener(new OnClickListener() {

      @Override
      public void onClick(View arg0) {
        _lastPosition = position;
        EventBus.getDefault().post(new ShowEvent());
      }

    });

    return row;

  }

  public void animateView(final View target, final int type) {
    Animation anim = new ViewAnimationUtil(target, type);
    anim.setDuration(300);
    target.startAnimation(anim);
  }

  private OnClickListener onMenuClick = new OnClickListener() {

    @Override
    public void onClick(View v) {
      EventBus.getDefault().post(new SwitchToAnotherActivity(v.getId()));
    }

  };

}
