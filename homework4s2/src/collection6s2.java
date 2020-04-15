import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;


public class collection6s2 {

public static void main(String[]args) {
		
		JFrame frame = new JFrame("JTable demo");
		frame.setSize(900, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		
		String columns[] = {"ID", "First Name", "Last Name", "Age", "City", "Mobile number"};
		String data[][] = {
				{"441108246", "Adel", "AL-mdar","24","Najran","0565343432" },
	            {"441108266", "Husaam", "AL-mdar","23","Najran","0554326789" },
	            {"441108258", "Mehdi", "Saeed","25","Najran","0567678989" },
	            {"441108244", "Salem", "Al-yami","24","Najran","0554989766" },
	            {"439100041", "Al-Hassan", "Majrashi","23","Jazan","0521212345" },
	            {"441108269", "Mansoor", "Nasser","24","Najran","0544667589" },
		
		};
		
		 DefaultTableModel model = new DefaultTableModel();
		 model.setDataVector(data, columns);
		 JTable table = new JTable(model);
		 JScrollPane tableScroller= new JScrollPane(table);
		 tableScroller.setBounds(60, 40, 570, 110);
		 frame.add(tableScroller); 
		 frame.setVisible(true);

      
	}
	
}
