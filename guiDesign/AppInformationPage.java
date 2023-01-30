/*
 * 
 * 
 */
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

public class AppInformationPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtWelcomeTo;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_2;
	private JTextField txtLogIn;

	private final JSlider slider = new JSlider();
	private JTextField txtIncorrectUser;

	

	/**
	 * Create the frame.
	 */
	public AppInformationPage(Account account) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 657);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSignUpHere = new JButton("");
		btnSignUpHere.setIcon(new ImageIcon(AppInformationPage.class.getResource("/icons/809922_arrows_512x512_55x55.png")));
		btnSignUpHere.setHorizontalAlignment(SwingConstants.LEFT);
		btnSignUpHere.setBorder(null);
		btnSignUpHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// If account type is patient, hospital or pharmacy return them to their related main page accordingly.
				if ( account instanceof Patient)
				{
					PatientMainPage frame = new PatientMainPage( (Patient) account);
					frame.setVisible(true);
					Window win = SwingUtilities.getWindowAncestor(contentPane);
					win.dispose();
				}
				
				if ( account instanceof Hospital)
				{
					HospitalMainPage frame = new HospitalMainPage( (Hospital) account);
					frame.setVisible(true);
					Window win = SwingUtilities.getWindowAncestor(contentPane);
					win.dispose();
				}
				
				if ( account instanceof Pharmacy)
				{
					PharmacyMainPage frame = new PharmacyMainPage( (Pharmacy) account);
					frame.setVisible(true);
					Window win = SwingUtilities.getWindowAncestor(contentPane);
					win.dispose();
				}
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
		txtWelcomeTo.setText("Application Details\r\n");
		txtWelcomeTo.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcomeTo.setForeground(Color.WHITE);
		txtWelcomeTo.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtWelcomeTo.setColumns(10);
		txtWelcomeTo.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtWelcomeTo.setBackground(new Color(34, 139, 34));
		txtWelcomeTo.setBounds(0, 26, 655, 38);
		contentPane.add(txtWelcomeTo);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setForeground(new Color(46, 139, 87));
		lblNewLabel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1.setBackground(new Color(34, 139, 34));
		lblNewLabel_1.setBounds(29, -19, 37, 692);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setForeground(new Color(46, 139, 87));
		lblNewLabel_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1.setBackground(new Color(34, 139, 34));
		lblNewLabel_1_1.setBounds(586, -19, 37, 692);
		contentPane.add(lblNewLabel_1_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setForeground(new Color(46, 139, 87));
		lblNewLabel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_2.setBackground(new Color(34, 139, 34));
		lblNewLabel_2.setBounds(0, 555, 655, 38);
		contentPane.add(lblNewLabel_2);
		
		txtLogIn = new JTextField();
		txtLogIn.setHorizontalAlignment(SwingConstants.CENTER);
		txtLogIn.setText("About Health Tracker\r\n");
		txtLogIn.setOpaque(false);
		txtLogIn.setForeground(Color.WHITE);
		txtLogIn.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtLogIn.setEditable(false);
		txtLogIn.setColumns(10);
		txtLogIn.setBorder(null);
		txtLogIn.setBackground(Color.BLACK);
		txtLogIn.setBounds(223, 110, 228, 30);
		contentPane.add(txtLogIn);
		
		txtIncorrectUser = new JTextField();
		txtIncorrectUser.setOpaque(false);
		txtIncorrectUser.setForeground(Color.RED);
		txtIncorrectUser.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtIncorrectUser.setEditable(false);
		txtIncorrectUser.setColumns(10);
		txtIncorrectUser.setBorder(null);
		txtIncorrectUser.setBackground(Color.BLACK);
		txtIncorrectUser.setBounds(223, 288, 232, 19);
		contentPane.add(txtIncorrectUser);
		
		JTextArea txtrDevelopersUmutDivarc = new JTextArea();
		txtrDevelopersUmutDivarc.setOpaque(false);
		txtrDevelopersUmutDivarc.setEditable(false);
		txtrDevelopersUmutDivarc.setBackground(Color.GREEN);
		txtrDevelopersUmutDivarc.setCaretColor(Color.WHITE);
		txtrDevelopersUmutDivarc.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtrDevelopersUmutDivarc.setForeground(Color.WHITE);
		txtrDevelopersUmutDivarc.setText("Health Tracker is a patient management system for medical\r\n\r\ninstitutions and patients, in which patients are"
				+ " able to  keep \r\n\r\ntrack of their medical procedures such as accessing their medical \r\n\r\nrecords, detailed hospital informations"
				+ " or available medicines at\r\n\r\na selected pharmacy or drug store. Therefore the system will be \r\n\r\navailable to patients,"
				+ " pharmacists and doctors, with different\r\n\r\nfunctions for every user type.\r\n");
		txtrDevelopersUmutDivarc.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtrDevelopersUmutDivarc.setBounds(81, 184, 495, 303);
		contentPane.add(txtrDevelopersUmutDivarc);
	}
}