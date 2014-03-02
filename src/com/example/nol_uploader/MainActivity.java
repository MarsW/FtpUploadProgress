package com.example.nol_uploader;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findbutton();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	private void findbutton()
	{
		button=(Button)findViewById(R.id.button);
		button.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View view) {	
				Intent intent = new Intent(MainActivity.this, Tasklist.class);
				Bundle bData = new Bundle();
				bData.putString("ftpHost", ""); 
				bData.putString("ftpUser", "");
				bData.putString("ftpPasswd", "");
				bData.putString("ftpRemoteDir", "");
				bData.putString("localDir", "/sdcard/test2.txt,/sdcard/test1.txt,/sdcard/folder/");
				bData.putInt("port", 21);
				bData.putString("delete", "no");
				intent.putExtras(bData);
				startActivity(intent); 		
			}
		});
	}

}
