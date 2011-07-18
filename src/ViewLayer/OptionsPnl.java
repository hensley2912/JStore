package ViewLayer;

import java.awt.*;
import javax.swing.*;

public class OptionsPnl extends JPanel {

    private String[] data = {"Rojo", "Black", "Blue", "Green"};
    private JList list = new JList(data);

    public OptionsPnl() {
        JPanel pnlOptions = new JPanel(new GridLayout(0, 1));
        pnlOptions.setPreferredSize(new Dimension(180, 100));
        //pnlOptions.setBackground(Color.red);
        JPanel pnlBotones = new JPanel();
        pnlBotones.setOpaque(false);
        JButton btmAdd = new JButton("Agregar");
        JButton btmRemove = new JButton("Remover");
        
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setLayoutOrientation(JList.VERTICAL);
        list.setVisibleRowCount(4);
        JScrollPane listScroller = new JScrollPane(list);
        listScroller.setPreferredSize(new Dimension(40, 50));
        
        pnlOptions.add(list);
        pnlBotones.add(btmAdd);
        pnlBotones.add(btmRemove);
        pnlOptions.add(pnlBotones);
        
        add(pnlOptions);
    }
}
