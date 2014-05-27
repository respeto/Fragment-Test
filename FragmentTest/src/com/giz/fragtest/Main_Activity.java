package com.giz.fragtest;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Menu;
import android.view.MenuItem;

@SuppressWarnings("unused")
@SuppressLint("NewApi") public class Main_Activity extends FragmentActivity implements
	ItemListFragment.Callbacks  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        
        if (savedInstanceState == null) {
            Fragment fragment = null;
            
            fragment = new Map_Fragment();
            
            if (fragment != null) {
            	FragmentManager fragmentManager = getFragmentManager();
            	fragmentManager.beginTransaction()
    			.replace(R.id.frame_t, fragment).commit();
            }
            
            fragment = new List_Fragment();
            
            if (fragment != null) {
            	FragmentManager fragmentManager = getFragmentManager();
            	fragmentManager.beginTransaction()
    			.replace(R.id.frame_b, fragment).commit();
            }
        }
    }

	@Override
	public void onItemSelected(String id) {
		// TODO Auto-generated method stub
		
	}
}
