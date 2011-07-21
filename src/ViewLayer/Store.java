
package ViewLayer;

import javax.swing.*;


public class Store extends JFrame{
    public void windows(){
        JFrame frame = new JFrame();
        frame.getContentPane().add(new Components());
        //Propiedades
        //frame.setSize(750, 500);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
    }
}
