package org.application.pollbob;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class PollbobActivity extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // Set up click listeners for all the buttons
        View latestButton = findViewById(R.id.latest_polls_button);
        latestButton.setOnClickListener((OnClickListener) this);
        View trendingButton = findViewById(R.id.trending_polls_button);
        trendingButton.setOnClickListener((OnClickListener) this);
        View myButton = findViewById(R.id.my_polls_button);
        myButton.setOnClickListener((OnClickListener) this);
        View aboutButton = findViewById(R.id.about_button);
        aboutButton.setOnClickListener(this);
    }
    
    public void onClick(View v) {
    	switch (v.getId()) {
    	case R.id.about_button:
    		Intent i = new Intent(this, About.class);
    		startActivity(i);
    		break;
    	case R.id.latest_polls_button:
    		break;
    	}
    }

}