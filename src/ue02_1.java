import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
        Out.print("Zahl 1: ");
        int firstNumber = In.readInt();

        Out.print("Zahl 2: ");
        int secondNumber = In.readInt();

        Out.print("Zahl 3: ");
        int thirdNumber = In.readInt();

        int maximum = firstNumber;

        if (secondNumber > maximum) {
            maximum = secondNumber;
        }

        if (thirdNumber > maximum) {
            maximum = thirdNumber;
        }

        System.out.println("Das Maximum der drei Zahlen ist: " + maximum);
    }
}
