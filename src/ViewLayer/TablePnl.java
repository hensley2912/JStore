package ViewLayer;

//import ControllerLayer.ModelTable;
import java.awt.*;
import javax.swing.*;

class TablePnl extends JPanel {

    JTable tableIngredients = new JTable();

    public TablePnl() {

        JPanel pnlTable = new JPanel();
        pnlTable.setPreferredSize(new Dimension(500, 50));
        pnlTable.setOpaque(false);
        //tableIngredients.setModel(new ModelTable());
        tableIngredients.setPreferredScrollableViewportSize(new Dimension(900, 50));
        tableIngredients.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(tableIngredients);

        pnlTable.add(scrollPane);
        add(pnlTable);

    }
}
