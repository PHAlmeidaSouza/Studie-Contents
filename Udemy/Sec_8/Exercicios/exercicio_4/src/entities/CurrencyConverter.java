package entities;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double finalValue(double dollarPrice, double dollarsQuantity) {
        return dollarsQuantity * dollarPrice * (1.0 + IOF);
    }
}
