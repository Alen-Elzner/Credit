public class Main {
    public static void main(String[] args) {
        RateService service = new RateService();
        double loan = service.calculate(1_000_000.0, 0.0999, 12.0);
        System.out.println(loan);
    }
}
