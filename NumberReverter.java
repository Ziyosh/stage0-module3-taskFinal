package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public static void revert(int number) {

        int reversedNum = 0;

        reversedNum += (number%10)*100;// Add the last digit multiplied by 100
        number /= 10;// Remove the last digit

        reversedNum += (number%10)*10;
        number /= 10;

        reversedNum += number;

        System.out.println(reversedNum);


    }

    public static void main(String[] args){


    }
}
