package ViewLayer;

import java.awt.*;
import javax.swing.*;

public class Components extends JPanel {

    public Components() {
        JPanel pnlComponents = new JPanel(new GridLayout(0, 1));
        JPanel pnlUp = new JPanel();
        JPanel pnlCenter = new JPanel(new GridLayout(0, 3));

        pnlUp.add(new SearchPnl());
        pnlCenter.add(new PizzaPnl());
        pnlCenter.add(new OptionsPnl());
        pnlCenter.add(new BillPnl());
        pnlComponents.add(pnlUp, BorderLayout.NORTH);
        pnlComponents.add(pnlCenter, BorderLayout.CENTER);
        pnlComponents.add(new TablePnl(), BorderLayout.SOUTH);
        
        add(pnlComponents);
    }
}
