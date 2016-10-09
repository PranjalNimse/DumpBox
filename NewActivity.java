package com.bignerdranch.android.splash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next1);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
    	
        Button button1 = (Button) findViewById(R.id.plastic);

    	button1.setOnClickListener(new OnClickListener() {

    		public void onClick(View arg0) {

    			
    			
    			Intent myIntent = new Intent(NewActivity.this,
						plastic.class);
				startActivity(myIntent);
				
		 		}
        	}
    		);
    		Button button2 = (Button) findViewById(R.id.news);

        	button2.setOnClickListener(new OnClickListener() {

        		public void onClick(View arg0) {

        			
        			
        			Intent myIntent = new Intent(NewActivity.this,
    						news.class);
    				startActivity(myIntent);
    				
    		 		}


    	});
        	
        	Button button3 = (Button) findViewById(R.id.straw);

        	button3.setOnClickListener(new OnClickListener() {

        		public void onClick(View arg0) {

        			
        			
        			Intent myIntent = new Intent(NewActivity.this,
    						straw.class);
    				startActivity(myIntent);
    				
    		 		}


    	});
        	
        	Button button4 = (Button) findViewById(R.id.cd);

        	button4.setOnClickListener(new OnClickListener() {

        		public void onClick(View arg0) {

        			
        			
        			Intent myIntent = new Intent(NewActivity.this,
    						oldcd.class);
    				startActivity(myIntent);
    				
    		 		}


    	});
        	
        return true;
   }
}
