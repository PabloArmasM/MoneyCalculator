package control;

import view.CurrencyDialog;
import java.sql.Date;
import java.util.concurrent.Exchanger;
import model.Currency;
import model.ExchangeRate;
import model.Money;
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

    public void execute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
