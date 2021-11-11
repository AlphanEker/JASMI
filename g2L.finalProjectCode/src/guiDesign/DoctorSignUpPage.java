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
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class DoctorSignUpPage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPassword;
	private JTextField txtEmail;
	private JTextField txtUsername;
	private JTextField txtIdentityNo;
	private JTextField txtSignUp;
	private JTextField txtAlreadyHaveAn;
	private JPasswordField enterPassword;
	private JTextField txtName;
	private JTextField txtCity;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorSignUpPage frame = new DoctorSignUpPage();
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
	public DoctorSignUpPage() {
		
		Hospital hospital1 = new Hospital ( "hospital", "12345", "hospital@gmail.com", "Ankara Hospital", "Ankara");
		Hospital hospital2 = new Hospital ( "hospital", "12345", "hospital@gmail.com", "Liv Hospital", "Ankara");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 657);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JFormattedTextField enterUsername = new JFormattedTextField();
		enterUsername.setHorizontalAlignment(SwingConstants.LEFT);
		enterUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		enterUsername.setBounds(232, 135, 202, 30);
		contentPane.add(enterUsername);
		
		JFormattedTextField enterEmail = new JFormattedTextField();
		enterEmail.setHorizontalAlignment(SwingConstants.LEFT);
		enterEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		enterEmail.setBounds(232, 195, 202, 30);
		contentPane.add(enterEmail);
		
		txtPassword = new JTextField();
		txtPassword.setText("Password:");
		txtPassword.setOpaque(false);
		txtPassword.setForeground(Color.WHITE);
		txtPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtPassword.setEditable(false);
		txtPassword.setColumns(10);
		txtPassword.setBorder(null);
		txtPassword.setBackground(Color.BLACK);
		txtPassword.setBounds(142, 255, 110, 19);
		contentPane.add(txtPassword);
		
		txtEmail = new JTextField();
		txtEmail.setText("E-mail:");
		txtEmail.setOpaque(false);
		txtEmail.setForeground(Color.WHITE);
		txtEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtEmail.setEditable(false);
		txtEmail.setColumns(10);
		txtEmail.setBorder(null);
		txtEmail.setBackground(Color.BLACK);
		txtEmail.setBounds(142, 202, 110, 19);
		contentPane.add(txtEmail);
		
		txtUsername = new JTextField();
		txtUsername.setText("Username");
		txtUsername.setOpaque(false);
		txtUsername.setForeground(Color.WHITE);
		txtUsername.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtUsername.setEditable(false);
		txtUsername.setColumns(10);
		txtUsername.setBorder(null);
		txtUsername.setBackground(Color.BLACK);
		txtUsername.setBounds(142, 142, 110, 19);
		contentPane.add(txtUsername);
		
		JFormattedTextField enterID = new JFormattedTextField();
		enterID.setHorizontalAlignment(SwingConstants.LEFT);
		enterID.setFont(new Font("Tahoma", Font.PLAIN, 14));
		enterID.setBounds(232, 84, 202, 30);
		contentPane.add(enterID);
		
		txtIdentityNo = new JTextField();
		txtIdentityNo.setText("Identity No:");
		txtIdentityNo.setOpaque(false);
		txtIdentityNo.setForeground(Color.WHITE);
		txtIdentityNo.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtIdentityNo.setEditable(false);
		txtIdentityNo.setColumns(10);
		txtIdentityNo.setBorder(null);
		txtIdentityNo.setBackground(Color.BLACK);
		txtIdentityNo.setBounds(142, 91, 110, 19);
		contentPane.add(txtIdentityNo);
		
		txtSignUp = new JTextField();
		txtSignUp.setEditable(false);
		txtSignUp.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtSignUp.setForeground(Color.WHITE);
		txtSignUp.setHorizontalAlignment(SwingConstants.CENTER);
		txtSignUp.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtSignUp.setText("Sign Up as a Doctor");
		txtSignUp.setBackground(new Color(34, 139, 34));
		txtSignUp.setBounds(0, 22, 655, 38);
		contentPane.add(txtSignUp);
		txtSignUp.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(34, 139, 34));
		lblNewLabel_1.setForeground(new Color(46, 139, 87));
		lblNewLabel_1.setBounds(0, 560, 655, 38);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setForeground(new Color(46, 139, 87));
		lblNewLabel_1_1.setBackground(new Color(34, 139, 34));
		lblNewLabel_1_1.setBounds(22, -17, 37, 692);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setOpaque(true);
		lblNewLabel_1_1_1.setForeground(new Color(46, 139, 87));
		lblNewLabel_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1_1.setBackground(new Color(34, 139, 34));
		lblNewLabel_1_1_1.setBounds(590, -17, 37, 692);
		contentPane.add(lblNewLabel_1_1_1);
		
		JButton btnLogInHere = new JButton("Log in here.");
		btnLogInHere.setOpaque(false);
		btnLogInHere.setHorizontalAlignment(SwingConstants.LEFT);
		btnLogInHere.setForeground(Color.BLUE);
		btnLogInHere.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLogInHere.setBorder(null);
		btnLogInHere.setBackground(Color.WHITE);
		btnLogInHere.setBounds(398, 510, 124, 30);
		contentPane.add(btnLogInHere);
		// Return the user back to previous page.
		btnLogInHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					LogInPage frame = new LogInPage();
					frame.setVisible(true);
					Window win = SwingUtilities.getWindowAncestor(contentPane);
					win.dispose();
			}
		});
		
		txtAlreadyHaveAn = new JTextField();
		txtAlreadyHaveAn.setText("Already have an account?");
		txtAlreadyHaveAn.setOpaque(false);
		txtAlreadyHaveAn.setForeground(Color.WHITE);
		txtAlreadyHaveAn.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtAlreadyHaveAn.setEditable(false);
		txtAlreadyHaveAn.setColumns(10);
		txtAlreadyHaveAn.setBorder(null);
		txtAlreadyHaveAn.setBackground(Color.BLACK);
		txtAlreadyHaveAn.setBounds(214, 516, 220, 19);
		contentPane.add(txtAlreadyHaveAn);
		
		enterPassword = new JPasswordField();
		enterPassword.setToolTipText("");
		enterPassword.setBounds(232, 250, 202, 30);
		contentPane.add(enterPassword);
		
		JFormattedTextField enterName = new JFormattedTextField();
		enterName.setHorizontalAlignment(SwingConstants.LEFT);
		enterName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		enterName.setBounds(232, 305, 202, 30);
		contentPane.add(enterName);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new Hospital[] {hospital1, hospital2}));
		comboBox.setToolTipText("");
		comboBox.setForeground(Color.WHITE);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox.setEditable(true);
		comboBox.setBackground(new Color(34, 139, 34));
		comboBox.setBounds(232, 361, 202, 30);
		contentPane.add(comboBox);
		

		
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(34, 139, 34));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		// Create a new doctor object on click.
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Doctor doctor = new Doctor( enterUsername.getText(), enterPassword.getText(), enterEmail.getText(),
						enterName.getText(), Long.parseLong(enterID.getText()), (Hospital) comboBox.getSelectedItem() );
				System.out.println(doctor);
			}
		});
		btnNewButton.setBounds(465, 412, 90, 30);
		contentPane.add(btnNewButton);
		

		
		txtName = new JTextField();
		txtName.setText("Name");
		txtName.setOpaque(false);
		txtName.setForeground(Color.WHITE);
		txtName.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtName.setEditable(false);
		txtName.setColumns(10);
		txtName.setBorder(null);
		txtName.setBackground(Color.BLACK);
		txtName.setBounds(142, 312, 110, 19);
		contentPane.add(txtName);
		
		txtCity = new JTextField();
		txtCity.setText("Hospital");
		txtCity.setOpaque(false);
		txtCity.setForeground(Color.WHITE);
		txtCity.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtCity.setEditable(false);
		txtCity.setColumns(10);
		txtCity.setBorder(null);
		txtCity.setBackground(Color.BLACK);
		txtCity.setBounds(142, 362, 110, 19);
		contentPane.add(txtCity);

		
		
	}
}
