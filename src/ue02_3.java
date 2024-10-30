import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        double radius = 4.0;

        System.out.print("X-Koordinate: ");
        double x = In.readDouble();

        System.out.print("Y-Koordinate: ");
        double y = In.readDouble();

        // c² = a² + b²
        double cQuadrat = x * x + y * y;
        //Out.println(Math.sqrt(cQuadrat));

        if (!(x > radius) && !(y > radius) && (Math.sqrt(cQuadrat) <= radius)) {
            Out.println("Der Punkt (" + x + ", " + y + ") liegt innerhalb der grünen Fläche (im Kreis).");
        } else {
            Out.println(
                    "Der Punkt (" + x + ", " + y + ") liegt außerhalb der grünen Fläche (außerhalb des Kreises).");
        }

    }
}
