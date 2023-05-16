public class BmiService {

    public double calculate(double m, double h) {
        double bodyMass;
        double square = h * h;
        bodyMass = m / square;
        return (int) bodyMass;
    }
}
