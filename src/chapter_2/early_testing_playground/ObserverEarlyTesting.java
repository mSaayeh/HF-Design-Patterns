package chapter_2.early_testing_playground;

public class ObserverEarlyTesting {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(6);
        Dog dog = new Dog(weatherData);
        Cat cat = new Cat(weatherData);

        weatherData.subscribeObserver(dog);
        weatherData.setTemp(3);
        weatherData.subscribeObserver(cat);
        weatherData.setTemp(6);
        weatherData.setTemp(1);
        weatherData.unsubscribeObserver(dog);
        weatherData.setTemp(8);
        weatherData.setTemp(9);
        weatherData.unsubscribeObserver(cat);
        weatherData.setTemp(10);
    }
}
