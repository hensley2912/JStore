package ViewLayer;

import ControllerLayer.SinglentonClass;
import java.awt.*;
import javax.swing.*;

public class BillPnl extends JPanel {

    public static JTextField txtTotal = new JTextField(10);

    public BillPnl() {
        JPanel pnlBill = new JPanel(new GridLayout(0, 1, 10, 10));
        pnlBill.setPreferredSize(new Dimension(180, 90));
        //pnlBill.setBackground(Color.red);

        JLabel lblTotal = new JLabel("Total:");

        txtTotal.setText(Double.toString(SinglentonClass.getInstancePizzaSimple().getPrice()));

        //SinglentonClass.getInstance().insertDataModel(new Ingredient(list.getSelectedValue().toString(), dataPrecio[list.getSelectedIndex()]));                
        pnlBill.add(lblTotal);
        pnlBill.add(txtTotal);

        add(pnlBill);
    }
}
