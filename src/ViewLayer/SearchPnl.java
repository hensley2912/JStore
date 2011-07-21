package ViewLayer;

import java.awt.*;
import javax.swing.*;

class SearchPnl extends JPanel {
    
    public SearchPnl() {    
        JTextField txtBusqueda = new JTextField(20);
        JButton btmBusqueda = new JButton("Buscar");
        
        add(txtBusqueda);
        add(btmBusqueda);
        
    }
}
