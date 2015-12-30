package application;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import model.Currency;
import view.CurrencyDialog;

class ToCurrencyPanel extends JFrame implements CurrencyDialog{
    
    private JComboBox to;

    public ToCurrencyPanel(JComboBox comboBox) {
        this.to = to;
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.to.setSelectedIndex(2);
        this.add(to);
    }

    @Override
    public Currency get() {
                return new Currency(to.getSelectedItem().toString());
    }

}
