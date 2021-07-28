package university.management.system;

import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/bms_college_of_engg","root","12345");  
            System.out.println("Connection successful");
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
            System.out.println("Connection un-successful");
        }  
    }  
}  
