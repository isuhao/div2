package com.swordandspade.hero;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

public class CharSelectAlignActivity extends Activity {	
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        //setContentView(R.layout.sandbox);
        setContentView(R.layout.charselect_align);
	}
	
	private final static String TAG = "Hero.CharSelect";
}