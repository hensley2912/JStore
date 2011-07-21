package ViewLayer;

import java.awt.*;
import javax.swing.*;

class BillPnl extends JPanel {
    public JTextField txtTotal = new JTextField(10);
    public BillPnl() {
        JPanel pnlBill = new JPanel(new GridLayout(0, 1, 10, 10));
        pnlBill.setPreferredSize(new Dimension(180, 90));
        //pnlBill.setBackground(Color.red);
        
        JLabel lblTotal = new JLabel("Total:");
        
        //txtTotal.setText(Double.toString(SinglentonClass.getInstancePizzaSimple().getPrice()));
             
        pnlBill.add(lblTotal);
        pnlBill.add(txtTotal);
        
        add(pnlBill);
    }
}
