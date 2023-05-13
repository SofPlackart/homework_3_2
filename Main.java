public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double h = 1.87;
        double m = 98;
        double bodyMass = service.calculate (m, h);
        System.out.println("Индекс массы тела: " + bodyMass);
    }
}
