package com.imarket.utils;

import android.util.Log;

public class LogUtil {
	public static final boolean ENABLE_LOG = true;
	public static final String TAG = "IMarket";

	public static void d(String msg) {
		if (ENABLE_LOG) {
			Log.d(TAG, msg);
		}
	}

	public static void d(String tag, String msg) {
		if (ENABLE_LOG) {
			Log.d(tag, msg);
		}
	}

	public static void d(String msg, Throwable tr) {
		if (ENABLE_LOG) {
			Log.d(TAG, msg, tr);
		}
	}

	public static void d(String tag, String msg, Throwable tr) {
		if (ENABLE_LOG) {
			Log.d(tag, msg, tr);
		}
	}

	public static void e(String msg) {
		if (ENABLE_LOG) {
			Log.e(TAG, msg);
		}
	}

	public static void e(String tag, String msg) {
		if (ENABLE_LOG) {
			Log.e(tag, msg);
		}
	}

	public static void e(String msg, Throwable tr) {
		if (ENABLE_LOG) {
			Log.e(TAG, msg, tr);
		}
	}

	public static void e(String tag, String msg, Throwable tr) {
		if (ENABLE_LOG) {
			Log.e(tag, msg, tr);
		}
	}

	public static void i(String msg) {
		if (ENABLE_LOG) {
			Log.i(TAG, msg);
		}
	}

	public static void i(String tag, String msg) {
		if (ENABLE_LOG) {
			Log.i(tag, msg);
		}
	}

	public static void i(String msg, Throwable tr) {
		if (ENABLE_LOG) {
			Log.i(TAG, msg, tr);
		}
	}

	public static void i(String tag, String msg, Throwable tr) {
		if (ENABLE_LOG) {
			Log.i(tag, msg, tr);
		}
	}

	public static void v(String msg) {
		if (ENABLE_LOG) {
			Log.v(TAG, msg);
		}
	}

	public static void v(String tag, String msg) {
		if (ENABLE_LOG) {
			Log.v(tag, msg);
		}
	}

	public static void v(String msg, Throwable tr) {
		if (ENABLE_LOG) {
			Log.v(TAG, msg, tr);
		}
	}

	public static void v(String tag, String msg, Throwable tr) {
		if (ENABLE_LOG) {
			Log.v(tag, msg, tr);
		}
	}

	public static void w(String msg) {
		if (ENABLE_LOG) {
			Log.w(TAG, msg);
		}
	}

	public static void w(String tag, String msg) {
		if (ENABLE_LOG) {
			Log.w(tag, msg);
		}
	}

	public static void w(String msg, Throwable tr) {
		if (ENABLE_LOG) {
			Log.w(TAG, msg, tr);
		}
	}

	public static void w(String tag, String msg, Throwable tr) {
		if (ENABLE_LOG) {
			Log.w(tag, msg, tr);
		}
	}
}
