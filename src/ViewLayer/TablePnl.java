package ViewLayer;

import ControllerLayer.SinglentonClass;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class TablePnl extends JPanel{

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
                SinglentonClass.getInstance().deleteDataModel(tableIngredients.getSelectedRow());
            }
        });
    }
}
