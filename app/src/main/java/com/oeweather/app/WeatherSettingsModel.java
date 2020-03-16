package com.oeweather.app;

public class WeatherSettingsModel {
    String cityName = "Ekaterinburg";
    boolean showWind = true;
    boolean showPressure = true;

    private static WeatherSettingsModel instance;

    public static WeatherSettingsModel getInstance() {
        instance = instance == null? new WeatherSettingsModel() : instance;
        return instance;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public boolean isShowWind() {
        return showWind;
    }

    public void setShowWind(boolean showWind) {
        this.showWind = showWind;
    }

    public boolean isShowPressure() {
        return showPressure;
    }

    public void setShowPressure(boolean showPressure) {
        this.showPressure = showPressure;
    }
}
