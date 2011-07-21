package ViewLayer;

import ControllerLayer.Ingredient;
import ControllerLayer.SinglentonClass;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class OptionsPnl extends JPanel{

    private String[] data = {"Pepperoni", "Queso", "Blue", "Green", "Green", "Green", "Green"};
    private double[] dataPrecio = {1.00, 1.00, 3.00, 4.00, 5.00, 6.00, 7.00};
    private JList list = new JList(data);
    
    public OptionsPnl() {

        JPanel pnlOptions = new JPanel(new GridLayout(0, 2, 10, 0));
        pnlOptions.setPreferredSize(new Dimension(200, 90));
        //pnlOptions.setBackground(Color.red);
        JButton btmAdd = new JButton("Agregar");
        //list.setPreferredSize(new Dimension(250, 500));
        JScrollPane listScroller = new JScrollPane(list);
        
        pnlOptions.add(listScroller);
        pnlOptions.add(btmAdd);
        
        add(pnlOptions);
        
        btmAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {           
                SinglentonClass.getInstance().insertDataModel(new Ingredient(list.getSelectedValue().toString(), dataPrecio[list.getSelectedIndex()]));                
                SinglentonClass.getInstanceControlIngredients().addIngredient(list.getSelectedValue().toString());
                //new BillPnl.txtTotal   
                
            }
        });
        

    }
}
