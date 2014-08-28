package com.fragmentproje;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends PreferenceActivity {

	@Override
	public void onBuildHeaders(List<Header> target) {
		// TODO Auto-generated method stub
	 	super.onBuildHeaders(target);
	    loadHeadersFromResource(R.xml.preferences, target);
	}

	
	
}
