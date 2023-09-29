package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    private TextView usernameTextView, passwordTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        usernameTextView = findViewById(R.id.username_text_view);
        passwordTextView = findViewById(R.id.password_text_view);

        // Retrieve registration data from SharedPreferences
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        String username = sharedPreferences.getString("username", "");
        String password = sharedPreferences.getString("password", "");

        // Display the registration data
        usernameTextView.setText("Username: " + username);
        passwordTextView.setText("Password: " + password);
    }
}