import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;
import javax.swing.border.LineBorder;

public class Payroll {

	private JFrame frame;
	private JTextField Name;
	private JTextField Rate;
	private JTextField Hour;
	private JTextField Days;
	private JTextField Tax;
	private JTextField Phil;
	private JTextField SSS;
	private JTextField Gross;
	private JTextField Deduct;
	private JTextField Net;
	private JTextField Totaldeduct;
	private JTextField Salary;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payroll window = new Payroll();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Payroll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 688, 298);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Simple Payroll System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(245, 11, 187, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Name");
		lblNewLabel_1.setBounds(10, 35, 115, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Rate Per Hour");
		lblNewLabel_2.setBounds(10, 60, 87, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hour Per Day");
		lblNewLabel_3.setBounds(10, 85, 81, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Number of days worked");
		lblNewLabel_4.setBounds(10, 110, 130, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("GROSS SALARY");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(10, 140, 115, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("TOTAL DEDUCTION:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(255, 140, 122, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("NET SALARY");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7.setBounds(474, 140, 92, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("DEDUCTION OF SALARY");
		lblNewLabel_8.setForeground(new Color(255, 128, 128));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(285, 36, 148, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("TAX 15% of Monthly Wage");
		lblNewLabel_9.setBounds(225, 60, 148, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Philhealth 5%");
		lblNewLabel_10.setBounds(285, 85, 92, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("SSS 2%");
		lblNewLabel_11.setBounds(326, 110, 51, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Gross Salary");
		lblNewLabel_12.setBounds(479, 35, 87, 14);
		frame.getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Deduction");
		lblNewLabel_13.setBounds(479, 60, 87, 14);
		frame.getContentPane().add(lblNewLabel_13);
		
		Name = new JTextField();
		Name.setBounds(136, 32, 122, 20);
		frame.getContentPane().add(Name);
		Name.setColumns(10);
		
		Rate = new JTextField();
		Rate.setBounds(136, 57, 86, 20);
		frame.getContentPane().add(Rate);
		Rate.setColumns(10);
		
		Hour = new JTextField();
		Hour.setBounds(136, 82, 86, 20);
		frame.getContentPane().add(Hour);
		Hour.setColumns(10);
		
		Days = new JTextField();
		Days.setBounds(136, 107, 86, 20);
		frame.getContentPane().add(Days);
		Days.setColumns(10);
		
		Tax = new JTextField();
		Tax.setEditable(false);
		Tax.setBounds(383, 57, 86, 20);
		frame.getContentPane().add(Tax);
		Tax.setColumns(10);
		
		Phil = new JTextField();
		Phil.setEditable(false);
		Phil.setBounds(383, 82, 86, 20);
		frame.getContentPane().add(Phil);
		Phil.setColumns(10);
		
		SSS = new JTextField();
		SSS.setEditable(false);
		SSS.setBounds(383, 107, 86, 20);
		frame.getContentPane().add(SSS);
		SSS.setColumns(10);
		
		Gross = new JTextField();
		Gross.setEditable(false);
		Gross.setBounds(576, 32, 86, 20);
		frame.getContentPane().add(Gross);
		Gross.setColumns(10);
		
		Deduct = new JTextField();
		Deduct.setEditable(false);
		Deduct.setBounds(576, 57, 86, 20);
		frame.getContentPane().add(Deduct);
		Deduct.setColumns(10);
		
		Net = new JTextField();
		Net.setEditable(false);
		Net.setBounds(576, 138, 86, 20);
		frame.getContentPane().add(Net);
		Net.setColumns(10);
		
		Totaldeduct = new JTextField();
		Totaldeduct.setEditable(false);
		Totaldeduct.setBounds(383, 138, 86, 20);
		frame.getContentPane().add(Totaldeduct);
		Totaldeduct.setColumns(10);
		
		Salary = new JTextField();
		Salary.setEditable(false);
		Salary.setBounds(135, 138, 86, 20);
		frame.getContentPane().add(Salary);
		Salary.setColumns(10);
		
		btnNewButton = new JButton("Compute");
		btnNewButton.setBorderPainted(true);
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 255), 2));
		btnNewButton.setForeground(new Color(255, 255, 255));
		

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int rate,hour,days;
			
			Name.getText();
			rate=Integer.valueOf(Rate.getText());
			hour=Integer.valueOf(Hour.getText());
			days=Integer.valueOf(Days.getText());
			int salary = rate*hour*days;
			
			Salary.setText(String.valueOf(salary));
			double tax=salary*0.15;
			int taxes=(int)tax;
			Tax.setText(String.valueOf(taxes));
			double phil=0.05*salary;
			int phils=(int)phil;
			Phil.setText(String.valueOf(phils));
			double sss=0.02*salary;
			int ssss=(int)sss;
			SSS.setText(String.valueOf(ssss));
			double deduct=taxes+phils+ssss;
			int deducts=(int)deduct;
			Totaldeduct.setText(String.valueOf(deducts));
			
			Gross.setText(String.valueOf(salary));
			Deduct.setText(String.valueOf(deducts));
			
			double net=salary-deducts;
			int nets=(int)net;
			Net.setText(String.valueOf(net));
			
			}
		});
		btnNewButton.setBackground(new Color(64, 128, 128));
		btnNewButton.setBounds(285, 183, 87, 35);
		
		frame.getContentPane().add(btnNewButton);
	}

}
