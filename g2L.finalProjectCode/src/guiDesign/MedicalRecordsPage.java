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

public class MedicalRecordsPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtWelcomeTo;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_2;
	private JTextField txtLogIn;
	/**
	 * @wbp.nonvisual location=12,704
	 */
	private final JSlider slider = new JSlider();
	private JTextField txtIncorrectUser;
	private JTextField txtMedicalConditions;
	private JTextField txtVaccinationPlace;
	private JTextField txtVaccinationDate;

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
	public MedicalRecordsPage(Patient patient) {
		// Sample account information.
		//Account account = new Account( "umutdivarci", "12345", "umut@hotmail.com");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 657);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSignUpHere = new JButton("");
		btnSignUpHere.setIcon(new ImageIcon(MedicalRecordsPage.class.getResource("/icons/809922_arrows_512x512_55x55.png")));
		btnSignUpHere.setHorizontalAlignment(SwingConstants.LEFT);
		btnSignUpHere.setBorder(null);
		btnSignUpHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

					PatientMainPage frame = new PatientMainPage(patient);
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
		txtWelcomeTo.setText("Vaccination and Quarantine Status");
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
		txtLogIn.setHorizontalAlignment(SwingConstants.LEFT);
		txtLogIn.setText("Age:");
		txtLogIn.setOpaque(false);
		txtLogIn.setForeground(Color.WHITE);
		txtLogIn.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtLogIn.setEditable(false);
		txtLogIn.setColumns(10);
		txtLogIn.setBorder(null);
		txtLogIn.setBackground(Color.BLACK);
		txtLogIn.setBounds(159, 96, 218, 30);
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
		
		txtMedicalConditions = new JTextField();
		txtMedicalConditions.setText("Medical Conditions:");
		txtMedicalConditions.setOpaque(false);
		txtMedicalConditions.setHorizontalAlignment(SwingConstants.LEFT);
		txtMedicalConditions.setForeground(Color.WHITE);
		txtMedicalConditions.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtMedicalConditions.setEditable(false);
		txtMedicalConditions.setColumns(10);
		txtMedicalConditions.setBorder(null);
		txtMedicalConditions.setBackground(Color.BLACK);
		txtMedicalConditions.setBounds(159, 248, 218, 30);
		contentPane.add(txtMedicalConditions);
		
		JTextArea txtrDevelopersUmutDivarc_1 = new JTextArea();
		txtrDevelopersUmutDivarc_1.setText(patient.medicalRecords.getAge()+ "");
		txtrDevelopersUmutDivarc_1.setOpaque(false);
		txtrDevelopersUmutDivarc_1.setForeground(new Color(34, 139, 34));
		txtrDevelopersUmutDivarc_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtrDevelopersUmutDivarc_1.setEditable(false);
		txtrDevelopersUmutDivarc_1.setCaretColor(Color.WHITE);
		txtrDevelopersUmutDivarc_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtrDevelopersUmutDivarc_1.setBackground(Color.GREEN);
		txtrDevelopersUmutDivarc_1.setBounds(311, 100, 344, 30);
		contentPane.add(txtrDevelopersUmutDivarc_1);
		
		txtVaccinationPlace = new JTextField();
		txtVaccinationPlace.setText("Weight:");
		txtVaccinationPlace.setOpaque(false);
		txtVaccinationPlace.setHorizontalAlignment(SwingConstants.LEFT);
		txtVaccinationPlace.setForeground(Color.WHITE);
		txtVaccinationPlace.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtVaccinationPlace.setEditable(false);
		txtVaccinationPlace.setColumns(10);
		txtVaccinationPlace.setBorder(null);
		txtVaccinationPlace.setBackground(Color.BLACK);
		txtVaccinationPlace.setBounds(159, 147, 218, 30);
		contentPane.add(txtVaccinationPlace);
		
		JTextArea txtrDevelopersUmutDivarc_1_1 = new JTextArea();
		txtrDevelopersUmutDivarc_1_1.setText(patient.medicalRecords.getWeight() + "");
		txtrDevelopersUmutDivarc_1_1.setOpaque(false); 
		txtrDevelopersUmutDivarc_1_1.setForeground(new Color(34, 139, 34));
		txtrDevelopersUmutDivarc_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtrDevelopersUmutDivarc_1_1.setEditable(false);
		txtrDevelopersUmutDivarc_1_1.setCaretColor(Color.WHITE);
		txtrDevelopersUmutDivarc_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtrDevelopersUmutDivarc_1_1.setBackground(Color.GREEN);
		txtrDevelopersUmutDivarc_1_1.setBounds(311, 151, 344, 55);
		contentPane.add(txtrDevelopersUmutDivarc_1_1);
		
		txtVaccinationDate = new JTextField();
		txtVaccinationDate.setText("Height:");
		txtVaccinationDate.setOpaque(false);
		txtVaccinationDate.setHorizontalAlignment(SwingConstants.LEFT);
		txtVaccinationDate.setForeground(Color.WHITE);
		txtVaccinationDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtVaccinationDate.setEditable(false);
		txtVaccinationDate.setColumns(10);
		txtVaccinationDate.setBorder(null);
		txtVaccinationDate.setBackground(Color.BLACK);
		txtVaccinationDate.setBounds(159, 200, 218, 30);
		contentPane.add(txtVaccinationDate);
		
		JTextArea txtrDevelopersUmutDivarc_1_1_1 = new JTextArea();
		txtrDevelopersUmutDivarc_1_1_1.setText( patient.medicalRecords.getHeight() + "");
		txtrDevelopersUmutDivarc_1_1_1.setOpaque(false);
		txtrDevelopersUmutDivarc_1_1_1.setForeground(new Color(34, 139, 34));
		txtrDevelopersUmutDivarc_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtrDevelopersUmutDivarc_1_1_1.setEditable(false);
		txtrDevelopersUmutDivarc_1_1_1.setCaretColor(Color.WHITE);
		txtrDevelopersUmutDivarc_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtrDevelopersUmutDivarc_1_1_1.setBackground(Color.GREEN);
		txtrDevelopersUmutDivarc_1_1_1.setBounds(312, 204, 344, 38);
		contentPane.add(txtrDevelopersUmutDivarc_1_1_1);
		
		JTextArea txtrDevelopersUmutDivarc_1_2 = new JTextArea();
		txtrDevelopersUmutDivarc_1_2.setText(patient.medicalRecords.getMedicalCondition(0));
		txtrDevelopersUmutDivarc_1_2.setOpaque(false);
		txtrDevelopersUmutDivarc_1_2.setForeground(new Color(34, 139, 34));
		txtrDevelopersUmutDivarc_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtrDevelopersUmutDivarc_1_2.setEditable(false);
		txtrDevelopersUmutDivarc_1_2.setCaretColor(Color.WHITE);
		txtrDevelopersUmutDivarc_1_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtrDevelopersUmutDivarc_1_2.setBackground(Color.GREEN);
		txtrDevelopersUmutDivarc_1_2.setBounds(311, 252, 218, 30);
		contentPane.add(txtrDevelopersUmutDivarc_1_2);
		
		JTextArea txtrDevelopersUmutDivarc_1_2_1 = new JTextArea();
		txtrDevelopersUmutDivarc_1_2_1.setText(patient.medicalRecords.getMedicalCondition(1));
		txtrDevelopersUmutDivarc_1_2_1.setOpaque(false);
		txtrDevelopersUmutDivarc_1_2_1.setForeground(new Color(34, 139, 34));
		txtrDevelopersUmutDivarc_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtrDevelopersUmutDivarc_1_2_1.setEditable(false);
		txtrDevelopersUmutDivarc_1_2_1.setCaretColor(Color.WHITE);
		txtrDevelopersUmutDivarc_1_2_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtrDevelopersUmutDivarc_1_2_1.setBackground(Color.GREEN);
		txtrDevelopersUmutDivarc_1_2_1.setBounds(311, 291, 218, 30);
		contentPane.add(txtrDevelopersUmutDivarc_1_2_1);
		
		JTextArea txtrDevelopersUmutDivarc_1_2_1_1 = new JTextArea();
		txtrDevelopersUmutDivarc_1_2_1_1.setText(patient.medicalRecords.getMedicalCondition(2));
		txtrDevelopersUmutDivarc_1_2_1_1.setOpaque(false);
		txtrDevelopersUmutDivarc_1_2_1_1.setForeground(new Color(34, 139, 34));
		txtrDevelopersUmutDivarc_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtrDevelopersUmutDivarc_1_2_1_1.setEditable(false);
		txtrDevelopersUmutDivarc_1_2_1_1.setCaretColor(Color.WHITE);
		txtrDevelopersUmutDivarc_1_2_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtrDevelopersUmutDivarc_1_2_1_1.setBackground(Color.GREEN);
		txtrDevelopersUmutDivarc_1_2_1_1.setBounds(311, 331, 218, 30);
		contentPane.add(txtrDevelopersUmutDivarc_1_2_1_1);
	}
}