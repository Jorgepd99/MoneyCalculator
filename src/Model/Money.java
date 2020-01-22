package Model;

public class Money {

    private final double amount;
    private final Currency currency;

    public Money(double a, Currency c) {
        amount = a;
        currency = c;
    }

    public double getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }
}