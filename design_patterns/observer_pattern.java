package design_patterns;
import java.util.ArrayList;
import java.util.List;

// Example of observer pattern.
public class observer_pattern {
    public static void main(String args[]){
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.WeatherChanged();
    }
}


class WeatherStation{
    public void WeatherChanged(){
        WeatherData weatherData = new WeatherData();
        DisplayElement currentDisplay = new CurrentConditionsDisplay(weatherData);
        DisplayElement weatherstatics = new StatisticsDisplay(weatherData);
        weatherData.setMeasurements("First","Second","third");

    }
}

interface Subject{
    public void registerObserver(Observer o);
    public void notifyObserver();
    public void removeObserver(Observer o);
}
interface Observer{
    public void update();
}

interface DisplayElement{// related to observers.
    public void display();
}

// concrete implement of the subject.

class WeatherData implements Subject {

    private List<Observer> observers;
    private String humidity;
    private String temperature;
    private String pressure;


    public WeatherData(){
        observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer obsever : observers){
            System.out.println(obsever.toString());
            obsever.update();
        }
    }
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void measurementChanged(){
        this.notifyObserver();
    }

    public void setMeasurements(String temperature, String humidity, String pressure){
        this.pressure = pressure;
        this.temperature = temperature;
        this.humidity = humidity;
        measurementChanged();
    }

    public String getTemperature(){
        return this.temperature;
    }
    public String getHumidity(){
        return this.humidity;
    }
    public String getPressure(){
        return this.pressure;
    }
}

class CurrentConditionsDisplay implements Observer, DisplayElement {

    private String temperature;
    private String humidity;
    private WeatherData weatherData;/// using the composition we are changing the data/ updating the observers.

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("CurrentCOnditionsDisplay-> ");
        System.out.println("Temperature-> "+ temperature+" humidity -> "+ humidity);
    }
}


class StatisticsDisplay implements Observer, DisplayElement {

    private String pressure;
    private WeatherData weatherData;/// using the composition we are changing the data/ updating the observers.

    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update() {
        this.pressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("StatisticsDisplay-> ");
        System.out.println("Pressure-> "+ pressure);
    }
}