package guiDesign;

import classes.Doctor;
import classes.Account;
import classes.Date;
import classes.Day;
import classes.Employee;
import classes.ExercisePlan;
import classes.Hospital;
import classes.MedicalRecord;
import classes.Medicine;
import classes.Patient;
import classes.Pharmacy;
  
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Font;
import java.awt.Window;

import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.border.MatteBorder;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.border.CompoundBorder;
import javax.swing.DropMode;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;

public class PharmacyStocksPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtWelcomeTo;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_2;
	/**
	 * @wbp.nonvisual location=12,704
	 */
	private final JSlider slider = new JSlider();
	private JTextField txtIncorrectUser;
	private JTable table;
	private JTextField textField;
	private JTextField textFieldB;
	private JTextField textFieldA;
	private JButton buttonB_1;
	private JButton generateButton_2;
	private JButton buttonB_2;
	private JButton buttonA_2;
	private JTextArea stockA_1;
	private JTextField textA;
	private JButton buttonA_1;

	/**
	 * Launch the application.
	 */
	
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactUsPage frame = new ContactUsPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/

	/**
	 * Create the frame.
	 */
	public PharmacyStocksPage(Pharmacy pharmacy) {
		// Sample account information.
		//Account account = new Account( "umutdivarci", "12345", "umut@hotmail.com");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 973, 657);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSignUpHere = new JButton("");
		btnSignUpHere.setIcon(new ImageIcon(PharmacyStocksPage.class.getResource("/icons/809922_arrows_512x512_55x55.png")));
		btnSignUpHere.setHorizontalAlignment(SwingConstants.LEFT);
		btnSignUpHere.setBorder(null);
		btnSignUpHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					PharmacyMainPage frame = new PharmacyMainPage(pharmacy);
					frame.setVisible(true);
					Window win = SwingUtilities.getWindowAncestor(contentPane);
					win.dispose();
			}
		});
		btnSignUpHere.setOpaque(false);
		btnSignUpHere.setForeground(Color.BLUE);
		btnSignUpHere.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSignUpHere.setBackground(Color.WHITE);
		btnSignUpHere.setBounds(81, 85, 55, 55);
		contentPane.add(btnSignUpHere);
		
		txtWelcomeTo = new JTextField();
		txtWelcomeTo.setEditable(false);
		txtWelcomeTo.setText("Pharmacy Stocks");
		txtWelcomeTo.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcomeTo.setForeground(Color.WHITE);
		txtWelcomeTo.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtWelcomeTo.setColumns(10);
		txtWelcomeTo.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtWelcomeTo.setBackground(new Color(34, 139, 34));
		txtWelcomeTo.setBounds(0, 26, 959, 38);
		contentPane.add(txtWelcomeTo);

		JTextArea stockB_1 = new JTextArea();
		stockB_1.setText("Stocks: " + pharmacy.getMedicalStock().get(1).stock + 
				"\r\nPrice: " + pharmacy.getMedicalStock().get(1).price);
		stockB_1.setOpaque(false);
		stockB_1.setForeground(Color.WHITE);
		stockB_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		stockB_1.setEditable(false);
		stockB_1.setCaretColor(Color.WHITE);
		stockB_1.setBorder(new LineBorder(new Color(34, 139, 34), 3, true));
		stockB_1.setBackground(Color.GREEN);
		stockB_1.setBounds(442, 170, 132, 38);
		contentPane.add(stockB_1);
		
		
		textFieldB = new JTextField();
		textFieldB.setBounds(600, 172, 96, 38);
		contentPane.add(textFieldB);
		textFieldB.setColumns(10);
		
		
		
		table = new JTable();
		table.setBackground(Color.WHITE);
		table.setBounds(113, 288, 353, -24);
		contentPane.add(table);
		

		
		buttonB_1 = new JButton("+");
		buttonB_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pharmacy.getMedicalStock().get(1).addStock(1);
				stockB_1.setText("Stocks: " + pharmacy.getMedicalStock().get(1).stock + 
						"\r\nPrice: " + pharmacy.getMedicalStock().get(1).price);
			}
		});
		buttonB_1.setForeground(Color.WHITE);
		buttonB_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		buttonB_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buttonB_1.setBackground(new Color(34, 139, 34));
		buttonB_1.setBounds(162, 170, 37, 38);
		contentPane.add(buttonB_1);
		
		buttonB_2 = new JButton("-");
		buttonB_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pharmacy.getMedicalStock().get(1).addStock(-1);
				stockB_1.setText("Stocks:" + pharmacy.getMedicalStock().get(1).stock + 
						"\r\nPrice: " + pharmacy.getMedicalStock().get(1).price);
			}
		});
		
		
		buttonB_2.setForeground(Color.WHITE);
		buttonB_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		buttonB_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buttonB_2.setBackground(new Color(255, 0, 0));
		buttonB_2.setBounds(209, 170, 37, 38);
		contentPane.add(buttonB_2);
		

		JTextField textB = new JTextField();
		textB.setEnabled(false);
		textB.setDisabledTextColor(Color.WHITE);
		textB.setEditable(false);
		textB.setText(pharmacy.medicalStock.get(1).name);
		textB.setBackground(new Color(34, 139, 34));
		textB.setBorder(new LineBorder(new Color(34, 139, 34), 3));
		textB.setHorizontalAlignment(SwingConstants.CENTER);
		textB.setFont(new Font("Tahoma", Font.BOLD, 13));
		textB.setOpaque(false);
		textB.setBounds(289, 170, 125, 38);
		contentPane.add(textB);
		textB.setColumns(10);
		
		///////////////
		
		
		textFieldA = new JTextField();
		textFieldA.setBounds(600, 102, 96, 38);
		contentPane.add(textFieldA);
		textFieldA.setColumns(10);
		

		
		buttonA_1 = new JButton("+");
		buttonA_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pharmacy.getMedicalStock().get(0).addStock(1);
				stockA_1.setText("Stocks: " + pharmacy.getMedicalStock().get(0).stock + 
						"\r\nPrice: " + pharmacy.getMedicalStock().get(0).price);
			}
		});
		buttonA_1.setForeground(Color.WHITE);
		buttonA_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		buttonA_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buttonA_1.setBackground(new Color(34, 139, 34));
		buttonA_1.setBounds(162, 102, 37, 38);
		contentPane.add(buttonA_1);
		
		buttonA_2 = new JButton("-");
		buttonA_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pharmacy.getMedicalStock().get(0).addStock(-1);
				stockA_1.setText("Stocks: " + pharmacy.getMedicalStock().get(0).stock + 
						"\r\nPrice: " + pharmacy.getMedicalStock().get(0).price);
			}
		});
		
		
		buttonA_2.setForeground(Color.WHITE);
		buttonA_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		buttonA_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		buttonA_2.setBackground(new Color(255, 0, 0));
		buttonA_2.setBounds(209, 102, 37, 38);
		contentPane.add(buttonA_2);
		
		stockA_1 = new JTextArea();
		stockA_1.setText("Stocks: " + pharmacy.getMedicalStock().get(0).stock + 
				"\r\nPrice: " + pharmacy.getMedicalStock().get(0).price);
		stockA_1.setOpaque(false);
		stockA_1.setForeground(Color.WHITE);
		stockA_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		stockA_1.setEditable(false);
		stockA_1.setCaretColor(Color.WHITE);
		stockA_1.setBorder(new LineBorder(new Color(34, 139, 34), 3, true));
		stockA_1.setBackground(Color.GREEN);
		stockA_1.setBounds(442, 102, 132, 38);
		contentPane.add(stockA_1);
		
		textA = new JTextField();
		textA.setEnabled(false);
		textA.setDisabledTextColor(Color.WHITE);
		textA.setEditable(false);
		textA.setText(pharmacy.medicalStock.get(0).name);
		textA.setBackground(new Color(34, 139, 34));
		textA.setBorder(new LineBorder(new Color(34, 139, 34), 3));
		textA.setHorizontalAlignment(SwingConstants.CENTER);
		textA.setFont(new Font("Tahoma", Font.BOLD, 13));
		textA.setOpaque(false);
		textA.setBounds(289, 102, 125, 38);
		contentPane.add(textA);
		textA.setColumns(10);
		
		JButton updateA = new JButton("Update Price");
		updateA.setForeground(Color.WHITE);
		updateA.setFont(new Font("Tahoma", Font.PLAIN, 13));
		updateA.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		updateA.setBackground(new Color(34, 139, 34));
		updateA.setBounds(719, 102, 164, 38);
		updateA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//txtDiet.setText(patient.medicalRecord.generateDietPlan());
				pharmacy.getMedicalStock().get(0).setPrice(Double.parseDouble(textFieldA.getText()));
				stockA_1.setText("Stocks: " + pharmacy.getMedicalStock().get(0).stock + 
						"\r\nPrice: " + pharmacy.getMedicalStock().get(0).price);
			}
		});
		contentPane.add(updateA);
		
		JButton updateB = new JButton("Update Price");
		updateB.setForeground(Color.WHITE);
		updateB.setFont(new Font("Tahoma", Font.PLAIN, 13));
		updateB.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		updateB.setBackground(new Color(34, 139, 34));
		updateB.setBounds(719, 170, 164, 38);
		updateB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//txtDiet.setText(patient.medicalRecord.generateDietPlan());
				pharmacy.getMedicalStock().get(1).setPrice(Double.parseDouble(textFieldB.getText()));
				stockB_1.setText("Stocks: " + pharmacy.getMedicalStock().get(1).stock + 
						"\r\nPrice: " + pharmacy.getMedicalStock().get(1).price);
			}
		});
		contentPane.add(updateB);
	}
}