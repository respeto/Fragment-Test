package com.giz.fragtest;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class List_Fragment extends Fragment {
    public static final String ARG_ITEM_ID = "item_id";

	public List_Fragment(){}

	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.list_fragment, container, false);
         
        return rootView;
    }
}