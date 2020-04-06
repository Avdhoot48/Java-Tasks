package loginform;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class LoginForm extends JFrame
{
    JTextField Name,Pass,Mail,Cont;
    JLabel lblName,lblPass,lblMail,lblCont;
    JButton btnSubmit,btnCancel;

    public LoginForm() 
    {
        lblName=new JLabel(" Name:");
        lblName.setBounds(20,40,220,30);
        Name=new JTextField();
        Name.setBounds(90, 40, 90,30);
        
        lblPass=new JLabel(" Password:");
        lblPass.setBounds(20, 80,180,30);
        Pass=new JTextField();
        Pass.setBounds(90,80,90,30);
        
        lblMail=new JLabel(" E-mail:");
        lblMail.setBounds(20,120,200,30 );
        Mail=new JTextField();
        Mail.setBounds(90, 120,140 , 30);
        
        lblCont=new JLabel(" Contact:");
        lblCont.setBounds(20, 160,200, 30);
        Cont=new JTextField();
        Cont.setBounds(90, 160,90, 30);
        
        btnSubmit=new JButton("Submit");
        btnSubmit.setBounds(90,200,90,25);
        btnSubmit.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Name.setText("Avdhoot");
            Pass.setText("1234");
            Mail.setText("abhuvad48@gmail.com");
            Cont.setText("82XXXXXXXX");
            
            setVisible(true);
            LoginFrame frame=new LoginFrame();
        }
        });
        
          btnCancel=new JButton("Cancel");
        btnCancel.setBounds(180,200,90,25);
        btnCancel.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Name.setText("");
            Pass.setText("");
            Mail.setText("");
            Cont.setText("");
        }
        });
        
        add(lblName);
        add(Name);
        add(lblPass);
        add(Pass);
        add(lblMail);
        add(Mail);
        add(lblCont);
        add(Cont);
        add(btnSubmit);
        add(btnCancel);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        setTitle("Registration Frame");
                
    } 
    public static void main(String[] args)
    {
        LoginForm form=new LoginForm();
    }
    
}
