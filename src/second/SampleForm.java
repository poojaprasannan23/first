package second;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Created by expert on 7/25/18.
 */
public class SampleForm implements ActionListener{
    private JButton button1;
    private JPanel panel1;
    JTextField textField,textField1;
    JLabel label;
    SampleForm(){
        JFrame frame=new JFrame("First App");
        button1=new JButton("click");
        frame.setLayout(null);
        textField=new JTextField();
        textField1=new JTextField();
        label=new JLabel("First Name");

        frame.setSize(500,500);
        frame.add(button1);
        frame.add(label);
        frame.add(textField);

        button1.setBounds(120,200,70,30);
        button1.addActionListener(this);
        textField.setBounds(120,100,90,30);
        label.setBounds(70,75,90,30);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==button1)
        textField.setText("hello java");
       //textField1.getText()//to get text from textfield
        JOptionPane.showMessageDialog(null,"hello");

    }

    public static void main(String[] args) {
        new SampleForm();
    }
}
