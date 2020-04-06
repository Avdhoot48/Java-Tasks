package loginform;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class LoginFrame extends JFrame 
{
    JLabel lblUsrNm,lblUsrPass,lblError;
    JButton btnLogin,btnCancel;
    JTextField UsrNm,UsrPass;
    public LoginFrame() 
    {
        lblUsrNm=new JLabel("Username:");
        lblUsrNm.setBounds(20,50 ,200,30);
        UsrNm=new JTextField();
        UsrNm.setBounds(100, 50,120,30);
        
        lblUsrPass=new JLabel("Password:");
        lblUsrPass.setBounds(20, 100, 200, 30);
        UsrPass=new JTextField();
        UsrPass.setBounds(100, 100, 120, 30);
        
        lblError=new JLabel();
        lblError.setBounds(100,180,200,50);
        
        btnLogin=new JButton("Login");
        btnLogin.setBounds(60,150,80,30);
         btnLogin.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e)
        {
           String val=UsrNm.getText();
           String val2=UsrPass.getText();
           setVisible(false);
           if(val.contentEquals("Avdhoot")&&val2.contentEquals("1234"))
           {
            HomeFrame frame=new HomeFrame();
           }
           else
           {
               lblError.setText("Login Error!!!");
               setVisible(true);
           }
           
        }
        });
        
        btnCancel=new JButton("Cancel");
        btnCancel.setBounds(160, 150, 80, 30);
        btnCancel.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e)
        {
            UsrNm.setText("");
            UsrPass.setText("");
        }
        });
                
        add(lblUsrNm);
        add(UsrNm);
        add(lblUsrPass);
        add(UsrPass);
        add(btnLogin);
        add(btnCancel);
        add(lblError);
        
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        setTitle("Login Frame");
        
    }
    
}
