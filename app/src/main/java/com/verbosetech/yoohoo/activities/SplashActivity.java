package com.verbosetech.yoohoo.activities;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.verbosetech.yoohoo.R;
import com.verbosetech.yoohoo.utils.Helper;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        final Helper helper = new Helper(this);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, helper.getLoggedInUser() != null ? MainChatActivity.class : SignInActivity.class));
                finish();
            }
        }, 1500);
    }
}
