package com.oeweather.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class  MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.weather_settings_label).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWeatherSettings();
            }
        });
    }

    void openWeatherSettings() {
        startActivity(new Intent(this,WeatherSettingsActivity.class));
    }
}
