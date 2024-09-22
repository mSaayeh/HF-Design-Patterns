package chapter_2.early_testing_playground;

import java.util.List;

public class WeatherData extends Observable {
    private double temp;

    public WeatherData(double temp) {
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
        onDataChange();
    }
}
