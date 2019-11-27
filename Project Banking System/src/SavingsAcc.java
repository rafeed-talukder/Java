import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import java.awt.Panel;

public class SavingsAcc extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SavingsAcc frame = new SavingsAcc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public SavingsAcc() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 451, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 0, 414, 261);
		contentPane.add(panel);
		
		JLabel lblSavingsAccount = new JLabel("Savings Account");
		lblSavingsAccount.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSavingsAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lblSavingsAccount.setBounds(10, 11, 404, 24);
		panel.add(lblSavingsAccount);
		
		JLabel label_1 = new JLabel("Name:");
		label_1.setBounds(10, 70, 98, 20);
		panel.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(118, 70, 245, 20);
		panel.add(textField);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(118, 127, 245, 20);
		panel.add(textField_2);
		
		JLabel label_3 = new JLabel("Balance:");
		label_3.setBounds(10, 127, 89, 20);
		panel.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(118, 178, 245, 20);
		panel.add(textField_3);
		
		JLabel lblMacWithdraw = new JLabel("Max Withdraw:");
		lblMacWithdraw.setBounds(10, 175, 98, 23);
		panel.add(lblMacWithdraw);
		
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
//					System.out.println("No Data in file");
						}
				
				finally{
					try{
						if(oin!=null) oin.close();
					if(fis!=null) fis.close();
					}
					catch (IOException en) {
							}
				}
				
				String name,id;
				Double balance,max;
				name=textField.getText();
				//id=textField_1.getText();
				balance=Double.parseDouble(textField_2.getText());
				max=Double.parseDouble(textField_3.getText());
				if(balance>2000)
				{
					bank.addAccount(name, balance,max);
					
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
					JOptionPane.showMessageDialog(null, "Successfully Added");
					dispose();
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Minimum Balance 2000");
				}
				
				
			}
		});
		button.setBounds(160, 227, 89, 23);
		panel.add(button);
	}

}
