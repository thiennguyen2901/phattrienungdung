package com.example.calculator1;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class About extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		Button btnback = (Button) findViewById(R.id.back);
		btnback.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		
	}


}
