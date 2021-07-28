
package university.management.system;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentAttendanceDetail extends JFrame implements ActionListener{
  
    JTable j1;
    JButton b1;
    String h[]={"Roll Number","Date Time","Attendace"};
    String d[][]=new String[15][3];  //15 rows 3 cols
    int i=0,j=0;
    
    StudentAttendanceDetail(){
        super("View Students Attendence");
        setSize(800,300);
        setLocation(450,150);

        try{
            String q="select * from attendance_student";//taking all data and storing in queue 
            conn c1=new conn();
            ResultSet rs=c1.s.executeQuery(q);
            while(rs.next()){
                d[i][j++]=rs.getString("rollno"); //move to next col i.e. j
                d[i][j++]=rs.getString("Date");
                d[i][j++]=rs.getString("attendance");
                //d[i][j++]=rs.getString("second");
                i++;
                j=0;
            }
        
            j1=new JTable(d,h);

        }catch(Exception e){}
        
        b1=new JButton("Print");
        add(b1,"South");
        JScrollPane s1=new JScrollPane(j1); //for scrolling
        add(s1);
        
        b1.addActionListener(this); //print
    
    }
    public void actionPerformed(ActionEvent ae){
        try{
            j1.print();
        }catch(Exception e){}
    }
    
    public static void main(String[] args){
        new StudentAttendanceDetail().setVisible(true);
    }
}