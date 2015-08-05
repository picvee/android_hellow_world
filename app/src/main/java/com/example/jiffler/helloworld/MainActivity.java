package com.example.jiffler.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String MESSAGE = "com.example.jiffler.helloworld.message";
    public final static String OPTIONAL_MESSAGE = "com.example.jiffler.helloworld.optional_message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    // called when Yayy!! btn is clicked
    public void sendMessage(View view){
        // To Do
        Intent intent = new Intent(this, DisplayInput.class);
        EditText editMessage = (EditText) findViewById(R.id.edit_message);
        EditText optionalText = (EditText) findViewById(R.id.optional);
        String message = editMessage.getText().toString();
        String optionalMessage = optionalText.getText().toString();
        intent.putExtra(MESSAGE, message);
        intent.putExtra(OPTIONAL_MESSAGE, optionalMessage);
        startActivity(intent);
    }
}
