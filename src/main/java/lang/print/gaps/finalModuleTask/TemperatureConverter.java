package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public static void toFahrenheit(int temperatureCelsius){
        temperatureCelsius = 13;
        float myTemp = temperatureCelsius;
        float temperatureFahrenheit;
        temperatureFahrenheit = (float)((temperatureCelsius*9)/5)+32;
        System.out.println(temperatureFahrenheit);
    }

    public static void main(String[] args){
        toFahrenheit((int) 55.4);
    }
}
