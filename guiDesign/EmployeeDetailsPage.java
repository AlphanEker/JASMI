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

public class EmployeeDetailsPage extends JFrame {

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
	private JTextField txtEmployeesAge;
	private JTextField txtVaccinationPlace;
	private JTextField txtVaccinationDate;
	private JTextField txtSalary;

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
	public EmployeeDetailsPage(Employee employee, Hospital hospital) {
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
		btnSignUpHere.setIcon(new ImageIcon(EmployeeDetailsPage.class.getResource("/icons/809922_arrows_512x512_55x55.png")));
		btnSignUpHere.setHorizontalAlignment(SwingConstants.LEFT);
		btnSignUpHere.setBorder(null);
		btnSignUpHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

					HospitalMainPage frame = new HospitalMainPage(hospital);
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
		txtWelcomeTo.setText(hospital.getHospitalName());
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
		txtLogIn.setText("Employee Name:");
		txtLogIn.setOpaque(false);
		txtLogIn.setForeground(Color.WHITE);
		txtLogIn.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtLogIn.setEditable(false);
		txtLogIn.setColumns(10);
		txtLogIn.setBorder(null);
		txtLogIn.setBackground(Color.BLACK);
		txtLogIn.setBounds(159, 95, 218, 30);
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
		txtrDevelopersUmutDivarc.setForeground(new Color(50, 205, 50));
		txtrDevelopersUmutDivarc.setText(String.valueOf(employee.age));
		txtrDevelopersUmutDivarc.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtrDevelopersUmutDivarc.setBounds(312, 252, 237, 38);
		contentPane.add(txtrDevelopersUmutDivarc);
		
		txtEmployeesAge = new JTextField();
		txtEmployeesAge.setText("Employee's Age:");
		txtEmployeesAge.setOpaque(false);
		txtEmployeesAge.setHorizontalAlignment(SwingConstants.LEFT);
		txtEmployeesAge.setForeground(Color.WHITE);
		txtEmployeesAge.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtEmployeesAge.setEditable(false);
		txtEmployeesAge.setColumns(10);
		txtEmployeesAge.setBorder(null);
		txtEmployeesAge.setBackground(Color.BLACK);
		txtEmployeesAge.setBounds(159, 248, 218, 30);
		contentPane.add(txtEmployeesAge);
		
		JTextArea txtrDevelopersUmutDivarc_1 = new JTextArea();
		txtrDevelopersUmutDivarc_1.setText(employee.getName());
		txtrDevelopersUmutDivarc_1.setOpaque(false);
		txtrDevelopersUmutDivarc_1.setForeground(new Color(50, 205, 50));
		txtrDevelopersUmutDivarc_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtrDevelopersUmutDivarc_1.setEditable(false);
		txtrDevelopersUmutDivarc_1.setCaretColor(Color.WHITE);
		txtrDevelopersUmutDivarc_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtrDevelopersUmutDivarc_1.setBackground(Color.GREEN);
		txtrDevelopersUmutDivarc_1.setBounds(311, 99, 344, 30);
		contentPane.add(txtrDevelopersUmutDivarc_1);
		
		txtVaccinationPlace = new JTextField();
		txtVaccinationPlace.setText("Profession:");
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
		txtrDevelopersUmutDivarc_1_1.setText(employee.profession);
		txtrDevelopersUmutDivarc_1_1.setOpaque(false);
		txtrDevelopersUmutDivarc_1_1.setForeground(new Color(50, 205, 50));
		txtrDevelopersUmutDivarc_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtrDevelopersUmutDivarc_1_1.setEditable(false);
		txtrDevelopersUmutDivarc_1_1.setCaretColor(Color.WHITE);
		txtrDevelopersUmutDivarc_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtrDevelopersUmutDivarc_1_1.setBackground(Color.GREEN);
		txtrDevelopersUmutDivarc_1_1.setBounds(311, 151, 344, 55);
		contentPane.add(txtrDevelopersUmutDivarc_1_1);
		
		txtVaccinationDate = new JTextField();
		txtVaccinationDate.setText("Education:");
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
		txtrDevelopersUmutDivarc_1_1_1.setText(employee.education);
		txtrDevelopersUmutDivarc_1_1_1.setOpaque(false);
		txtrDevelopersUmutDivarc_1_1_1.setForeground(new Color(50, 205, 50));
		txtrDevelopersUmutDivarc_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtrDevelopersUmutDivarc_1_1_1.setEditable(false);
		txtrDevelopersUmutDivarc_1_1_1.setCaretColor(Color.WHITE);
		txtrDevelopersUmutDivarc_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtrDevelopersUmutDivarc_1_1_1.setBackground(Color.GREEN);
		txtrDevelopersUmutDivarc_1_1_1.setBounds(312, 204, 344, 38);
		contentPane.add(txtrDevelopersUmutDivarc_1_1_1);
		
		txtSalary = new JTextField();
		txtSalary.setText("Salary\r\n:");
		txtSalary.setOpaque(false);
		txtSalary.setHorizontalAlignment(SwingConstants.LEFT);
		txtSalary.setForeground(Color.WHITE);
		txtSalary.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtSalary.setEditable(false);
		txtSalary.setColumns(10);
		txtSalary.setBorder(null);
		txtSalary.setBackground(Color.BLACK);
		txtSalary.setBounds(159, 289, 218, 30);
		contentPane.add(txtSalary);
		
		JTextArea txtrDevelopersUmutDivarc_2 = new JTextArea();
		txtrDevelopersUmutDivarc_2.setText(String.valueOf(employee.salary));
		txtrDevelopersUmutDivarc_2.setOpaque(false);
		txtrDevelopersUmutDivarc_2.setForeground(new Color(50, 205, 50));
		txtrDevelopersUmutDivarc_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtrDevelopersUmutDivarc_2.setEditable(false);
		txtrDevelopersUmutDivarc_2.setCaretColor(Color.WHITE);
		txtrDevelopersUmutDivarc_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtrDevelopersUmutDivarc_2.setBackground(Color.GREEN);
		txtrDevelopersUmutDivarc_2.setBounds(312, 291, 237, 38);
		contentPane.add(txtrDevelopersUmutDivarc_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(EmployeeDetailsPage.class.getResource("/icons/profilSon_150x150.png")));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(268, 367, 150, 150);
		contentPane.add(lblNewLabel);
	}
	
	//Overload
	
	public EmployeeDetailsPage(Employee employee, Pharmacy pharmacy) {
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
		btnSignUpHere.setIcon(new ImageIcon(EmployeeDetailsPage.class.getResource("/icons/809922_arrows_512x512_55x55.png")));
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
		txtWelcomeTo.setText(pharmacy.getName());
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
		txtLogIn.setText("Employee Name:");
		txtLogIn.setOpaque(false);
		txtLogIn.setForeground(Color.WHITE);
		txtLogIn.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtLogIn.setEditable(false);
		txtLogIn.setColumns(10);
		txtLogIn.setBorder(null);
		txtLogIn.setBackground(Color.BLACK);
		txtLogIn.setBounds(159, 95, 218, 30);
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
		txtrDevelopersUmutDivarc.setForeground(new Color(50, 205, 50));
		txtrDevelopersUmutDivarc.setText(String.valueOf(employee.age));
		txtrDevelopersUmutDivarc.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtrDevelopersUmutDivarc.setBounds(312, 252, 237, 38);
		contentPane.add(txtrDevelopersUmutDivarc);
		
		txtEmployeesAge = new JTextField();
		txtEmployeesAge.setText("Employee's Age:");
		txtEmployeesAge.setOpaque(false);
		txtEmployeesAge.setHorizontalAlignment(SwingConstants.LEFT);
		txtEmployeesAge.setForeground(Color.WHITE);
		txtEmployeesAge.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtEmployeesAge.setEditable(false);
		txtEmployeesAge.setColumns(10);
		txtEmployeesAge.setBorder(null);
		txtEmployeesAge.setBackground(Color.BLACK);
		txtEmployeesAge.setBounds(159, 248, 218, 30);
		contentPane.add(txtEmployeesAge);
		
		JTextArea txtrDevelopersUmutDivarc_1 = new JTextArea();
		txtrDevelopersUmutDivarc_1.setText(employee.getName());
		txtrDevelopersUmutDivarc_1.setOpaque(false);
		txtrDevelopersUmutDivarc_1.setForeground(new Color(50, 205, 50));
		txtrDevelopersUmutDivarc_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtrDevelopersUmutDivarc_1.setEditable(false);
		txtrDevelopersUmutDivarc_1.setCaretColor(Color.WHITE);
		txtrDevelopersUmutDivarc_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtrDevelopersUmutDivarc_1.setBackground(Color.GREEN);
		txtrDevelopersUmutDivarc_1.setBounds(311, 99, 344, 30);
		contentPane.add(txtrDevelopersUmutDivarc_1);
		
		txtVaccinationPlace = new JTextField();
		txtVaccinationPlace.setText("Profession:");
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
		txtrDevelopersUmutDivarc_1_1.setText(employee.profession);
		txtrDevelopersUmutDivarc_1_1.setOpaque(false);
		txtrDevelopersUmutDivarc_1_1.setForeground(new Color(50, 205, 50));
		txtrDevelopersUmutDivarc_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtrDevelopersUmutDivarc_1_1.setEditable(false);
		txtrDevelopersUmutDivarc_1_1.setCaretColor(Color.WHITE);
		txtrDevelopersUmutDivarc_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtrDevelopersUmutDivarc_1_1.setBackground(Color.GREEN);
		txtrDevelopersUmutDivarc_1_1.setBounds(311, 151, 344, 55);
		contentPane.add(txtrDevelopersUmutDivarc_1_1);
		
		txtVaccinationDate = new JTextField();
		txtVaccinationDate.setText("Education:");
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
		txtrDevelopersUmutDivarc_1_1_1.setText(employee.education);
		txtrDevelopersUmutDivarc_1_1_1.setOpaque(false);
		txtrDevelopersUmutDivarc_1_1_1.setForeground(new Color(50, 205, 50));
		txtrDevelopersUmutDivarc_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtrDevelopersUmutDivarc_1_1_1.setEditable(false);
		txtrDevelopersUmutDivarc_1_1_1.setCaretColor(Color.WHITE);
		txtrDevelopersUmutDivarc_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtrDevelopersUmutDivarc_1_1_1.setBackground(Color.GREEN);
		txtrDevelopersUmutDivarc_1_1_1.setBounds(312, 204, 344, 38);
		contentPane.add(txtrDevelopersUmutDivarc_1_1_1);
		
		txtSalary = new JTextField();
		txtSalary.setText("Salary\r\n:");
		txtSalary.setOpaque(false);
		txtSalary.setHorizontalAlignment(SwingConstants.LEFT);
		txtSalary.setForeground(Color.WHITE);
		txtSalary.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtSalary.setEditable(false);
		txtSalary.setColumns(10);
		txtSalary.setBorder(null);
		txtSalary.setBackground(Color.BLACK);
		txtSalary.setBounds(159, 289, 218, 30);
		contentPane.add(txtSalary);
		
		JTextArea txtrDevelopersUmutDivarc_2 = new JTextArea();
		txtrDevelopersUmutDivarc_2.setText(String.valueOf(employee.salary));
		txtrDevelopersUmutDivarc_2.setOpaque(false);
		txtrDevelopersUmutDivarc_2.setForeground(new Color(50, 205, 50));
		txtrDevelopersUmutDivarc_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtrDevelopersUmutDivarc_2.setEditable(false);
		txtrDevelopersUmutDivarc_2.setCaretColor(Color.WHITE);
		txtrDevelopersUmutDivarc_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtrDevelopersUmutDivarc_2.setBackground(Color.GREEN);
		txtrDevelopersUmutDivarc_2.setBounds(312, 291, 237, 38);
		contentPane.add(txtrDevelopersUmutDivarc_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(EmployeeDetailsPage.class.getResource("/icons/profilSon_150x150.png")));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(268, 367, 150, 150);
		contentPane.add(lblNewLabel);
	}
}