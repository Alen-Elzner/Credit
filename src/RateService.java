public class RateService {
    public double calculate(double sum, double percent, int term) {
        double dischargeMonth =  (percent / 12);
        double coefficient = dischargeMonth * ((1 + dischargeMonth) ^ term) / ((1 + dischargeMonth) ^ term) - 1;
        var monthlyPayment = coefficient * sum;
        return monthlyPayment;
    }
}
