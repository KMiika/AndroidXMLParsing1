package com.androidhive.xmlparsing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SingleMenuItemActivity  extends Activity {
	
	// XML node keys
	static final String KEY_HOME_TEAM = "home_team";
	static final String KEY_HOME_GOALS = "home_goals";
	static final String KEY_VISITOR_TEAM = "visitor_team";
	static final String KEY_VISITOR_GOALS = "visitor_goals";
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_list_item);
        
        // getting intent data
        Intent in = getIntent();
        
        // Get XML values from previous intent
        String name = in.getStringExtra(KEY_HOME_TEAM);
        String cost = in.getStringExtra(KEY_VISITOR_TEAM);
        String description = in.getStringExtra(KEY_HOME_GOALS);
        String visitor = in.getStringExtra(KEY_VISITOR_GOALS);
        
        // Displaying all values on the screen
        TextView lblName = (TextView) findViewById(R.id.name_label);
        TextView lblCost = (TextView) findViewById(R.id.cost_label);
        TextView lblDesc = (TextView) findViewById(R.id.description_label);
        TextView lblVisi = (TextView) findViewById(R.id.visitor_label);
        
        lblName.setText(name);
        lblCost.setText(cost);
        lblDesc.setText(description);
        lblVisi.setText(visitor);
    }
}
