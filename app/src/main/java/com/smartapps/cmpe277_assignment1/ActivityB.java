package com.smartapps.cmpe277_assignment1;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

/**
 * Created by priya on 3/4/2017.
 */

public class ActivityB extends Activity{
    Button f1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityb);
        f1=(Button) findViewById(R.id.finishb);
        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityB.this.finish();
            }
        });
    }



}
