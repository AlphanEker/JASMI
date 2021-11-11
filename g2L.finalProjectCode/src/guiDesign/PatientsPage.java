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


import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

/**
 * Class containing a frame for patients
 * @author Arda YILDIZ
 * @version 02.05.2021
*/
public class PatientsPage 
{
	// Declare properties
	private JFrame frame;
	private JTextField txtPatientsMedicalRecords;
	
	/**
	 * Constructor which initializes the properties
	 * @param patient is an instance of the Patient class
	*/
	public PatientsPage( Patient patient)
	{
		// Initialize the frame
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
				
		// Adjust the frame
		frame.setBounds( 0, 0, 859, 460);
		frame.setTitle( "Patients Page");
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		frame.setResizable( false);
		frame.getContentPane().setLayout( null);
		frame.getContentPane().setBackground( Color.BLACK);
		
		JLabel labelPatientName = new JLabel("Patient Name: ");
		labelPatientName.setForeground(Color.WHITE);
		labelPatientName.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelPatientName.setBounds(33, 130, 116, 57);
		frame.getContentPane().add(labelPatientName);
		
		JLabel labelPatientNameRespond = new JLabel("Name Surname");
		labelPatientNameRespond.setForeground(Color.WHITE);
		labelPatientNameRespond.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelPatientNameRespond.setBounds(172, 131, 116, 57);
		frame.getContentPane().add(labelPatientNameRespond);
		
		JLabel labelPatientAge = new JLabel("Patient Age:");
		labelPatientAge.setForeground(Color.WHITE);
		labelPatientAge.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelPatientAge.setBounds(33, 183, 116, 57);
		frame.getContentPane().add(labelPatientAge);
		
		JLabel labelPatientAgeRespond = new JLabel("A number for age");
		labelPatientAgeRespond.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelPatientAgeRespond.setForeground(Color.WHITE);
		labelPatientAgeRespond.setBounds(172, 184, 116, 57);
		frame.getContentPane().add(labelPatientAgeRespond);
		
		JLabel labelPatientID = new JLabel("Patient ID:");
		labelPatientID.setForeground(Color.WHITE);
		labelPatientID.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelPatientID.setBounds(33, 238, 116, 57);
		frame.getContentPane().add(labelPatientID);
		
		JLabel labelPatientIDRespond = new JLabel("A number for ID");
		labelPatientIDRespond.setForeground(Color.WHITE);
		labelPatientIDRespond.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelPatientIDRespond.setBounds(172, 239, 116, 57);
		frame.getContentPane().add(labelPatientIDRespond);
		
		JLabel labelPatientGender = new JLabel("Patient Gender:");
		labelPatientGender.setForeground(Color.WHITE);
		labelPatientGender.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelPatientGender.setBounds(33, 305, 116, 57);
		frame.getContentPane().add(labelPatientGender);
		
		JLabel labelPatientGenderRespond = new JLabel("Gender");
		labelPatientGenderRespond.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelPatientGenderRespond.setForeground(Color.WHITE);
		labelPatientGenderRespond.setBounds(172, 306, 116, 57);
		frame.getContentPane().add(labelPatientGenderRespond);
		
		JLabel labelPatientBloodGroup = new JLabel("Patient Blood Group:");
		labelPatientBloodGroup.setForeground(Color.WHITE);
		labelPatientBloodGroup.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelPatientBloodGroup.setBounds(33, 365, 150, 57);
		frame.getContentPane().add(labelPatientBloodGroup);
		
		JLabel labelPatientBloodGroupRespond = new JLabel("Blood Group");
		labelPatientBloodGroupRespond.setForeground(Color.WHITE);
		labelPatientBloodGroupRespond.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelPatientBloodGroupRespond.setBounds(172, 366, 116, 57);
		frame.getContentPane().add(labelPatientBloodGroupRespond);
		
		// Create an image
		ImageIcon image = new ImageIcon( this.getClass().getResource( "/person-icon.png"));
		
		// Initialize the labelIcon
		JLabel labelIcon;
		labelIcon = new JLabel();
		labelIcon.setBackground(new Color(240, 240, 240));
		labelIcon.setHorizontalAlignment(SwingConstants.CENTER);
		labelIcon.setIcon( image);
		labelIcon.setFont(new Font( "Times New Roman", Font.PLAIN, 20));
		labelIcon.setBounds( 705, 0, 140, 140);
		frame.getContentPane().add( labelIcon);
		
		JTextArea medicalRecords = new JTextArea();
		medicalRecords.setFont(new Font("Tahoma", Font.BOLD, 13));
		medicalRecords.setText("Medical records are displayed here.\r\n");
		medicalRecords.setBounds(366, 204, 423, 189);
		frame.getContentPane().add(medicalRecords);
		
		JLabel labelMedicalRecords = new JLabel("Patient Medical Records");
		labelMedicalRecords.setForeground(Color.WHITE);
		labelMedicalRecords.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelMedicalRecords.setHorizontalAlignment(SwingConstants.CENTER);
		labelMedicalRecords.setBounds(399, 152, 341, 46);
		frame.getContentPane().add(labelMedicalRecords);
		
		txtPatientsMedicalRecords = new JTextField();
		txtPatientsMedicalRecords.setText("Patient's Medical Records");
		txtPatientsMedicalRecords.setHorizontalAlignment(SwingConstants.CENTER);
		txtPatientsMedicalRecords.setForeground(Color.WHITE);
		txtPatientsMedicalRecords.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtPatientsMedicalRecords.setEditable(false);
		txtPatientsMedicalRecords.setColumns(10);
		txtPatientsMedicalRecords.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtPatientsMedicalRecords.setBackground(new Color(34, 139, 34));
		txtPatientsMedicalRecords.setBounds(0, 33, 866, 38);
		frame.getContentPane().add(txtPatientsMedicalRecords);
		
		// Set the frame visible
		frame.setVisible( true);
	}	
}

	
