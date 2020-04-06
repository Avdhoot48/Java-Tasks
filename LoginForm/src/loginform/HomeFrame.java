
package loginform;
import javax.swing.*;
public class HomeFrame extends JFrame  
{
    JLabel lblGreet;

    public HomeFrame()
    {
        lblGreet=new JLabel("Wlecome to Home Page");
        lblGreet.setBounds(60, 50, 200, 30);
        
        add(lblGreet);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    
}
