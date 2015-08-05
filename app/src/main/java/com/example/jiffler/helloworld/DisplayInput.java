package com.example.jiffler.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplayInput extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String requiredMessage = intent.getStringExtra(MainActivity.MESSAGE);
        String optionalMessage = intent.getStringExtra(MainActivity.OPTIONAL_MESSAGE);
        TextView requiredDisplay = new TextView(this);
        requiredDisplay.setTextSize(40);
        requiredDisplay.setText(requiredMessage);
        setContentView(requiredDisplay);
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
