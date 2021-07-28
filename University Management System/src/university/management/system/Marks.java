
package university.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Marks extends JFrame{

   JTextArea t1;
   JPanel p1;
   
   Marks(){}
   Marks(String str){
       setSize(500,600);
       setLayout(new BorderLayout());
       
       p1 = new JPanel();

       t1 = new JTextArea(50,15);
       JScrollPane jsp = new JScrollPane(t1); //for scrolling up and down
       t1.setFont(new Font("Senserif",Font.ITALIC,18));
       
       add(p1,"North");
       
       add(jsp,"Center");
       
       setLocation(450,200);
       mark(str);
   }
   
   public void mark(String s){
    try{
           conn c = new conn();
           
           t1.setText("\tResult of Examination\n\nSubject\n");
           
           ResultSet rs1 = c.s.executeQuery("select * from subject where rollno="+s);//row data fetched
           
           if(rs1.next()){
               t1.append("\n\t"+rs1.getString("subject1"));//adding info
               t1.append("\n\t"+rs1.getString("subject2"));
               t1.append("\n\t"+rs1.getString("subject3"));
               t1.append("\n\t"+rs1.getString("subject4"));
               t1.append("\n\t"+rs1.getString("subject5"));
               t1.append("\n-----------------------------------------");
               t1.append("\n");
           }
           
           ResultSet rs3 = c.s.executeQuery("select * from see_marks where rollno="+s);
           
           if(rs3.next() ){
               
//               int smarks1 = Integer.parseInt(rs3.getString("smarks1"));
//               int smarks2 = Integer.parseInt(rs3.getString("smarks2"));
//               int smarks3 = Integer.parseInt(rs3.getString("smarks3"));
//               int smarks4 = Integer.parseInt(rs3.getString("smarks4"));
//               int smarks5 = Integer.parseInt(rs3.getString("smarks5"));
//               int total= cmarks1+cmarks2+cmarks3+cmarks4+cmarks5+smarks1+smarks2+smarks3+smarks4+smarks5;
//               int marks1= (cmarks1+smarks1)/2;
//               int marks2= (cmarks2+smarks2)/2;
//               int marks3= (cmarks3+smarks3)/2;
//               int marks4= (cmarks4+smarks4)/2;
//               int marks5= (cmarks5+smarks5)/2;
//               
//               t1.append("\nMarks\n\n\t"+marks1);
//               t1.append("\n\t"+marks2);
//               t1.append("\n\t"+marks3);
//               t1.append("\n\t"+marks4);
//               t1.append("\n\t"+marks5);
//               t1.append("\n-----------------------------------------");
//               t1.append("\n");
//               t1.append("\n Total Marks :"+total+" ");
//               t1.append("\n Percentage :"+total/10+"%");
                int smarks1 = Integer.parseInt(rs3.getString("smarks1"));
               int smarks2 = Integer.parseInt(rs3.getString("smarks2"));
               int smarks3 = Integer.parseInt(rs3.getString("smarks3"));
               int smarks4 = Integer.parseInt(rs3.getString("smarks4"));
               int smarks5 = Integer.parseInt(rs3.getString("smarks5"));
               int stotal= smarks1+smarks2+smarks3+smarks4+smarks5;
               
               t1.append("\nSEE Marks\n\n\t"+rs3.getString("smarks1"));
               t1.append("\n\t"+rs3.getString("smarks2"));
               t1.append("\n\t"+rs3.getString("smarks3"));
               t1.append("\n\t"+rs3.getString("smarks4"));
               t1.append("\n\t"+rs3.getString("smarks5"));
               t1.append("\n-----------------------------------------");
               t1.append("\n");
               t1.append("\n Total Marks :"+stotal+"/500");
               t1.append("\n Percentage :"+stotal/5);
           }
           
           ResultSet rs2 = c.s.executeQuery("select * from cie_marks where rollno="+s);
              if(rs2.next() ){
               
        
               int cmarks1 = Integer.parseInt(rs2.getString("cmarks1"));
               int cmarks2 = Integer.parseInt(rs2.getString("cmarks2"));
               int cmarks3 = Integer.parseInt(rs2.getString("cmarks3"));
               int cmarks4 = Integer.parseInt(rs2.getString("cmarks4"));
               int cmarks5 = Integer.parseInt(rs2.getString("cmarks5"));
               int ctotal= cmarks1+cmarks2+cmarks3+cmarks4+cmarks5;
               
               t1.append("\nCIE Marks\n\n\t"+rs2.getString("cmarks1"));
               t1.append("\n\t"+rs2.getString("cmarks2"));
               t1.append("\n\t"+rs2.getString("cmarks3"));
               t1.append("\n\t"+rs2.getString("cmarks4"));
               t1.append("\n\t"+rs2.getString("cmarks5"));
               t1.append("\n-----------------------------------------");
               t1.append("\n");
               t1.append("\n Total Marks :"+ctotal+"/500");
               t1.append("\n Percentage :"+ctotal/5);
           }
       }catch(Exception e){
           e.printStackTrace();
       }
   }
   
   public static void main(String[] args){
       new Marks().setVisible(true);
   }
}