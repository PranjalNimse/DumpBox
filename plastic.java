package com.bignerdranch.android.splash;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class plastic extends Activity{
	
	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.plastic);
	        Button button1=(Button)findViewById(R.id.flower);
	        
	        Button button2=(Button)findViewById(R.id.wall);

	        Button button3=(Button)findViewById(R.id.mob);

	        Button button4=(Button)findViewById(R.id.candle);

	        button1.setOnClickListener(new OnClickListener() {

	    	public void onClick(View arg0) {
	    			Intent intent = new Intent(Intent.ACTION_VIEW,
	       			     Uri.parse("https://www.youtube.com/watch?v=ZbFReQUPx_c"));
	       			startActivity(intent);

	    		}     		

	    	});
	        
	        button2.setOnClickListener(new OnClickListener() {

		    	public void onClick(View arg0) {
		    			Intent intent = new Intent(Intent.ACTION_VIEW,
		       			     Uri.parse("https://www.youtube.com/watch?v=Xa9UTCOwh3U"));
		       			startActivity(intent);

		    		}     		

		    	});
	        
	        button3.setOnClickListener(new OnClickListener() {

		    	public void onClick(View arg0) {
		    			Intent intent = new Intent(Intent.ACTION_VIEW,
		       			     Uri.parse("https://www.youtube.com/watch?v=4rUU-cU_pc8"));
		       			startActivity(intent);

		    		}     		

		    	});
	        
	        button4.setOnClickListener(new OnClickListener() {

		    	public void onClick(View arg0) {
		    			Intent intent = new Intent(Intent.ACTION_VIEW,
		       			     Uri.parse("https://www.youtube.com/watch?v=HmgsnHoa-uY"));
		       			startActivity(intent);

		    		}     		

		    	});
	        
	    }

}
