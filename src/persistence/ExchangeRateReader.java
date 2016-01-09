package persistence;

import java.util.Date;
import model.Currency;
import model.ExchangeRate;

public interface ExchangeRateReader {
        ExchangeRate get(Date date, Currency from, Currency to);
}
