import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;

public class Withdraw extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	

	
	public Withdraw() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 420, 174);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(103, 11, 134, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(103, 52, 134, 20);
		contentPane.add(textField_1);
		
		JButton btnWithdraw = new JButton("Withdraw");
		btnWithdraw.addActionListener(new ActionListener() {
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
				
				String id;
				double amt;
				id=textField.getText();
				amt=Double.parseDouble(textField_1.getText());
				bank.withdraw(id, amt);
				
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
		btnWithdraw.setBounds(148, 90, 89, 23);
		contentPane.add(btnWithdraw);
		
		JLabel label = new JLabel("Balance:");
		label.setBounds(10, 55, 83, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("ID:");
		label_1.setBounds(10, 14, 83, 14);
		contentPane.add(label_1);
		
		
	}

}
