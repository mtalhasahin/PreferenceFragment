package com.fragmentproje;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class UyarilarPreferencesFragment extends PreferenceFragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	    addPreferencesFromResource(R.xml.uyarilar_preferences);
	  }
}
