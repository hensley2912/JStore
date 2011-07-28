package ViewLayer;

import ControllerLayer.SinglentonClass;
import Ingredients.Pizza;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class TablePnl extends JPanel {

    public static Pizza pizza = SinglentonClass.getInstancePizzaSimple();
    JTable tableIngredients = new JTable();

    public TablePnl() {

        JPanel pnlTable = new JPanel(new FlowLayout());

        //pnlTable.setBackground(Color.red);
        tableIngredients.setModel(SinglentonClass.getInstance());
        tableIngredients.setPreferredScrollableViewportSize(new Dimension(450, 75));
        tableIngredients.setFillsViewportHeight(true);

        JButton btmRemove = new JButton("Remover");
        btmRemove.setPreferredSize(new Dimension(100, 90));
        JButton btmBill = new JButton("Facturar");
        btmBill.setPreferredSize(new Dimension(100, 90));

        JScrollPane scrollPane = new JScrollPane(tableIngredients);

        pnlTable.add(scrollPane);
        pnlTable.add(btmRemove);
        pnlTable.add(btmBill);
        add(pnlTable);

        btmRemove.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                //System.out.println(tableIngredients.getValueAt(tableIngredients.getSelectedRow(), 0));
                
                try {
                    //Actualiza el decorator
                    //SinglentonClass.getInstanceControlDecorator().updateDecorator(tableIngredients.getValueAt(tableIngredients.getSelectedRow(), 0).toString());

                    
                    
                    SinglentonClass.getInstance().deleteDataModel(tableIngredients.getSelectedRow());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "No existen articulos seleccionados!", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
}
