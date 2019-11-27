import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class Display extends JFrame {

	private JPanel contentPane;


	
	public Display() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 689, 457);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 653, 396);
		contentPane.add(textArea);
		
		Bank bank =null;
		FileInputStream fis =null;
		ObjectInputStream oin=null;
		try {
			fis =new FileInputStream("Bank.txt");
			oin=new ObjectInputStream(fis);
			bank=(Bank)oin.readObject();
			}
			
		catch (Exception e) {
			bank=new Bank();

				}
		
		finally{
			try{
				if(oin!=null) oin.close();
			if(fis!=null) fis.close();
			}
			catch (IOException e) {
					}
			
			
			ArrayList<String> list=null;
			list=bank.display();
			textArea.setText(list.toString());
			
			
		}
	}
}
