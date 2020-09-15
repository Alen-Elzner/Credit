public class Main {
    public static void main(String[] args) {
        RateService service = new RateService();
        double Loan = service.calculate(1_000_000, 9.99, 12);
        System.out.println(Loan);
    }
}
