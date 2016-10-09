package com.bignerdranch.android.splash;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class straw extends Activity{

	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.straw);
	        Button button1=(Button)findViewById(R.id.lantern);
	        
	        Button button2=(Button)findViewById(R.id.peacock);

	        Button button3=(Button)findViewById(R.id.lotus);

	        Button button4=(Button)findViewById(R.id.holder);

	        button1.setOnClickListener(new OnClickListener() {

	    	public void onClick(View arg0) {
	    			Intent intent = new Intent(Intent.ACTION_VIEW,
	       			     Uri.parse("https://www.youtube.com/watch?v=wjEF8Di5k8Y"));
	       			startActivity(intent);

	    		}     		

	    	});
	        
	        button2.setOnClickListener(new OnClickListener() {

		    	public void onClick(View arg0) {
		    			Intent intent = new Intent(Intent.ACTION_VIEW,
		       			     Uri.parse("https://www.youtube.com/watch?v=fRpdQNX7YBY"));
		       			startActivity(intent);

		    		}     		

		    	});
	        
	        button3.setOnClickListener(new OnClickListener() {

		    	public void onClick(View arg0) {
		    			Intent intent = new Intent(Intent.ACTION_VIEW,
		       			     Uri.parse("https://www.youtube.com/watch?v=GzjHrFFlk1w"));
		       			startActivity(intent);

		    		}     		

		    	});
	        
	        button4.setOnClickListener(new OnClickListener() {

		    	public void onClick(View arg0) {
		    			Intent intent = new Intent(Intent.ACTION_VIEW,
		       			     Uri.parse("https://www.youtube.com/watch?v=lAjLtut-MWA"));
		       			startActivity(intent);

		    		}     		

		    	});
	        
	    }
	
}
