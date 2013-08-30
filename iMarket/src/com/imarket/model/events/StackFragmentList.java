package com.imarket.model.events;

import java.util.ArrayList;

import android.support.v4.app.Fragment;

public class StackFragmentList {
	private ArrayList<Fragment> _fragments;

	public StackFragmentList() {
		_fragments = new ArrayList<Fragment>();
	}

	public boolean isEmpty() {
		if (_fragments.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public Fragment getHead() {
		if (!isEmpty()) {
			return _fragments.get(_fragments.size() - 1);
		} else {
			return null;
		}
	}

	public Fragment pop() {
		Fragment head = null;
		Fragment prevHead = null;

		if (!isEmpty()) {
			prevHead = _fragments.remove(_fragments.size() - 1);
			_fragments.trimToSize();
			if (prevHead != null) {
				head = getHead();
			}
		}

		return head;
	}

	public void push(Fragment fragment) {
		_fragments.add(fragment);
	}
}
