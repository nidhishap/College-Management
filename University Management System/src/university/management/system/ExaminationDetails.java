
package university.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import java.awt.event.*;
import net.proteanit.sql.DbUtils;

public class ExaminationDetails extends JFrame implements ActionListener{

   private JPanel contentPane;
   private JTable table;
   private JTextField search;
   private JButton b1,b2,b3;

   
    public void Book() {
        try {
            conn con = new conn();
            String sql = "select * from student";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
            con.c.close();
        } catch (Exception e) {}

    }

   public ExaminationDetails() {

        setBounds(350, 200, 930, 475); // setSize(350,475)     //setLocation(distance from x, dist from y)(350,200)
        contentPane = new JPanel();
        contentPane.setBackground(new Color(179,229,255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane); //adding panel to frame
        contentPane.setLayout(null);

        JScrollPane scrollPane = new JScrollPane(); // adding a table by using object of this class
        scrollPane.setBounds(79, 133, 1080, 282);//distance from box 
        contentPane.add(scrollPane);//adding on the frame

        table = new JTable();
        table.addMouseListener(new MouseAdapter() { //mouseclick event
            @Override
            public void mouseClicked(MouseEvent arg0) {
               int row = table.getSelectedRow(); // get data of row and store it
               search.setText(table.getModel().getValueAt(row, 10).toString()); // fills in text box by fetching tenth column data for searching
            }
        });
       
        table.setBackground(new Color(240, 248, 255));
        table.setForeground(Color.DARK_GRAY);
        table.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
        scrollPane.setViewportView(table); //adding to frame

        b1 = new JButton("Result");
        b1.addActionListener(this);
        b1.setBorder(new LineBorder(new Color(255, 20, 147), 2, true));
        b1.setForeground(new Color(199, 21, 133));
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        b1.setBounds(564, 89, 138, 33);
        contentPane.add(b1);

       
        JLabel l1 = new JLabel("Check Result");
        l1.setForeground(new Color(107, 142, 35));
        l1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 30));
        l1.setBounds(300, 15, 400, 47);
        contentPane.add(l1);

       
        search = new JTextField();
        search.setBackground(new Color(255, 240, 245));
        search.setBorder(new LineBorder(new Color(255, 105, 180), 2, true));
        search.setForeground(new Color(47, 79, 79));
        search.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        search.setBounds(189, 89, 357, 33);
        contentPane.add(search);
        search.setColumns(10);

        JLabel l3 = new JLabel("Back");
        l3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
            }
        });
        l3.setForeground(Color.GRAY);
        l3.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        l3.setBounds(97, 89, 72, 33);
        contentPane.add(l3);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 128, 128), 3, true), "Book-Details",
        TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 0)));
        panel.setBounds(67, 54, 1100, 368);
        contentPane.add(panel);
        panel.setBackground(Color.WHITE);
        Book();
        setSize(1200,500);
    }
   
    public void actionPerformed(ActionEvent ae){
        try{
            conn con = new conn();
            if(ae.getSource() == b1){            
                new Marks(search.getText()).setVisible(true);
                this.setVisible(false);//when mouse clicks it closes
            };
        }
        catch(Exception e){}
    }

    public static void main(String[] args){
        new ExaminationDetails().setVisible(true);
    }
}