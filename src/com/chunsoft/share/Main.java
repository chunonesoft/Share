package com.chunsoft.share;


import com.example.share.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity{
	private Button btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		btn = (Button) findViewById(R.id.tv);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				Intent intent=new Intent(Intent.ACTION_SEND);
				intent.setType("text/plain");
				//intent.setType("image/*"); 
				//intent.putExtra(Intent.EXTRA_SUBJECT, "Share"); 
				intent.putExtra(Intent.EXTRA_TEXT, "I have successfully share my message through my app"); 
				intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);  
				startActivity(Intent.createChooser(intent, getTitle())); 
			}
		});
	}
	
	
}
