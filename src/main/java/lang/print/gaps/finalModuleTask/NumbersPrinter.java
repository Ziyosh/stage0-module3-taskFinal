package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public static void printIsPositive(int number) {

        number = -24;
        String result = (number > 0) ? "True" : "False";
    }

    public static void main(String[] args){
        printIsPositive(Integer.parseInt("False"));
    }


}
