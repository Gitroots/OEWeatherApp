package com.oeweather.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class WeatherSettingsActivity extends Activity {
    private static final String CITY_NAME = "city_name";
    private EditText cityName;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather_settings);

        findViewById(R.id.back_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBack();
            }
        });

        cityName = findViewById(R.id.city_name_edit);
        restoreData(savedInstanceState);
    }

    private void restoreData(Bundle savedInstanceState) {
        if (savedInstanceState == null) return;
        cityName.setText(savedInstanceState.getString(CITY_NAME, "Ekaterinburg"));
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(CITY_NAME, cityName.getText().toString());

    }

    void onBack() {
         //TODO: save state
        finish();
    }

    @Override
    public void  onBackPressed() {
        //TODO:save state
        super.onBackPressed();
    }

}

