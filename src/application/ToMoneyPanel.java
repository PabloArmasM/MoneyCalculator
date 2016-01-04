package application;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import model.Money;
import view.MoneyDisplay;

public class ToMoneyPanel extends JFrame implements MoneyDisplay {
    private JTextField textField;

     public ToMoneyPanel() {
        this.textField = new JTextField("0");
        this.textField.setEditable(false);
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.textField.setHorizontalAlignment(JTextField.RIGHT);
        this.add(textField);
    }

    public JTextField getTextField() {
        return textField;
    }


    @Override
    public void show(Money money) {
        this.textField.setText(String.format("%.2f",money.getAmount()));
    }

}
