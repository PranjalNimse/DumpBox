package com.bignerdranch.android.splash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by user on 8/10/16.
 */

public class Home extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        TextView tv=(TextView) this.findViewById(R.id.textView7);
        tv.setSelected(true);

        ImageButton seg=(ImageButton)findViewById(R.id.Segragation);
        ImageButton bfw=(ImageButton)findViewById(R.id.Best);
        ImageButton call=(ImageButton)findViewById(R.id.Call);
        ImageButton ps=(ImageButton)findViewById(R.id.Product);

        seg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub

                /// Create Intent for SignUpActivity  abd Start The Activity
                Intent intent=new Intent(getApplicationContext(),Product.class);
                startActivity(intent);
            }
        });

        bfw.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub

                /// Create Intent for SignUpActivity  abd Start The Activity
                Intent intent=new Intent(getApplicationContext(),NewActivity.class);
                startActivity(intent);
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub

                /// Create Intent for SignUpActivity  abd Start The Activity
                Intent intent=new Intent(getApplicationContext(),CallUs.class);
                startActivity(intent);
            }
        });

        ps.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub

                /// Create Intent for SignUpActivity  abd Start The Activity
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
