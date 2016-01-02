
package model;

public class ExchangeRate {
    private final Currency from;
    private final Currency to;
    private final float rate;

    public ExchangeRate(Currency from, Currency to, float rate) {
        this.from = from;
        this.to = to;
        this.rate = rate;
    }

    public double getRate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Currency getTo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
