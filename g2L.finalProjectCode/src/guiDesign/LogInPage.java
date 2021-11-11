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

public class LogInPage extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField_1;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JTextField txtDontHaveAn;
	private JTextField txtWelcomeTo;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_2;
	private JTextField txtLogIn;
	public Hospital hospital = new Hospital ( "hospital", "12345", "patient@hotmail.com", "Ankara Hospital", "Ankara");
		
	Doctor doctor1 = new Doctor("doctor1", "12345", "doctor@hotmail.com", "Umut Divarci", 22002116, hospital);
	Doctor doctor2 = new Doctor("doctor2", "12345", "doctor@hotmail.com", "Alphan Eker", 22002116, hospital);
	Doctor doctor3 = new Doctor("doctor3", "12345", "doctor@hotmail.com", "Faaiz Khan", 22002116, hospital);
	
	Employee nurse1 = new Employee("Arda Yildiz", "Nurse", "Hacettepe University", 25, 10.5);
	Employee nurse2 = new Employee("Aynur Dayanik", "Nurse", "Bilkent University", 35, 123.3);
	
	Employee dr1 = new Employee("Umut Divarci", "Dermatologist", "Hacettepe University", 25, 10000.0);
	Employee dr2 = new Employee("Alphan Eker", "Kardiologist", "Bilkent University", 35, 12000.0);
	Employee dr3 = new Employee("Faaiz Khan", "Surgeon", "Bilkent University", 35, 8000.0);
	
	Medicine medicine1 = new Medicine("Parol", 55.50, 40);
	Medicine medicine2 = new Medicine("Bepanthol", 32.90, 15);
	
	
	Employee secretary1 = new Employee("Idil Dal", "Secretary", "Koc University", 22, 3500.0);
	Employee secretary2 = new Employee("Ekin Ates", "Secretary", "METU", 24, 3500.0);
	Employee pharmacist = new Employee("Ela Erdinc", "Pharmacist", "Hacettepe University", 32, 7800.0);
	
	Day day = new Day(28);
	Patient patient = new Patient( "patient", "12345", "patient@hotmail.com", 123341, "Ankara", "Umut Divarc�");
	MedicalRecord medicalRecord = new MedicalRecord (22, 120.0, 1.80, day);
	Pharmacy pharmacy = new Pharmacy ("pharmacy", "12345", "pharmacy@hotmail.com", "Bilkent Pharmacy", "Ankara");
	
	
	/**
	 * @wbp.nonvisual location=12,704
	 */
	private final JSlider slider = new JSlider();
	private JTextField txtIncorrectUser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					LogInPage frame = new LogInPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LogInPage() {
		// Sample account informations.
		hospital.doctors.add(doctor1);
		hospital.doctors.add(doctor2);
		hospital.doctors.add(doctor3);
		
		hospital.otherEmployees.add(dr1);
		hospital.otherEmployees.add(dr2);
		hospital.otherEmployees.add(dr3);
		
		hospital.nurses.add(nurse1);
		hospital.nurses.add(nurse2);

		
		
		hospital.secretaries.add(secretary1);
		hospital.secretaries.add(secretary2);
		medicalRecord.addCondition("Type 2 Diabetes");
		medicalRecord.addCondition("Overweight");
		medicalRecord.addCondition("Astigmatism");
		
		patient.setMedicalRecord(medicalRecord);
		patient.getAppointment(7, doctor1, "Appointment with doctor " + doctor1.getName());
		patient.getAppointment(17, doctor2);
		patient.getDate().getDay(25).setAvailabilityFalse();
		
		pharmacy.employees.add(secretary1);
		pharmacy.employees.add(secretary2);
		pharmacy.employees.add(pharmacist);
		
		pharmacy.addMedicine(medicine1);
		pharmacy.addMedicine(medicine2);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 657);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JFormattedTextField frmtdtxtfldEnterUsernameHere = new JFormattedTextField();
		frmtdtxtfldEnterUsernameHere.setHorizontalAlignment(SwingConstants.LEFT);
		frmtdtxtfldEnterUsernameHere.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmtdtxtfldEnterUsernameHere.setBounds(232, 137, 202, 30);
		contentPane.add(frmtdtxtfldEnterUsernameHere);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(34, 139, 34));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Access the related account TODO

				if ( frmtdtxtfldEnterUsernameHere.getText().equals(patient.userName) && passwordField_1.getText().equals(patient.password) && 
						patient instanceof Patient)
				{
					PatientMainPage frame = new PatientMainPage( patient); //add account parameter
					frame.setVisible(true);
					Window win = SwingUtilities.getWindowAncestor(contentPane);
					win.dispose();
				}
				
				if ( frmtdtxtfldEnterUsernameHere.getText().equals(pharmacy.userName) && passwordField_1.getText().equals(pharmacy.password) && 
						pharmacy instanceof Pharmacy)
				{
					PharmacyMainPage frame = new PharmacyMainPage(pharmacy); //add account parameter
					frame.setVisible(true);
					Window win = SwingUtilities.getWindowAncestor(contentPane);
					win.dispose();
				}
				
				if ( frmtdtxtfldEnterUsernameHere.getText().equals(hospital.userName) && passwordField_1.getText().equals(hospital.password) && 
						hospital instanceof Hospital)
				{
					HospitalMainPage frame = new HospitalMainPage( hospital); //add account parameter
					frame.setVisible(true);
					Window win = SwingUtilities.getWindowAncestor(contentPane);
					win.dispose();
				}
				
				else
				{
					txtIncorrectUser.setText("Incorrect username or password!");
				}
			}
		});
		btnNewButton.setBounds(291, 248, 90, 30);
		contentPane.add(btnNewButton);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setToolTipText("");
		passwordField_1.setBounds(232, 196, 202, 30);
		contentPane.add(passwordField_1);
		
		txtUsername = new JTextField();
		txtUsername.setEditable(false);
		txtUsername.setOpaque(false);
		txtUsername.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtUsername.setBorder(null);
		txtUsername.setBackground(Color.BLACK);
		txtUsername.setForeground(Color.WHITE);
		txtUsername.setText("Username:");
		txtUsername.setBounds(152, 144, 110, 19);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setEditable(false);
		txtPassword.setOpaque(false);
		txtPassword.setText("Password:");
		txtPassword.setForeground(Color.WHITE);
		txtPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtPassword.setColumns(10);
		txtPassword.setBorder(null);
		txtPassword.setBackground(Color.BLACK);
		txtPassword.setBounds(152, 201, 110, 19);
		contentPane.add(txtPassword);
		
		txtDontHaveAn = new JTextField();
		txtDontHaveAn.setEditable(false);
		txtDontHaveAn.setOpaque(false);
		txtDontHaveAn.setText("Don't have an account?");
		txtDontHaveAn.setForeground(Color.WHITE);
		txtDontHaveAn.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtDontHaveAn.setColumns(10);
		txtDontHaveAn.setBorder(null);
		txtDontHaveAn.setBackground(Color.BLACK);
		txtDontHaveAn.setBounds(215, 317, 166, 19);
		contentPane.add(txtDontHaveAn);
		
		JButton btnSignUpHere = new JButton("Sign up here.");
		btnSignUpHere.setHorizontalAlignment(SwingConstants.LEFT);
		btnSignUpHere.setBorder(null);
		btnSignUpHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainSignUpPage frame = new MainSignUpPage();
				frame.setVisible(true);
				Window win = SwingUtilities.getWindowAncestor(contentPane);
				win.dispose();
			}
		});
		btnSignUpHere.setOpaque(false);
		btnSignUpHere.setForeground(Color.BLUE);
		btnSignUpHere.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSignUpHere.setBackground(Color.WHITE);
		btnSignUpHere.setBounds(373, 311, 124, 30);
		contentPane.add(btnSignUpHere);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(LogInPage.class.getResource("/icons/newIcon_190x190-removebg-preview.png")));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(232, 346, 190, 190);
		contentPane.add(lblNewLabel);
		
		txtWelcomeTo = new JTextField();
		txtWelcomeTo.setEditable(false);
		txtWelcomeTo.setText("Welcome to Health Tracker!");
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
		txtLogIn.setText("Log In");
		txtLogIn.setOpaque(false);
		txtLogIn.setForeground(Color.WHITE);
		txtLogIn.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtLogIn.setEditable(false);
		txtLogIn.setColumns(10);
		txtLogIn.setBorder(null);
		txtLogIn.setBackground(Color.BLACK);
		txtLogIn.setBounds(264, 83, 124, 30);
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
		
	}

	public Hospital getHospital(){
		return hospital;
	}

	
}