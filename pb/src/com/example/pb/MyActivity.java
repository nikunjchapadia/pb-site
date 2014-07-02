package com.example.pb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;

public class MyActivity extends ActionBarActivity {

    public final static String EXTRA_MESSAGE = "com.example.pb.MESSAGE";
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        System.out.println("Welcome to the world of Android");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void saveMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        System.out.println(message);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
