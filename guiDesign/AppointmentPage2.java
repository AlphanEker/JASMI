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
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Window;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.xml.namespace.QName;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class AppointmentPage2 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtWelcomeToHealth;

	/**
	 * Create the frame.
	 */
	public AppointmentPage2(Patient patient, Doctor doctor) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1020, 857);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new LineBorder(Color.BLACK, 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setText("Get appointment from Dr. " + doctor.getName());
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setForeground(Color.WHITE);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		textField_2.setBackground(new Color(34, 139, 34));
		textField_2.setBounds(-11, 28, 1057, 38);
		contentPane.add(textField_2);
		
		txtWelcomeToHealth = new JTextField();
		txtWelcomeToHealth.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcomeToHealth.setForeground(Color.WHITE);
		txtWelcomeToHealth.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtWelcomeToHealth.setEditable(false);
		txtWelcomeToHealth.setColumns(10);
		txtWelcomeToHealth.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtWelcomeToHealth.setBackground(new Color(34, 139, 34));
		txtWelcomeToHealth.setBounds(-11, 748, 1121, 38);
		contentPane.add(txtWelcomeToHealth);
		
		JButton btnSignUpHere = new JButton("");
		btnSignUpHere.setIcon(new ImageIcon(VaccinationPage.class.getResource("/icons/809922_arrows_512x512_55x55.png")));
		btnSignUpHere.setHorizontalAlignment(SwingConstants.LEFT);
		btnSignUpHere.setBorder(null);
		// Close the current page. Return to previous one.
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
		btnSignUpHere.setBounds(29, 97, 55, 55);
		contentPane.add(btnSignUpHere);
		
		
		
		int counter = 0;
		int line = 0;
		JButton[] buttons = new JButton[30];
		
		
		for ( int i = 0 ; i < buttons.length ; i++){

	        buttons[i] = new JButton();
			int cc = i;
			buttons[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// On click, get an appointment from that doctor.
					patient.getAppointment(cc, doctor);
					buttons[cc].setBackground(new Color(242, 186, 201));
					buttons[cc].setText ( doctor.getDate().getDay(cc).toString() + " not available");
				}
			}
			
			
		);

	         // Updates the location of each button.
	         buttons[i].setBounds( 160*counter + 100, 110*line + 85, 150, 100);
			 if(patient.getAvailabe(i)  && doctor.getAvailability(i)){
				buttons[i].setBackground(new Color(186, 242, 187));
				buttons[i].setOpaque(true);
				buttons[i].setBorderPainted(true);
				buttons[i].setText ( doctor.getDate().getDay(i).toString());
				
			 }
			 else{
				buttons[i].setBackground(new Color(242, 186, 201));
				buttons[i].setOpaque(true);
				buttons[i].setBorderPainted(true);
				buttons[i].setText ( doctor.getDate().getDay(i).toString());
			 }
	         
	        

	         contentPane.add(buttons[i]);
	        

	         // Counts the coordinates of the buttons.
	         counter += 1;
	         if ( counter == 5)
	         {
	            counter = 0;
	            line += 1;

	         }
	     }
	}		
}