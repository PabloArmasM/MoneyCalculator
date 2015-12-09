package application;

import java.awt.PopupMenu;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Currency;
import view.MoneyDialog;

class FromMoneyPanel extends JPanel implements MoneyDialog {
    private final JTextField textField;
    private final JComboBox comboBox;

    public FromMoneyPanel(JComboBox fromOptions, JTextField textField) {
        this.textField = textField;
        this.comboBox = comboBox;
        this.textField.setHorizontalAlignment(JTextField.RIGHT);
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.add(textField);
        this.add(comboBox);
    }

    @Override
    public Currency get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
