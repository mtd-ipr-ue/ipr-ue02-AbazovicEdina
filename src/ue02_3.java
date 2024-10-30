import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        double radius = 4.0;

        // Abfrage nur für den ersten Quadranten (beide Koordinaten müssen positiv sein)

        Out.print("X-Koordinate (positiv): ");
        double x = In.readDouble();

        if( x < 0 ) {
            Out.println("Eingabe ungültig!");
            return;
        }

        Out.print("Y-Koordinate (positiv): ");
        double y = In.readDouble();

        if( y < 0 ) {
            Out.println("Eingabe ungültig!");
            return;
        }

        // c² = a² + b²
        double cQuadrat = x * x + y * y;
        Out.println(Math.sqrt(cQuadrat));

        if (!(x > radius) && !(y > radius) && (Math.sqrt(cQuadrat) >= radius)) {
            Out.println("Der Punkt (" + x + "; " + y + ") liegt innerhalb der grünen Fläche.");
        } else {
            Out.println(
                    "Der Punkt (" + x + "; " + y + ") liegt außerhalb der grünen Fläche.");
        }

    }
}
