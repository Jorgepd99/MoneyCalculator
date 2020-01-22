package Model;

import java.util.Date;

public class ExchangeRate {
    private final double rate;
    private final Date date;
    private final Currency from, to;

    public ExchangeRate(double r, Date d, Currency f, Currency t) {
        rate = r;
        date = d;
        from = f;
        to = t;
    }

    public double getRate() {
        return rate;
    }

    public Date getDate() {
        return date;
    }

    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public String toString() {
        return "ExchangeRate{" + "rate=" + rate +
                ", date=" + date + ", from=" + from +
                ", to=" + to + '}';
    }
}