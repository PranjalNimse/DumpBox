package com.bignerdranch.android.splash;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Product extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product);

        ArrayList image_details = getListData();
        final ListView lv1 = (ListView) findViewById(R.id.listView3);
        lv1.setAdapter(new CustomListAdapter(this, image_details));
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = lv1.getItemAtPosition(position);
                NewsItem newsData = (NewsItem) o;
                Toast.makeText(Product.this, "Selected :" + " " + newsData, Toast.LENGTH_LONG).show();
            }
        });
    }

    private ArrayList getListData() {
        ArrayList<NewsItem> results = new ArrayList<NewsItem>();

        NewsItem newsData = new NewsItem();
        newsData.setHeadline("BOTTLE");
        newsData.setReporterName("Dry");
        newsData.setDate("Non-Degradable");
        results.add(newsData);

        NewsItem newsData1 = new NewsItem();
        newsData1.setHeadline("PLASTIC");
        newsData1.setReporterName("Dry");
        newsData1.setDate("Non-Degradable");

        results.add(newsData1);

        NewsItem newsData2 = new NewsItem();
        newsData2.setHeadline("NEWSPAPER");
        newsData2.setReporterName("Dry");
        newsData2.setDate("Degradable");
        results.add(newsData2);

        NewsItem newsData3 = new NewsItem();
        newsData3.setHeadline("METAL");
        newsData3.setReporterName("Dry");
        newsData3.setDate("Non-Degradable");
        results.add(newsData3);

        NewsItem newsData4 = new NewsItem();
        newsData4.setHeadline("TUBELIGHT");
        newsData4.setReporterName("Dry");
        newsData4.setDate("Non-Degradable");
        results.add(newsData4);

        NewsItem newsData5 = new NewsItem();
        newsData5.setHeadline("GLASS");
        newsData5.setReporterName("DRY");
        newsData5.setDate("Non-Degradable");
        results.add(newsData5);

        NewsItem newsData6 = new NewsItem();
        newsData6.setHeadline("CANS");
        newsData6.setReporterName("Dry");
        newsData6.setDate("Non-Degradable");
        results.add(newsData6);

        NewsItem newsData7 = new NewsItem();
        newsData7.setHeadline("CORROSIVES");
        newsData7.setReporterName("Wet");
        newsData7.setDate("Non-Degradable");
        results.add(newsData7);


        NewsItem newsData8 = new NewsItem();
        newsData.setHeadline("LIQUID");
        newsData8.setReporterName("Wet");
        newsData8.setDate("Degradable");
        results.add(newsData8);

        NewsItem newsData9 = new NewsItem();
        newsData9.setHeadline("FOOD");
        newsData9.setReporterName("Wet");
        newsData9.setDate("Degradable");
        results.add(newsData9);

        // Add some more dummy data for testing
        return results;
    }
}