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

        int max = firstNumber;

        if (secondNumber > max) {
            max = secondNumber;
        }

        if (thirdNumber > max) {
            max = thirdNumber;
        }

        Out.println("Maximum: " + max);
    }
}
