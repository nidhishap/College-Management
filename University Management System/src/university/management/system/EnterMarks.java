package university.management.system;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

public class EnterMarks extends JFrame implements ActionListener{

    JFrame f;
    JLabel id,l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t23,t45,t67,t89,t1011;
    JButton b1;

    EnterMarks(){

    f=new JFrame("Marks");

        f.setBackground(Color.white);
        f.setLayout(null);
        id=new JLabel();
        id.setBounds(0,0,900,700);
        id.setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/exams.jpg"));
        Image i3 = img.getImage().getScaledInstance(1220, 700,Image.SCALE_DEFAULT); //length and width
        ImageIcon icc3 = new ImageIcon(i3);
        id.setIcon(icc3);
        f.add(id);
        
        l1 = new JLabel("Enter marks of Student");
        l1.setFont(new Font("serif", Font.BOLD, 30));
        l1.setBounds(50,0,500,80);
        id.add(l1);

        l2 = new JLabel("Enter Roll Number");
        l2.setBounds(50,70,200,40);
        id.add(l2);

        t1 = new JTextField();
        t1.setBounds(180,80,200,20);
        id.add(t1);

        l3 = new JLabel("Enter Subject");
        l3.setBounds(50,150,200,40);
        id.add(l3);

        l4 = new JLabel("Enter CIE Marks");
        l4.setBounds(250,150,200,40);
        id.add(l4);
        
        l5 = new JLabel("Enter SEE Marks");
        l5.setBounds(450,150,200,40);
        id.add(l5);

        t2 = new JTextField();
        t2.setBounds(50,200,200,20);
        id.add(t2);

        t3 = new JTextField();
        t3.setBounds(250,200,200,20);
        id.add(t3);
        
        t23 = new JTextField();
        t23.setBounds(450,200,200,20);
        id.add(t23);

        t4 = new JTextField();
        t4.setBounds(50,230,200,20);
        id.add(t4);

        t5 = new JTextField();
        t5.setBounds(250,230,200,20);
        id.add(t5);
        
        t45 = new JTextField();
        t45.setBounds(450,230,200,20);
        id.add(t45);

        t6 = new JTextField();
        t6.setBounds(50,260,200,20);
        id.add(t6);

        t7 = new JTextField();
        t7.setBounds(250,260,200,20);
        id.add(t7);
        
        t67 = new JTextField();
        t67.setBounds(450,260,200,20);
        id.add(t67);

        t8 = new JTextField();
        t8.setBounds(50,290,200,20);
        id.add(t8);

        t9 = new JTextField();
        t9.setBounds(250,290,200,20);
        id.add(t9);
        
        t89 = new JTextField();
        t89.setBounds(450,290,200,20);
        id.add(t89);

        t10 = new JTextField();
        t10.setBounds(50,320,200,20);
        id.add(t10);

        t11 = new JTextField();
        t11.setBounds(250,320,200,20);
        id.add(t11);
        
        t1011 = new JTextField();
        t1011.setBounds(450,320,200,20);
        id.add(t1011);

        b1 = new JButton("Submit");
        b1.setBounds(50,360,100,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        id.add(b1);

        b1.addActionListener(this);

        f.setVisible(true);
        f.setSize(900,700);
        f.setLocation(400,150);
        //getContentPane().setBackground(Color.WHITE);
    }

    public void actionPerformed(ActionEvent ae){
        try{
            if(ae.getSource() == b1){
                conn c1 = new conn();

                String s1 = "insert into subject values('"+t1.getText()+"','"+t2.getText()+"','"+t4.getText()+"','"+t6.getText()+"','"+t8.getText()+"','"+t10.getText()+"')";
                String s2 = "insert into cie_marks values('"+t1.getText()+"','"+t3.getText()+"','"+t5.getText()+"','"+t7.getText()+"','"+t9.getText()+"','"+t11.getText()+"')";
                String s3 = "insert into see_marks values('"+t1.getText()+"','"+t23.getText()+"','"+t45.getText()+"','"+t67.getText()+"','"+t89.getText()+"','"+t1011.getText()+"')";
                
                c1.s.executeUpdate(s1);//2 different tables for subs and marks
                c1.s.executeUpdate(s2);
                c1.s.executeUpdate(s3);
                
                JOptionPane.showMessageDialog(null,"Marks Inserted Successfully");
                f.setVisible(false);

            }
        }catch(Exception e){}
        
            f.setVisible(true);
            f.setSize(900,650);
            f.setLocation(450,250);
    }

    public static void main(String[] args){
        new EnterMarks().f.setVisible(true);
    }
}