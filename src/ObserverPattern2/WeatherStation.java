package ObserverPattern2;

public class WeatherStation {

    public static void main(String... args){
        WeatherData wData = new WeatherData();

        //new display we created

        wData.addObserver(new CurrentConditionsDisplay());
        wData.addObserver(new ForecastDisplay());
        wData.addObserver(new StatisticsDisplay());

        System.out.println("Sending Weather Data");
        wData.setMeasurements(27,45,890);
        System.out.println("Sending Weather Data");
        wData.setMeasurements(25,50,895);

        System.out.println("Sending Weather Data");
        wData.setMeasurements(23,55,900);
    }
}
