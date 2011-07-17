package ViewLayer;

import java.awt.*;
import javax.swing.*;


class PizzaPnl extends JPanel {

    private Image imgBackground;

    @Override
    public void paint(Graphics g) {
        g.drawImage(this.imgBackground, 0, 0, this);
        setOpaque(false);
        super.paint(g);
    }



    public PizzaPnl() {
        JPanel pnlPhone = new JPanel();
        //this.imgBackground = new ImageIcon(getClass().getResource("Resources/logo.jpg" ) ).getImage();
        pnlPhone.setBackground(Color.red);

        add(pnlPhone, BorderLayout.WEST);
    }
}
