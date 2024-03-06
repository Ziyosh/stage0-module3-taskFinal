package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public static void toFahrenheit(int temperatureCelsius){

        float temperatureFahrenheit = (float)((temperatureCelsius*9)/5.0)+32;

        System.out.println(temperatureFahrenheit);
    }

    public static void main(String[] args){
        TemperatureConverter converter = new TemperatureConverter();
        converter.toFahrenheit(5);
        converter.toFahrenheit(1);

    }
}
