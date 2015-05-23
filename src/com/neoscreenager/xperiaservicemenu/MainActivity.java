package com.neoscreenager.xperiaservicemenu;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity  {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final Button openServiceMenuBtn = (Button) findViewById(R.id.btnServiceMenu);
        openServiceMenuBtn.setOnClickListener(new View.OnClickListener() {
			
			
			public void onClick(View v) {
				sendBroadcast(new Intent("android.provider.Telephony.SECRET_CODE", Uri.parse("android_secret_code://7378423")));
				
			}
		});
        
        final Button exitBtn = (Button) findViewById(R.id.btnExit);
        exitBtn.setOnClickListener(new View.OnClickListener() {
			
			
			public void onClick(View v) {
				finish();
				
			}
		});
         
       

    }

    @Override
    public void onDestroy(){
    	super.onDestroy();
    	System.gc();
    	finish();
    }
	

   
}
