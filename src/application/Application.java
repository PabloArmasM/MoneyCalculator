package application;

import control.ExchangeCommand;
import java.awt.Dimension;
import java.awt.PopupMenu;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import model.Currency;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import view.SQLiteCurrencyLoader;

public class Application extends JFrame{

    public static void main(String[] args) {
        new Application().setVisible(true);
    }
    private ExchangeCommand exchangeCommand;
    private JPanel fromMoneyPanel;
    private ToMoneyPanel toMoneyPanel;

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

    private JPanel components() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        ArrayList<Currency> currencyList = new SQLiteCurrencyLoader().get();
        panel.add(fromComponents(currencyList));
        panel.add(toComponents(currencyList));
        return panel;
    }

    private JPanel fromComponents(ArrayList<Currency> currencyList) {
        JTextField textField = new JTextField("0");
        textField.addKeyListener(doCommandOnType("Exchange"));
        this.fromMoneyPanel = new FromMoneyPanel(fromOptions(currencyList),textField);
        return fromMoneyPanel;
    }

    private JPanel toComponents(ArrayList<Currency> currencyList) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        this.toMoneyPanel = new ToMoneyPanel();
        panel.add(toMoneyPanel);
        panel.add(toOptions(currencyList));
        return panel;
    }

    private KeyListener doCommandOnType(String exchange) {
        return new KeyListener() {
            @Override
            public void keyReleased(KeyEvent e) {
                if(!fromMoneyPanel.getTextField().getText().equals(""))
                    exchangeCommand.execute();
                else 
                    toMoneyPanel.getTextField().setText("");
            }

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

        };
    }
    
    private JComboBox fromOptions(ArrayList <Currency> currencyList){
        JComboBox comboBox = new JComboBox();
        for (Currency currency : currencyList) 
            comboBox.addItem(currency.getCode());
        comboBox.addActionListener(doCommandOnComboBox("Exchange"));
        return comboBox;
        
    }

    private ToCurrencyPanel toOptions(ArrayList<Currency> currencyList) {
        JComboBox comboBox = new JComboBox();
        for (Currency currency : currencyList) 
            comboBox.addItem(currency.getCode());
        ToCurrencyPanel toCurrencyPanel = new ToCurrencyPanel(comboBox);
        comboBox.addActionListener(doCommandOnComboBox("Exchange"));
        return toCurrencyPanel;
    }

    private ActionListener doCommandOnComboBox(String exchange) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
