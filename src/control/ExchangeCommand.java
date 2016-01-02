package control;

import view.CurrencyDialog;
import java.util.Date;
import model.Currency;
import model.ExchangeRate;
import model.Money;
import process.Exchanger;
import view.MoneyDialog;
import view.MoneyDisplay;
import view.SQLiteExchangeRateLoader;

public class ExchangeCommand implements Command {
    private MoneyDialog fromMoneyDialog;
    private CurrencyDialog toCurrencyDialog;
    private MoneyDisplay toMoneyDisplay;
    
    public ExchangeCommand (){
        
    }
    
    @Override
    public void excecute() {
        Money money = fromMoneyDialog.get();
        Currency currency = toCurrencyDialog.get();
        ExchangeRate exchangeRate = new SQLiteExchangeRateLoader().get(new Date(),money.getCurrency(), currency);
        Money result = new Exchanger().exchange(money, exchangeRate);
        toMoneyDisplay.show(result);
    }

}
