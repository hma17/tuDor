package com.example.tudor;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class LogInActivity extends AppCompatActivity {


    private String TAG = "LogInActivity";

    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogIn;
    private Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_login);

       // checkForCurrentUser();

        getViewIds();

        //setupButtons();
    }

    private void getViewIds() {
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogIn = findViewById(R.id.btnlogIn);
        btnSignUp = findViewById(R.id.btnSignUp);
    }

}

