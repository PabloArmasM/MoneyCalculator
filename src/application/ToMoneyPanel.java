package application;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import view.MoneyDisplay;

class ToMoneyPanel extends JFrame implements MoneyDisplay {
    private final JTextField textField;

    public ToMoneyPanel() {
        this.textField = new JTextField("0");
        this.textField.setEditable(false);
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.textField.setHorizontalAlignment(JTextField.RIGHT);
        this.add(textField);
    }

}
