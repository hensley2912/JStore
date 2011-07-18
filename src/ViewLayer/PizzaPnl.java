package ViewLayer;

import java.awt.*;
import javax.swing.*;


class PizzaPnl extends JPanel {

    public PizzaPnl() {
        JPanel pnlPizza = new JPanel();
        //this.imgBackground = new ImageIcon(getClass().getResource("Resources/logo.jpg" ) ).getImage();
        pnlPizza.setPreferredSize(new Dimension(180, 100));
        //pnlPizza.setBackground(Color.red);
        pnlPizza.setOpaque(false);
        
        add(pnlPizza, BorderLayout.WEST);
    }
}
