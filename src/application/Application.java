package application;

import control.ExchangeCommand;
import java.awt.Dimension;
import java.awt.PopupMenu;
import java.util.ArrayList;
import java.util.Currency;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Application extends JFrame{

    public static void main(String[] args) {
        new Application().setVisible(true);
    }
    private ExchangeCommand exchangeCommand;

    public Application() {
        deployUI();
        createCommands();
    }

    private void deployUI() {
        this.setTitle("MoneyCalculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().add(components());
        this.setPreferredSize(new Dimension(300, 100));
        this.pack();
        this.setResizable(false);
    }

    private void createCommands() {
        this.exchangeCommand = new ExchangeCommand();
    }

    private PopupMenu components() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        ArrayList<Currency> currencyList = new SQLiteCurrencyLoader().get();
        panel.add(fromComponents(currencyList));
        panel.add(toComponents(currencyList));
        return panel;
    }

    private PopupMenu fromComponents(ArrayList<Currency> currencyList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private PopupMenu toComponents(ArrayList<Currency> currencyList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
