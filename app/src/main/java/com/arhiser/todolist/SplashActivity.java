package com.arhiser.todolist;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.arhiser.todolist.screens.details.NoteDetailsActivity;
import com.arhiser.todolist.screens.main.MainActivity;

import java.util.concurrent.TimeUnit;

public class SplashActivity extends AppCompatActivity {

    // Время задержки в миллисекундах
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Задержка для показа экрана загрузки
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Переход к главному экрану приложения после задержки
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);

                // Закрытие экрана загрузки
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}