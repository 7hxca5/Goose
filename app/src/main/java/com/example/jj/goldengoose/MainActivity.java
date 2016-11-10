package com.example.jj.goldengoose;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
@SuppressWarnings("deprecation")

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = (TabHost)findViewById(R.id.tab_host);
        tabHost.setup();

        TabSpec tabSpecOverall = tabHost.newTabSpec("Overall");
        tabSpecOverall.setIndicator("Overall");
        tabSpecOverall.setContent(R.id.Overall);
        tabHost.addTab(tabSpecOverall);

        TabSpec tabSpecDate = tabHost.newTabSpec("Date");
        tabSpecDate.setIndicator("Date");
        tabSpecDate.setContent(R.id.Date);
        tabHost.addTab(tabSpecDate);

        TabSpec tabSpecStatistic = tabHost.newTabSpec("Statistic");
        tabSpecStatistic.setIndicator("Statistic");
        tabSpecStatistic.setContent(R.id.Statistic);
        tabHost.addTab(tabSpecStatistic);

        tabHost.setCurrentTab(0);

    }


}
