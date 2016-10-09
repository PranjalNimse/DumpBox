package com.bignerdranch.android.splash;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class oldcd extends Activity{
	
	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.oldcd);
	        Button button1=(Button)findViewById(R.id.frame);
	        
	        Button button2=(Button)findViewById(R.id.key);

	        button1.setOnClickListener(new OnClickListener() {

	    	public void onClick(View arg0) {
	    			Intent intent = new Intent(Intent.ACTION_VIEW,
	       			     Uri.parse("https://www.youtube.com/watch?v=_KUh_eq2oAs"));
	       			startActivity(intent);

	    		}     		

	    	});
	        
	        button2.setOnClickListener(new OnClickListener() {

		    	public void onClick(View arg0) {
		    			Intent intent = new Intent(Intent.ACTION_VIEW,
		       			     Uri.parse("https://www.youtube.com/watch?v=JhHucwHV6y0"));
		       			startActivity(intent);

		    		}     		

		    	});
	               
	    }
	

}
