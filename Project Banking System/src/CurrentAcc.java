import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;

public class CurrentAcc extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CurrentAcc frame = new CurrentAcc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public CurrentAcc() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 0, 414, 261);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Current Account");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(10, 11, 394, 24);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Name:");
		label_1.setBounds(10, 72, 82, 20);
		panel.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(116, 72, 234, 20);
		panel.add(textField);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(116, 126, 234, 20);
		panel.add(textField_2);
		
		JLabel label_3 = new JLabel("Balance:");
		label_3.setBounds(10, 126, 96, 20);
		panel.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(116, 178, 234, 20);
		panel.add(textField_3);
		
		JLabel lblTradeLicence = new JLabel("Trade Licence:");
		lblTradeLicence.setBounds(10, 174, 96, 24);
		panel.add(lblTradeLicence);
		
		JButton button = new JButton("Add");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bank bank =null;
				FileInputStream fis =null;
				ObjectInputStream oin=null;
				
				try {
					fis =new FileInputStream("Bank.txt");
					oin=new ObjectInputStream(fis);
					bank=(Bank)oin.readObject();
					
					}
					
				catch (Exception en) {
					bank=new Bank();

						}
				
				finally{
					try{
						if(oin!=null) oin.close();
					if(fis!=null) fis.close();
					}
					catch (IOException en) {
							}
				}
				
				String name,id,lic;
				Double balance;
				name=textField.getText();
				balance=Double.parseDouble(textField_2.getText());
				lic=textField_2.getText();
				
				if(balance>5000)
				{
				bank.addAccount(name, balance,lic);
				
				try{
					
					FileOutputStream fout=new FileOutputStream("Bank.txt");
					ObjectOutputStream out=new ObjectOutputStream(fout);
					out.writeObject(bank);
					out.flush();
					fout.close();
					
					}
					catch(Exception en)
					{
						
					}
				dispose();
				JOptionPane.showMessageDialog(null, "Successfully Added");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Minimum Balance 5000");
				}
				
			}
		});
		button.setBounds(166, 227, 89, 23);
		panel.add(button);
	}
}
