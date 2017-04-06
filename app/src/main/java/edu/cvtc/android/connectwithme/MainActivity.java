package edu.cvtc.android.connectwithme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

        final String firstName = firstNameEditText.getText().toString();
        final String lastName = lastNameEditText.getText().toString();
        final String email = emailEditText.getText().toString();

        if (firstName != null && !firstName.isEmpty()
                && lastName != null && !lastName.isEmpty()
                && email != null && !email.isEmpty()) {

            final Intent intent = new Intent(getApplicationContext(), ResponseActivity.class);
            intent.putExtra("firstName", firstName);
            intent.putExtra("lastName", lastName);
            intent.putExtra("email", email);

            startActivity(intent);

        } else {
            Toast.makeText(getApplicationContext(), "You must complete all fields!", Toast.LENGTH_SHORT).show();
        }
    }
}
