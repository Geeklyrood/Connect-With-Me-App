package edu.cvtc.android.connectwithme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText firstNameEditText;
    private EditText lastNameEditText;
    private EditText emailEditText;

    private Button connectButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("connect_with_me", "MainActivity created");

        setContentView(R.layout.activity_main);

        firstNameEditText = (EditText) findViewById(R.id.firstNameEditText);
        lastNameEditText = (EditText) findViewById(R.id.lastNameEditText);
        emailEditText = (EditText) findViewById(R.id.emailEditText);

        connectButton = (Button) findViewById(R.id.connectButton);

        connectButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Log.d("connect_with_me", "Connect button was clicked!");

        // TODO: retrieve the connection data and present a new Activity
    }
}
