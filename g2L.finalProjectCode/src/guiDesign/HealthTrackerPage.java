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
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Font;

public class HealthTrackerPage extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField txtChooseADay;
	private JTextField textField_1;
	private JTextField txtThisCalendarDisplays;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Hospital hospital1 = new Hospital ( "hospital", "12345", "hospital@gmail.com", "Ankara Hospital", "Ankara");
		Day day = new Day(10);
		long ID = 122332;
		//MedicalRecord med = new MedicalRecord(12, 12.0, 12.0, day);
		ArrayList <Patient> list = new ArrayList<Patient>();
		Patient patient = new Patient("userName", "password", "mail", ID, "currentCity", "name");
		Doctor doctor = new Doctor("umut", "12345", "mail", "name", ID, hospital1);
		patient.getAppointment( 5, doctor);
		patient.getAppointment( 13, doctor);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HealthTrackerPage frame = new HealthTrackerPage( patient);
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
	public HealthTrackerPage(Patient patient) {
		getContentPane().setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 657);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new LineBorder(Color.BLACK, 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(33, -31, 37, 692);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setForeground(new Color(46, 139, 87));
		lblNewLabel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1.setBackground(new Color(34, 139, 34));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setBounds(586, -58, 37, 692);
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setForeground(new Color(46, 139, 87));
		lblNewLabel_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1.setBackground(new Color(34, 139, 34));
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Health Tracker");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(0, 33, 665, 38);
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_2.setBackground(new Color(34, 139, 34));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setBounds(0, 548, 655, 38);
		lblNewLabel_2_1.setOpaque(true);
		lblNewLabel_2_1.setForeground(new Color(46, 139, 87));
		lblNewLabel_2_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_2_1.setBackground(new Color(34, 139, 34));
		contentPane.add(lblNewLabel_2_1);
		
		txtChooseADay = new JTextField();
		txtChooseADay.setText("Choose a day to see your appointments.");
		txtChooseADay.setHorizontalAlignment(SwingConstants.CENTER);
		txtChooseADay.setOpaque(false);
		txtChooseADay.setEditable(false);
		txtChooseADay.setForeground(Color.WHITE);
		txtChooseADay.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtChooseADay.setBounds(122, 81, 414, 38);
		contentPane.add(txtChooseADay);
		
		txtThisCalendarDisplays = new JTextField();
		txtThisCalendarDisplays.setText("This calendar displays your free and busy days.");
		txtThisCalendarDisplays.setOpaque(false);
		txtThisCalendarDisplays.setHorizontalAlignment(SwingConstants.CENTER);
		txtThisCalendarDisplays.setForeground(Color.WHITE);
		txtThisCalendarDisplays.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtThisCalendarDisplays.setEditable(false);
		txtThisCalendarDisplays.setBounds(122, 500, 414, 38);
		contentPane.add(txtThisCalendarDisplays);
		
		JButton btnSignUpHere = new JButton("");
		btnSignUpHere.setIcon(new ImageIcon(VaccinationPage.class.getResource("/icons/809922_arrows_512x512_55x55.png")));
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
		btnSignUpHere.setBounds(80, 129, 55, 55);
		contentPane.add(btnSignUpHere);
		
		
		
		int counter = 0;
		int line = 0;
		JButton[] buttons = new JButton[30];
		Date date = new Date();
		
		
		for ( int i = 0 ; i < buttons.length ; i++)
	      {
	         buttons[i] = new JButton();
	 		 int fixedDay = i;
	 		 buttons[i].setBackground(new Color(152, 251, 152));
	        

	         // Updates the location of each button.
	         buttons[i].setBounds( 60*counter + 175, 60*line + 125, 60, 60);
	         
	         // If the person is available on given day, sets the button green.
			 if(!patient.getDate().getDay(i).getAvailability()){
				buttons[i].setBackground(new Color(250, 128, 114));
				patient.getDate().getDay(fixedDay).setAvailabilityFalse(0);
			 }
	         
	         buttons[i].setText ( ""+ (i + 1));
	         
	 		 ActionListener actionListener = new ActionListener() {//add action listener to listen for change
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	
	            		txtChooseADay.setText( patient.getDate().getDay(fixedDay).toString());
	            		txtChooseADay.setVisible(true);
	 
	            	}
	            };
	 		buttons[i].addActionListener(actionListener);
	            
	         
	         //buttons[i].addObject( date.getDay(i));
	         //buttons[i].setPosition ( i);

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
