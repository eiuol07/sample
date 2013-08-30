package com.imarket.activities;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

import com.actionbarsherlock.app.SherlockActivity;
import com.imarket.R;
import com.imarket.utils.LogUtil;

public class IMarket extends SherlockActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getSupportActionBar().hide();
		setContentView(R.layout.activity_imarket);

		new Loader().execute();
	}

	private class Loader extends AsyncTask<Void, Void, Integer> {
		@Override
		protected void onPreExecute() {
			super.onPreExecute();
		}

		@Override
		protected Integer doInBackground(Void... params) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie) {
				LogUtil.e(
						"InterruptedException raised while loading the splash screen.",
						ie);
			} catch (Exception e) {
				LogUtil.e("Exception raised while loading the splash screen.",
						e);
			}

			return 0;
		}

		@Override
		protected void onPostExecute(Integer result) {
			final Intent intent = new Intent(IMarket.this, MainActivity.class);
			startActivity(intent);
			IMarket.this.finish();
		}
	}
}
