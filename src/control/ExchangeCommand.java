package control;

import ui.CurrencyDialog;
import java.util.Date;
import model.Currency;
import model.ExchangeRate;
import model.Money;
import process.Exchanger;
import ui.MoneyDialog;
import ui.MoneyDisplay;
import persistence.SQLiteExchangeRateLoader;

public class ExchangeCommand implements Command {
    private final MoneyDialog fromMoneyDialog;
    private final CurrencyDialog toCurrencyDialog;
    private final MoneyDisplay toMoneyDisplay;
    
    public ExchangeCommand(MoneyDialog fromMoneyDialog, MoneyDisplay toMoneyDisplay, CurrencyDialog toCurrencyDialog) {
        this.fromMoneyDialog = fromMoneyDialog;
        this.toMoneyDisplay = toMoneyDisplay;
        this.toCurrencyDialog = toCurrencyDialog;
    }

    @Override
    public void  execute() {
        Money money = fromMoneyDialog.get();
        Currency currency = toCurrencyDialog.get();
        ExchangeRate exchangeRate = new SQLiteExchangeRateLoader().get(new Date(),money.getCurrency(), currency);
        Money result = new Exchanger().exchange(money, exchangeRate);
        toMoneyDisplay.show(result);
    }

}
