import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MainMenu extends JFrame {

	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MainMenu() {
		setTitle("Bank App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAdd = new JButton("Current / New Account");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CurrentAcc a=new CurrentAcc();
				
				
				a.setVisible(true);
			}
			
		});
		btnAdd.setBounds(194, 60, 163, 41);
		contentPane.add(btnAdd);
		
		JButton btnDeposit = new JButton("Deposit");
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Deposit b= new Deposit();
				b.setVisible(true);
			}
		});
		btnDeposit.setBounds(194, 164, 163, 41);
		contentPane.add(btnDeposit);
		
		JButton btnWithdraw = new JButton("Withdraw");
		btnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Withdraw c= new Withdraw();
				c.setVisible(true);
			}
		});
		btnWithdraw.setBounds(194, 216, 163, 41);
		contentPane.add(btnWithdraw);
		
		JButton btnDisplayAccount = new JButton("Display");
		btnDisplayAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Display d=new Display();
				d.setVisible(true);
			}
			
		});
		btnDisplayAccount.setBounds(194, 268, 163, 41);
		contentPane.add(btnDisplayAccount);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(194, 320, 163, 41);
		contentPane.add(btnNewButton);
		
		JButton btnAddSavingsAcc = new JButton("Saving Account");
		btnAddSavingsAcc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SavingsAcc saving= new SavingsAcc();
				saving.setVisible(true);
			}
		});
		btnAddSavingsAcc.setBounds(194, 112, 163, 41);
		contentPane.add(btnAddSavingsAcc);
		
		JLabel lblBankManagementSystem = new JLabel("Bank Management System");
		lblBankManagementSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblBankManagementSystem.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBankManagementSystem.setBounds(10, 0, 528, 49);
		contentPane.add(lblBankManagementSystem);
		
		
		
	}
}
