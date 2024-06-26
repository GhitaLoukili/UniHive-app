package com.biog.unihiveandroid.authentication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.splashscreen.SplashScreen;

import com.biog.unihiveandroid.R;

public class WelcomePage extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
    }

    public void onLoginBtnClick(View view) {
        startActivity(new Intent(WelcomePage.this, LoginActivity.class));
    }

    public void onCreateAccountBtnClick(View view) {
        startActivity(new Intent(WelcomePage.this, SignupActivity.class));
    }
}
