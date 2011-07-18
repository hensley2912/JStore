package ViewLayer;

import java.awt.*;
import javax.swing.*;

class BillPnl extends JPanel {

    public BillPnl() {
        JPanel pnlBill = new JPanel(new GridLayout(0, 1, 10, 10));
        pnlBill.setPreferredSize(new Dimension(180, 100));
        //pnlBill.setBackground(Color.red);
        
        JLabel lblTotal = new JLabel("Total:");
        JTextField txtTotal = new JTextField(10); 
        JButton btmBill = new JButton("Facturar");
        
        pnlBill.add(lblTotal);
        pnlBill.add(txtTotal);
        pnlBill.add(btmBill);
        
        add(pnlBill);
    }
}
