package chapter_2.early_testing_playground;

public class Cat implements Observer {
    WeatherData weatherData;

    public Cat(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void notifyDataChange() {
        System.out.println("The cat sees " + weatherData.getTemp());
    }
}
