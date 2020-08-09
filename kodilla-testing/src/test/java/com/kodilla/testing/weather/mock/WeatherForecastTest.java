package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTest {

    private static Map<String, Double> temperaturesMap;

    @Mock
    private Temperatures temperaturesMock;

    @BeforeAll
    public static void beforeAllTestsSetup() {
        temperaturesMap = new HashMap<>();
        temperaturesMap.put("Bern", 25.5);
        temperaturesMap.put("Dublin", 26.2);
        temperaturesMap.put("London", 24.8);
        temperaturesMap.put("Madrid", 25.2);
        temperaturesMap.put("Paris", 26.1);
    }

    @Test
    void testCalculateAverageTemperatureWithMock() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        double sumOfTemperatures = 0;

        //When
        Map<String, Double> temperatures = weatherForecast.calculateForecast();
        for (Double values : temperatures.values()) {
            sumOfTemperatures += values;
        }
        double averageTemperature = sumOfTemperatures / temperatures.size();

        //Then
        Assertions.assertEquals("26.56", String.format("%.2f", averageTemperature));
    }

    @Test
    void testCalculateMedianTemperatureWithMock() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        Map<String, Double> temperatures = weatherForecast.calculateForecast();
        List<Double> listOfTemperatures = new ArrayList<>(temperatures.values());
        Collections.sort(listOfTemperatures);
        double medianTemperature;
        if (listOfTemperatures.size() % 2 == 0 ) {
            medianTemperature = listOfTemperatures.get(listOfTemperatures.size() / 2) +
                    listOfTemperatures.get((listOfTemperatures.size() / 2) - 1) / 2;
        } else {
            medianTemperature = listOfTemperatures.get((listOfTemperatures.size() / 2));
        }

        //Then
        Assertions.assertEquals(26.5, medianTemperature);
    }

    @Test
    void testCalculateForecastWithMock() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
}