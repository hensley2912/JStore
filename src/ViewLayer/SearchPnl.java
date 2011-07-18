package ViewLayer;

import java.awt.*;
import javax.swing.*;

class SearchPnl extends JPanel {
    
    public SearchPnl() {
        JPanel pnlSearch = new JPanel(new FlowLayout());
        pnlSearch.setPreferredSize(new Dimension(600,100));
        pnlSearch.setBackground(Color.red);
        
        JTextField txtBusqueda = new JTextField(20);
        JButton btmBusqueda = new JButton("Buscar");
        
        pnlSearch.add(txtBusqueda);
        pnlSearch.add(btmBusqueda);
        add(pnlSearch);
        
    }
}
