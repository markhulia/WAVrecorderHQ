package com.example.highqualitywavrecorder;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MyActivity extends AppCompatActivity {
    ExtAudioRecorder extAudioRecorder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    public void btnStart(View view){
        Toast.makeText(this,"Start",Toast.LENGTH_LONG).show();
        ExtAudioRecorder audioRecorder =  new ExtAudioRecorder();
        audioRecorder.reset();
        audioRecorder.setOutputFile(Environment.getExternalStorageDirectory() +"jorik.wav");
        audioRecorder.prepare();
        audioRecorder.start();
    }

    public void btnStop(View view){
        Toast.makeText(this, "Stop", Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
