package com.projeto.simpleshoppingnotes;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.projeto.simpleshoppingnotes.databinding.ActivitySplashBinding;

public class SplashActivity extends AppCompatActivity {

    private ActivitySplashBinding binding;
    private Intent intent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getViewBinding();
        getHandlerThread();
        setContentView(binding.getRoot());
    }

    private ActivitySplashBinding getViewBinding(){
        return binding = ActivitySplashBinding.inflate(getLayoutInflater());
    }

    private Boolean getHandlerThread(){
        return new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                intent = new Intent(SplashActivity.this, ListaComprasActivity.class);
                startActivity(intent);
                finish();
            }
        },2000);
    }
}
