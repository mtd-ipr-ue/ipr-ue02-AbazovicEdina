import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {
        Out.print("Jahreszahl: ");
        int year = In.readInt();

        Out.print("Monat: ");
        int month = In.readInt();

        if (month < 1 || month > 12) {
            System.out.println("Der Monat muss zwischen 1 und 12 liegen!");
            return;
        }

        int days;
        switch (month) {
            case 1: 
            case 3: 
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 12: 
                days = 31;
                break;
            case 4: 
            case 6: 
            case 9: 
            case 11: 
                days = 30;
                break;
            case 2: 
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                System.out.println("Ungültiger Monat!");
                return;
        }
        
        System.out.println("Der Monat " + month + " im Jahr " + year + " hat " + days + " Tage.");
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    
}

