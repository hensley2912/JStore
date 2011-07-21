package ViewLayer;

import java.awt.*;
import javax.swing.*;

public class Components extends JPanel {

    public Components() {
        JPanel pnlComponents = new JPanel(new GridLayout(0, 1));
        JPanel pnlCenter = new JPanel(new GridLayout(0, 3));

        pnlCenter.add(new PizzaPnl());
        pnlCenter.add(new OptionsPnl());
        pnlCenter.add(new BillPnl());
        
        //pnlComponents.add(new SearchPnl());
        pnlComponents.add(pnlCenter);
        pnlComponents.add(new TablePnl());
        
        add(pnlComponents);
    }
}
