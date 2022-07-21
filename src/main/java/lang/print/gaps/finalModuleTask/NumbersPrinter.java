package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {

    public static boolean printIsPositive(int number) {
        number = 24;
        boolean myTrue = true;
        System.out.println(myTrue);
        return (24>0);

    }

    public static boolean printIsNegative(int number){
        number = -1;
        boolean myFalse = false;
        System.out.println(myFalse);
        return(-1<=0);

    }

    public static void main(String[] args) {
        printIsPositive((int)24);
        printIsNegative((int)-24);

    }
}





