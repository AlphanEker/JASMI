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

public class ChangeMailPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtWelcomeTo;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_2;
	/**
	 * @wbp.nonvisual location=12,704
	 */
	private final JSlider slider = new JSlider();
	private JTextField txtConfirmNewPassword;
	private JTextField txtEnterNewPassword;
	private JFormattedTextField enterNewMail;
	private JTextField errorText;

	/**
	 * Create the frame.
	 */
	public ChangeMailPage(Account account) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 657);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSignUpHere = new JButton("");
		btnSignUpHere.setIcon(new ImageIcon(ChangeMailPage.class.getResource("/icons/809922_arrows_512x512_55x55.png")));
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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(LogInPage.class.getResource("/icons/newIcon_190x190-removebg-preview.png")));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(232, 346, 190, 190);
		contentPane.add(lblNewLabel);
		
		txtWelcomeTo = new JTextField();
		txtWelcomeTo.setEditable(false);
		txtWelcomeTo.setText("Change E-mail");
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
		
		enterNewMail = new JFormattedTextField();
		enterNewMail.setHorizontalAlignment(SwingConstants.LEFT);
		enterNewMail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		enterNewMail.setBounds(232, 141, 202, 30);
		contentPane.add(enterNewMail);
		
		JFormattedTextField confirmNewMail = new JFormattedTextField();
		confirmNewMail.setHorizontalAlignment(SwingConstants.LEFT);
		confirmNewMail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		confirmNewMail.setBounds(232, 214, 202, 30);
		contentPane.add(confirmNewMail);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// If entered mails match, update the e-mail accordingly.
				if ( enterNewMail.getText().equals(confirmNewMail.getText()))
				{
					account.setMail(enterNewMail.getText());
					errorText.setForeground(new Color(34, 139, 34));
					errorText.setText("Your e-mail is succesfully updated.");
					errorText.setVisible(true);
				}
				
				else
				{
					errorText.setText("The e-mails entered do not match!");
					errorText.setVisible(true);
				}
			}
		});
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSave.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnSave.setBackground(new Color(34, 139, 34));
		btnSave.setBounds(293, 277, 90, 30);
		contentPane.add(btnSave);
		
		txtConfirmNewPassword = new JTextField();
		txtConfirmNewPassword.setText("Confirm new e-mail");
		txtConfirmNewPassword.setOpaque(false);
		txtConfirmNewPassword.setForeground(Color.WHITE);
		txtConfirmNewPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtConfirmNewPassword.setEditable(false);
		txtConfirmNewPassword.setColumns(10);
		txtConfirmNewPassword.setBorder(null);
		txtConfirmNewPassword.setBackground(Color.BLACK);
		txtConfirmNewPassword.setBounds(91, 221, 142, 19);
		contentPane.add(txtConfirmNewPassword);
		
		txtEnterNewPassword = new JTextField();
		txtEnterNewPassword.setText("Enter new e-mail");
		txtEnterNewPassword.setOpaque(false);
		txtEnterNewPassword.setForeground(Color.WHITE);
		txtEnterNewPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtEnterNewPassword.setEditable(false);
		txtEnterNewPassword.setColumns(10);
		txtEnterNewPassword.setBorder(null);
		txtEnterNewPassword.setBackground(Color.BLACK);
		txtEnterNewPassword.setBounds(91, 150, 120, 19);
		contentPane.add(txtEnterNewPassword);
		
		errorText = new JTextField();
		errorText.setVisible(false);
		errorText.setText("The e-mails entered do not match!");
		errorText.setOpaque(false);
		errorText.setForeground(Color.RED);
		errorText.setFont(new Font("Tahoma", Font.BOLD, 13));
		errorText.setEditable(false);
		errorText.setColumns(10);
		errorText.setBorder(null);
		errorText.setBackground(Color.BLACK);
		errorText.setBounds(212, 95, 240, 19);
		contentPane.add(errorText);
	}
}