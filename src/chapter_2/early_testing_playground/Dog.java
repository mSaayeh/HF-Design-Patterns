package chapter_2.early_testing_playground;

public class Dog implements Observer{
    WeatherData weatherData;

    public Dog(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void notifyDataChange() {
        System.out.println("I've changed " + weatherData.getTemp());
    }
}
