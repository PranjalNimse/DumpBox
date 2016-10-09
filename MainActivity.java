package com.bignerdranch.android.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	
	private Button scanBtn;
	private TextView formatTxt, contentTxt, resultText;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.barcode);
		
		scanBtn = (Button) findViewById (R.id.scan_button);
		formatTxt = (TextView) findViewById (R.id.scan_format);
		contentTxt = (TextView) findViewById (R.id.scan_content);
		resultText = (TextView) findViewById(R.id.sugg);
		scanBtn.setOnClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		
		if(v.getId()==R.id.scan_button){
			
			IntentIntegrator scanIntegrator = new IntentIntegrator(this);
			scanIntegrator.initiateScan();
			
			}
		
	}
	
	public void onActivityResult(int requestCode, int resultCode, Intent intent) {

		//String result;
		
		IntentResult scanningResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
		
		if (scanningResult != null) {

			String scanContent = scanningResult.getContents();
			String scanFormat = scanningResult.getFormatName();
			
			formatTxt.setText("FORMAT: " + scanFormat);
			contentTxt.setText("CONTENT: " + scanContent);


			/*SQLiteDatabase mydatabase = openOrCreateDatabase("PRODUCTS",MODE_PRIVATE,null);

			mydatabase.execSQL("CREATE TABLE IF NOT EXISTS PROD_TAB(varchar id,varchar type,varchar env_impact);");
			mydatabase.execSQL("INSERT INTO PROD_TAB VALUES('90162602','non-toxic','35');");

			Cursor resultSet = mydatabase.rawQuery("Select type,env_impact from PRODUCTS where id="+scanContent+";",null);
			resultSet.moveToFirst();

			String type = resultSet.getString(1);
			String env = resultSet.getString(2);

			resultText.setText("Type: "+type+" environmental impact: "+env);*/

			if(scanContent.equals("90162602"))
			{
				resultText.setText("Type : Non biodegradable Environmental impact : 35%");
			}
			else if(scanContent.equals("079400350695"))
			{
				resultText.setText("Type : Non biodegradable Environmental impact : 40%");
			}
			else if(scanContent.equals("610585320037"))
			{
				resultText.setText("Type : biodegradable Environmental impact : 20%");
			}
			else if(scanContent.equals("7404710778656"))
			{
				resultText.setText("Type : Non biodegradable Environmental impact : 45%");
			}
			else if(scanContent.equals("036000258295"))
			{
				resultText.setText("Type :recyclable and contributes 35% to municipal solid waste.");
			}
			
			}
		
		else{
		    Toast toast = Toast.makeText(getApplicationContext(),"No scan data received!", Toast.LENGTH_SHORT);
		    toast.show();
		}
		
	    }

}
