package javautilobserver;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurementsChanged(80, 65, 30.4f);
		weatherData.setMeasurementsChanged(42, 53, 13.45f);
		//weatherData.setMeasurementsChanged(51, 33, 56.2f);

	}

}
