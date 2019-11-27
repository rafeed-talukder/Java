import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Deposit extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	
	public Deposit() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 419, 174);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(10, 27, 79, 14);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setBounds(99, 24, 147, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblBalance = new JLabel("Balance:");
		lblBalance.setBounds(10, 68, 79, 14);
		contentPane.add(lblBalance);
		
		textField_1 = new JTextField();
		textField_1.setBounds(99, 65, 147, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnDeposit = new JButton("Deposit");
		btnDeposit.addActionListener(new ActionListener() {
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
				
				String id;
				double amt;
				id=textField.getText();
				amt=Double.parseDouble(textField_1.getText());
				bank.deposit(id, amt);
				
				try{
					
					FileOutputStream fout=new FileOutputStream("Bank.txt");
					ObjectOutputStream out=new ObjectOutputStream(fout);
					out.writeObject(bank);
					out.flush();
					fout.close();
					dispose();
					}
				catch(Exception en)
					{
						
					}
			}
		});
		btnDeposit.setBounds(157, 101, 89, 23);
		contentPane.add(btnDeposit);
		
	
			
			
	}

}
