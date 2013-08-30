package com.imarket.adpaters;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.imarket.R;

public class SlideSubMenuAdapter extends ArrayAdapter<String> {

	private Context _context;
	private ArrayList<String> _subMenuNames;
	private LayoutInflater _inflater;

	class ViewHolder {
		int position;
		TextView textViewSubMenuName;

	}

	public SlideSubMenuAdapter(Context context, int resourceId,
			ArrayList<String> subMenuNames) {
		super(context, resourceId, subMenuNames);
		_context = context;
		_subMenuNames = subMenuNames;
		_inflater = (LayoutInflater) _context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

	}

	public int getCount() {
		return _subMenuNames.size();
	};

	@Override
	public String getItem(int position) {
		return _subMenuNames.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		View row = convertView;
		final ViewHolder holder;
		final String subMenuName = _subMenuNames.get(position);

		if (row == null) {
			row = _inflater.inflate(R.layout.list_sub_menu, null, true);
			holder = new ViewHolder();
			holder.textViewSubMenuName = (TextView) row
					.findViewById(R.id.textview_sub_menu_name);

			row.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}

		holder.position = position;
		holder.textViewSubMenuName.setText(subMenuName.toString());

		return row;

	}

}
