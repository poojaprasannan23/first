package second;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/**
 * Created by expert on 7/25/18.
 */
public class AddSub  implements ActionListener{
    private JButton button1;
    private JButton button2;
    private JPanel panel1;
    JTextField textField,textField1,textField2;
    JLabel label,label1,label2;

    AddSub(){
        JFrame frame=new JFrame("first app");
        button1=new JButton("click");
        button1=new JButton("add");
        button2=new JButton("sub");
        textField=new JTextField();
        textField1=new JTextField();
        textField2=new JTextField();
        label=new JLabel("First Name");
        label1=new JLabel("Second Name");
        label2=new JLabel("Result");
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.add(label);
        frame.add(textField);
        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        //frame.setVisible(true);
        frame.add(button1);
        frame.add(button2);
        button1.setBounds(100,400,70,30);
        button1.addActionListener(this);
        button2.setBounds(200,400,70,30);
        button2.addActionListener(this);
        textField.setBounds(120,100,90,30);
        textField1.setBounds(120,200,60,30);
        textField2.setBounds(120,300,90,40);
        label.setBounds(70,75,90,30);
        label1.setBounds(70,175,90,30);
        label2.setBounds(70,275,90,30);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
    if(e.getSource()==button1){
       // textField2.setText()=textField.getText()+textField1.getText();
       // textfield2.setText(s)
        //Integer.parseInt(textfield2.getText(s))
        int i=Integer.parseInt(textField.getText());
        int j=Integer.parseInt(textField1.getText());
        int s=i+j;
        textField2.setText(Integer.toString(s));
    }
    if(e.getSource()==button2) {
       // textField2.setText()=textField.getText()-textField1.getText();
        int i1=Integer.parseInt(textField.getText());
        int j1=Integer.parseInt(textField1.getText());
        int s1=i1-j1;
        textField2.setText(Integer.toString(s1));



    }

    }

    public static void main(String[] args) {
        new AddSub();

    }

}
