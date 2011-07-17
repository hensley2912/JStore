package ViewLayer;

import java.awt.*;
import javax.swing.*;

class SearchPnl extends JPanel {
    
    public SearchPnl() {
        JPanel pnlSearch = new JPanel(new FlowLayout());
        JTextField txtBusqueda = new JTextField(20);
        JButton btmBusqueda = new JButton("Buscar");
        
        pnlSearch.add(txtBusqueda);
        pnlSearch.add(btmBusqueda);
        add(pnlSearch);
        
    }
}
