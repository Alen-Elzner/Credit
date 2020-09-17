public class Main {
    public static void main(String[] args) {
        RateService service = new RateService();
        int loan = (int)service.calculate(1_000_000.0, 0.0999, 36.0);
        System.out.println(loan);
    }
}
