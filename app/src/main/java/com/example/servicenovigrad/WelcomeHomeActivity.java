package com.example.servicenovigrad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class WelcomeHomeActivity  extends AppCompatActivity {

    private Button signOutBtn;

    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_homepage);


        signOutBtn = findViewById(R.id.signout_button);
        mAuth = FirebaseAuth.getInstance();

        signOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                startActivity(new Intent(WelcomeHomeActivity.this, SignInActivity.class));
                finish();

            }
        });



    }
}
