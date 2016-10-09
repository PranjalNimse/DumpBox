package com.bignerdranch.android.splash;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class news extends Activity{

	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.news);
	        Button button1=(Button)findViewById(R.id.piece);
	        
	        Button button2=(Button)findViewById(R.id.pen);

	        Button button3=(Button)findViewById(R.id.wallhang);

	        Button button4=(Button)findViewById(R.id.wdeco);

	        button1.setOnClickListener(new OnClickListener() {

	    	public void onClick(View arg0) {
	    			Intent intent = new Intent(Intent.ACTION_VIEW,
	       			     Uri.parse("https://www.youtube.com/watch?v=5WrYz2A-ovM"));
	       			startActivity(intent);

	    		}     		

	    	});
	        
	        button2.setOnClickListener(new OnClickListener() {

		    	public void onClick(View arg0) {
		    			Intent intent = new Intent(Intent.ACTION_VIEW,
		       			     Uri.parse("https://www.youtube.com/watch?v=5WrYz2A-ovM"));
		       			startActivity(intent);

		    		}     		

		    	});
	        
	        button3.setOnClickListener(new OnClickListener() {

		    	public void onClick(View arg0) {
		    			Intent intent = new Intent(Intent.ACTION_VIEW,
		       			     Uri.parse("https://www.youtube.com/watch?v=uLmg8mNKr30"));
		       			startActivity(intent);

		    		}     		

		    	});
	        
	        button4.setOnClickListener(new OnClickListener() {

		    	public void onClick(View arg0) {
		    			Intent intent = new Intent(Intent.ACTION_VIEW,
		       			     Uri.parse("https://www.youtube.com/watch?v=ngknUmv7pwQ"));
		       			startActivity(intent);

		    		}     		

		    	});
	        
	    }
	
}
