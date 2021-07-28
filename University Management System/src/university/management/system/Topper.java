
package university.management.system;

import java.awt.BorderLayout;
import java.awt.Font;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Topper extends JFrame{

   JTextArea t1;
   JPanel p1;
   
   //Topper(){}
   Topper(){
       setSize(500,600);
       setLayout(new BorderLayout());
       
       p1 = new JPanel();

       t1 = new JTextArea(50,15);
       JScrollPane jsp = new JScrollPane(t1); //for scrolling up and down
       t1.setFont(new Font("Senserif",Font.ITALIC,18));
       
       add(p1,"North");
       
       add(jsp,"Center");
       
       setLocation(450,200);
       mark();
   }
   
   public void mark(){
    try{
           conn c = new conn();
           
           t1.setText("\tToppers of Examination\n\nSubject\n");
           
           ResultSet rs1 = c.s.executeQuery("select * from subject ");//row data fetched
           
           if(rs1.next()){
               t1.append("\n\t"+rs1.getString("subject1"));//adding info
               t1.append("\n\t"+rs1.getString("subject2"));
               t1.append("\n\t"+rs1.getString("subject3"));
               t1.append("\n\t"+rs1.getString("subject4"));
               t1.append("\n\t"+rs1.getString("subject5"));
               t1.append("\n-----------------------------------------");
               t1.append("\n");
               t1.append("                Toppers in each subject in SEE:");
               t1.append("\n");
           }
           ResultSet rs3 = c.s.executeQuery(" select name,rollno from student where rollno=(select rollno from see_marks where  smarks1=(select max(smarks1) from see_marks))");
           if(rs3.next()){
               t1.append("\n\t"+rs3.getString("rollno"));
               t1.append("\n\t"+rs3.getString("name"));//adding name
               t1.append("\n");
           }
           ResultSet rs4 = c.s.executeQuery("select name,rollno from student where rollno=( select rollno from see_marks where  smarks2=(select max(smarks2) from see_marks))");
           if(rs4.next()){
               t1.append("\n\t"+rs4.getString("rollno"));//adding info
               t1.append("\n\t"+rs4.getString("name"));//adding name
               t1.append("\n");
           }
           ResultSet rs5 = c.s.executeQuery("select name,rollno from student where rollno=( select rollno from see_marks where  smarks3=(select max(smarks3) from see_marks))");
           if(rs5.next()){
               t1.append("\n\t"+rs5.getString("rollno"));//adding info
               t1.append("\n\t"+rs5.getString("name"));//adding name
               t1.append("\n");
           }
           ResultSet rs6 = c.s.executeQuery(" select name,rollno from student where rollno=(select rollno from see_marks where  smarks4=(select max(smarks4) from see_marks))");
           if(rs6.next()){
               t1.append("\n\t"+rs6.getString("rollno"));//adding info
               t1.append("\n\t"+rs6.getString("name"));//adding name
               t1.append("\n");
           }
           ResultSet rs7 = c.s.executeQuery(" select name,rollno from student where rollno=(select rollno from see_marks where  smarks5=(select max(smarks5) from see_marks))");
           if(rs7.next()){
               t1.append("\n\t"+rs7.getString("rollno"));//adding info
               t1.append("\n\t"+rs7.getString("name"));//adding name
               t1.append("\n");
               t1.append("\n-----------------------------------------");
               t1.append("\n");
               t1.append("                Toppers in each subject :");
               t1.append("\n");
           }
            ResultSet rs8 = c.s.executeQuery("SELECT max((cie_marks.cmarks1 + see_marks.smarks1)/2) AS total,cie_marks.rollno,student.name\n" +
"     FROM cie_marks JOIN see_marks Join student ON cie_marks.rollno = see_marks.rollno and student.rollno=cie_marks.rollno  ");
           if(rs8.next()){
               t1.append("\n\t"+rs8.getString("rollno"));
               t1.append("\n\t"+rs8.getString("name"));//adding name
               t1.append("\n\t"+rs8.getString("total"));
               t1.append("\n");
           }
           ResultSet rs9 = c.s.executeQuery("SELECT max((cie_marks.cmarks1 + see_marks.smarks1)/2) AS total,cie_marks.rollno,student.name\n" +
"     FROM cie_marks JOIN see_marks Join student ON cie_marks.rollno = see_marks.rollno and student.rollno=cie_marks.rollno ");
           if(rs9.next()){
               t1.append("\n\t"+rs9.getString("rollno"));//adding info
               t1.append("\n\t"+rs9.getString("name"));//adding name
               t1.append("\n\t"+rs9.getString("total"));
               t1.append("\n");
           }
           ResultSet rs10 = c.s.executeQuery("SELECT max((cie_marks.cmarks1 + see_marks.smarks1)/2) AS total,cie_marks.rollno,student.name\n" +
"     FROM cie_marks JOIN see_marks Join student ON cie_marks.rollno = see_marks.rollno and student.rollno=cie_marks.rollno ");
           if(rs10.next()){
               t1.append("\n\t"+rs10.getString("rollno"));//adding info
               t1.append("\n\t"+rs10.getString("name"));//adding name
               t1.append("\n\t"+rs10.getString("total"));
               t1.append("\n");
           }
           ResultSet rs11 = c.s.executeQuery("SELECT max((cie_marks.cmarks1 + see_marks.smarks1)/2) AS total,cie_marks.rollno,student.name\n" +
"     FROM cie_marks JOIN see_marks Join student ON cie_marks.rollno = see_marks.rollno and student.rollno=cie_marks.rollno ");
           if(rs11.next()){
               t1.append("\n\t"+rs11.getString("rollno"));//adding info
               t1.append("\n\t"+rs11.getString("name"));//adding name
               t1.append("\n\t"+rs11.getString("total"));
               t1.append("\n");
           }
           ResultSet rs12 = c.s.executeQuery("SELECT max((cie_marks.cmarks1 + see_marks.smarks1)/2) AS total,cie_marks.rollno,student.name\n" +
"     FROM cie_marks JOIN see_marks Join student ON cie_marks.rollno = see_marks.rollno and student.rollno=cie_marks.rollno ");
           if(rs12.next()){
               t1.append("\n\t"+rs12.getString("rollno"));//adding info
               t1.append("\n\t"+rs12.getString("name"));//adding name
               t1.append("\n\t"+rs12.getString("total"));
               t1.append("\n");
           }
           

       }catch(Exception e){
           e.printStackTrace();
       }
   }
   
   public static void main(String[] args){
       new Topper().setVisible(true);
   }
}