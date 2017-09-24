package com.smartapps.cmpe277_assignment1;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    int threadCounter=0;
    TextView counter;
    Button bt1;
    Button d1;
    Button close;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = (Button) findViewById(R.id.startb);
        d1=(Button) findViewById(R.id.Dialog);
        close=(Button) findViewById(R.id.CloseApp);
        counter = (TextView) findViewById(R.id.resume_counter);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, ActivityB.class);
                startActivity(intent);


            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.finish();
            }
        });

    }

    @Override
    protected void onStart() {

        super.onStart();
    }


    @Override
    protected void onResume() {
        super.onResume();
        increment();
        Log.d("Debug", "in onResume function");

    }

    private void increment() {
        threadCounter+=1;
        setCounter();
    }

    private void setCounter() {
        counter.setText("Thread Counter:" + threadCounter);
    }

    @Override
    protected void onPause() {

        super.onPause();
        Log.d("Debug", "in onPause function");
    }
    public void startDialog(View v) {
        Intent intent = new Intent(MainActivity.this, DialogActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onRestart() {

        super.onRestart();
        Log.d("Debug", "in onRestart function");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Debug", "in onStop function");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Debug", "in onDestroy function");
    }


    public void closeA(View view) {
        MainActivity.this.finish();

    }
}

