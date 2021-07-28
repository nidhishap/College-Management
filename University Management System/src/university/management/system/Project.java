package university.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Project extends JFrame implements ActionListener{
    Project(){
        super("College Management System");
        
        setSize(1920,1030);
        
        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/third.jpg"));
        Image i3 = ic.getImage().getScaledInstance(1900, 950,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        
        add(l1);
        
        JMenuBar mb  = new JMenuBar();
        JMenu master = new JMenu(" Admission");
        JMenuItem m1 = new JMenuItem("New Faculty");
        JMenuItem m2 = new JMenuItem("New Student Admission");
        JMenuItem u1 = new JMenuItem("Student Details");
        JMenuItem u2 = new JMenuItem("Teacher Details");
        JMenuItem r1 = new JMenuItem("Update Students");
        JMenuItem r2 = new JMenuItem("Update Teachers");
        master.setForeground(Color.BLUE);      
        
        master.setFont(new Font("monospaced",Font.BOLD,22));
        
        m1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon1.png"));
        Image image1 = icon1.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        m1.setIcon(new ImageIcon(image1));
        m1.setMnemonic('A');
        m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        m1.setBackground(Color.WHITE);
        
        m2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon2.png"));
        Image image2 = icon2.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        m2.setIcon(new ImageIcon(image2));
        m2.setMnemonic('B');
        m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        m2.setBackground(Color.WHITE);
    
 
  
        
        u1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon3.png"));
        Image image4 = icon4.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        u1.setIcon(new ImageIcon(image4));
        u1.setMnemonic('C');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        u1.setBackground(Color.WHITE);
        
        u2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon4.jpg"));
        Image image5 = icon5.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        u2.setIcon(new ImageIcon(image5));
        u2.setMnemonic('D');
        u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        u2.setBackground(Color.WHITE);
        
        
 
        r1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon5.png"));
        Image image7 = icon7.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        r1.setIcon(new ImageIcon(image7));
        r1.setMnemonic('E');
        r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        r1.setBackground(Color.WHITE);
        
        
        r2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon iconn = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon6.png"));
        Image imagee = iconn.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        r2.setIcon(new ImageIcon(imagee));
        r2.setMnemonic('F');
        r2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
        r2.setBackground(Color.WHITE);
        
        u1.addActionListener(this);
        u2.addActionListener(this);       
        m1.addActionListener(this);
        m2.addActionListener(this);
        r1.addActionListener(this);
        r2.addActionListener(this);
        
        
        
        JMenu attendance = new JMenu("Attendance");
        JMenuItem a1 = new JMenuItem("Student Attendance");
        JMenuItem a2 = new JMenuItem("Teacher Attendance");  
        JMenuItem b1 = new JMenuItem("Student Attendance Detail");
        JMenuItem b2 = new JMenuItem("Teacher Attendance Detail");
        attendance.setForeground(Color.BLUE);
        attendance.setFont(new Font("monospaced",Font.BOLD,22));
        
        a1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon23 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon15.png"));
        Image image24 = icon23.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        a1.setIcon(new ImageIcon(image24));
        a1.setMnemonic('M');
        a1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
        a1.setBackground(Color.WHITE);
        attendance.add(a1);
        
        a2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon25 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon14.jpg"));
        Image image26 = icon25.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        a2.setIcon(new ImageIcon(image26));
        a2.setMnemonic('N');
        a2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
        a2.setBackground(Color.WHITE);
        attendance.add(a2);

        a1.addActionListener(this);
        a2.addActionListener(this);
        
        
 
        
        b1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon27 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon15.png"));
        Image image28 = icon27.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        b1.setIcon(new ImageIcon(image28));
        b1.setMnemonic('O');
        b1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));
        b1.setBackground(Color.WHITE);
        attendance.add(b1);
        
        b2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon29 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon14.jpg"));
        Image image30 = icon29.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        b2.setIcon(new ImageIcon(image30));
        b2.setMnemonic('P');
        b2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
        b2.setBackground(Color.WHITE);
        attendance.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
        
        
        JMenu exam = new JMenu("Examination");
        JMenuItem c1 = new JMenuItem("Examination Details");
        JMenuItem c2 = new JMenuItem("Enter Marks");
        JMenuItem c3 = new JMenuItem("Topper");
        exam.setForeground(Color.BLUE);
        
        exam.setFont(new Font("monospaced",Font.BOLD,22));
        
        c1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon30 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon16.png"));
        Image image31 = icon30.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        c1.setIcon(new ImageIcon(image31));
        c1.setMnemonic('Q');
        c1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));
        c1.setBackground(Color.WHITE);
        exam.add(c1);
        
        c2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon32 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon17.png"));
        Image image33 = icon32.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        c2.setIcon(new ImageIcon(image33));
        c2.setMnemonic('R');
        c2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK));
        c2.setBackground(Color.WHITE);
        exam.add(c2);
        
        c3.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon321 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon21.png"));
        Image image331 = icon321.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        c3.setIcon(new ImageIcon(image331));
        c3.setMnemonic('R');
        c3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));
        c3.setBackground(Color.WHITE);
        exam.add(c3);

        c1.addActionListener(this);
        c2.addActionListener(this);
        c3.addActionListener(this);
  
     
        JMenu about = new JMenu("About");
        JMenuItem aboutus = new JMenuItem("About Us");
        about.setForeground(Color.BLUE);
        about.setFont(new Font("monospaced",Font.BOLD,22));
        
        aboutus.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon21 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon13.jpg"));
        Image image22 = icon21.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        aboutus.setIcon(new ImageIcon(image22));
        aboutus.setMnemonic('L');
        aboutus.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        aboutus.setBackground(Color.WHITE);
        about.add(aboutus);
        aboutus.addActionListener(this);
        
        JMenu library = new JMenu("Library");
        JMenuItem lib = new JMenuItem("Library home");
        JMenuItem bookdetails = new JMenuItem("Book Details");
        JMenuItem studentdetails = new JMenuItem("Student Library Details");
        JMenuItem stats = new JMenuItem("Statistics");
        library.setForeground(Color.BLUE);
        library.setFont(new Font("monospaced",Font.BOLD,22));
        
        lib.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon12 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/ib.png"));
        Image image12 = icon12.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        lib.setIcon(new ImageIcon(image12));
        lib.setMnemonic('Z');
        lib.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        lib.setBackground(Color.WHITE);
        library.add(lib);
        lib.addActionListener(this);
        
        bookdetails.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon121 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/lib.jpeg"));
        Image image121 = icon121.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        bookdetails.setIcon(new ImageIcon(image121));
        bookdetails.setMnemonic('Z');
        bookdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        bookdetails.setBackground(Color.WHITE);
        library.add(bookdetails);
        bookdetails.addActionListener(this);
           
        studentdetails.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon122 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/student.png"));
        Image image122 = icon122.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        studentdetails.setIcon(new ImageIcon(image122));
        studentdetails.setMnemonic('Z');
        studentdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        studentdetails.setBackground(Color.WHITE);
        library.add(studentdetails);
        studentdetails.addActionListener(this);
           
        stats.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon123 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/third.png"));
        Image image123 = icon123.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        stats.setIcon(new ImageIcon(image123));
        stats.setMnemonic('Z');
        stats.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        stats.setBackground(Color.WHITE);
        library.add(stats);
        stats.addActionListener(this);
        
           
        
        JMenu exit = new JMenu("Exit");
        JMenuItem ex = new JMenuItem("Exit");
        exit.setForeground(Color.RED);
        exit.setFont(new Font("monospaced",Font.BOLD,22));
        

        ex.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/icon12.png"));
        Image image11 = icon11.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        ex.setIcon(new ImageIcon(image11));
        ex.setMnemonic('Z');
        ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
        ex.setBackground(Color.WHITE);
        
        ex.addActionListener(this);
        
        

        master.add(m1);
        master.add(m2);
        master.add(u1);
        master.add(u2);
        master.add(r1);
        master.add(r2);
        
      
        
        exit.add(ex);
         
        mb.add(about);
        mb.add(master);
        mb.add(attendance);
        mb.add(exam);
        mb.add(library);
        mb.add(exit);
        setJMenuBar(mb);    
        
        setFont(new Font("Senserif",Font.BOLD,16));
        setLayout(new FlowLayout());
        setVisible(false);
    }
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if(msg.equals("New Student Admission")){
            new AddStudent().f.setVisible(true);
            
        }else if(msg.equals("New Faculty")){
            new AddTeacher().f.setVisible(true);
            
        }else if(msg.equals("Student Details")){
            new StudentDetails().setVisible(true);
            
        }else if(msg.equals("Teacher Details")){
            new TeacherDetails().setVisible(true);
           
        }
        else if(msg.equals("Update Students")){
            new UpdateStudent().f.setVisible(true);
           
        }
        else if(msg.equals("Update Teachers")){
            new UpdateTeacher().f.setVisible(true);
     }else if(msg.equals("Exit")){
            System.exit(0);
        }else if(msg.equals("About Us")){
            new AboutUs().setVisible(true);
        }else if(msg.equals("Student Attendance")){
            new StudentAttendance().setVisible(true);
        }else if(msg.equals("Teacher Attendance")){
            new TeacherAttendance().setVisible(true);
        }else if(msg.equals("Student Attendance Detail")){
            new StudentAttendanceDetail().setVisible(true);
        }else if(msg.equals("Teacher Attendance Detail")){
            new TeacherAttendanceDetail().setVisible(true);
        }else if(msg.equals("Examination Details")){
            new ExaminationDetails().setVisible(true);
        }else if(msg.equals("Library home")){
            new Home().setVisible(true);
        }else if(msg.equals("Topper")){
            new Topper().setVisible(true);
        }else if(msg.equals("Enter Marks")){
            new EnterMarks().setVisible(true);
        }else if(msg.equals("Book Details")){
		new BookDetails().setVisible(true);
        }else if(msg.equals("Student Library Details")){
                new StudentlibDetails().setVisible(true);
        }
        else if(msg.equals("Statistics")){
                new Statistics().setVisible(true);
        }
        
        
    }
    
    
    public static void main(String[] args){
        new Project().setVisible(true);
    }
    
}
