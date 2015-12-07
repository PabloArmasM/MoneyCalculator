package application;

import java.awt.Dimension;
import java.awt.PopupMenu;
import javax.swing.JFrame;

public class Application extends JFrame{

    public static void main(String[] args) {
        new Application().setVisible(true);
    }

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private PopupMenu components() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
