public class RateService {
    public double calculate(double sum , double percent , double term) {
        double dischargeMonth = percent / 12;
        double a = 1 + dischargeMonth;
        double coefficient = dischargeMonth * Math.pow(a, term) / Math.pow(a, term) - 1;
        double monthlyPayment = coefficient * sum;
        return monthlyPayment;
    }
}
