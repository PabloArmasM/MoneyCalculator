package application;

import control.ExchangeCommand;
import java.awt.Dimension;
import java.awt.PopupMenu;
import javax.swing.JFrame;

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
        return null;
    }
    
}
