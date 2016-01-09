package persistence;

import java.util.ArrayList;
import model.Currency;

public interface CurrencyReader {

    ArrayList<Currency> get();
    
}
