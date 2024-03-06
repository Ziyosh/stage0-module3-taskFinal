package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public static void calculateSum(int number) {

        int sum = 0;

        sum += number%10;
        number /=10;

        sum += number%10;
        number/=10;

        sum += number%10;
        number/=10;

        sum += number%10;
        number/=10;

        System.out.println(sum);
    }
    public static void main(String[] args){

    }
}
