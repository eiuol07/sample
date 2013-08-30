package com.imarket;

public class Constants {

	public static enum MenuType {

		DASHBOARD {
			@Override
			public String toString() {
				return "dashboard";
			}
		},
		MEDIA {
			@Override
			public String toString() {
				return "media";
			}
		},
		THEMES {
			@Override
			public String toString() {
				return "themes";
			}
		},
		TRAINING {
			@Override
			public String toString() {
				return "training";
			}
		},
		MORE {
			@Override
			public String toString() {
				return "more";
			}
		}
	}

}
