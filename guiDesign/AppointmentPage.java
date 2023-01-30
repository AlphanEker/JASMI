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
import java.awt.EventQueue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import java.awt.Window;

import javax.swing.JComboBox;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class AppointmentPage extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField textField;
	private JTextField txtAppointmentPage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
		Hospital hospital = new Hospital ( "hospital", "12345", "patient@hotmail.com", "Ankara Hospital", "Ankara");
		
		Doctor doctor1 = new Doctor("doctor1", "12345", "doctor@hotmail.com", "Umut Divarci", 22002116, hospital);
		Doctor doctor2 = new Doctor("doctor2", "12345", "doctor@hotmail.com", "Alphan Eker", 22002116, hospital);
		Doctor doctor3 = new Doctor("doctor3", "12345", "doctor@hotmail.com", "Faaiz Khan", 22002116, hospital);
		
		Employee nurse1 = new Employee("Arda Yildiz", "Nurse", "Hacettepe University", 25, 5000.0);
		Employee nurse2 = new Employee("Aynur Dayanik", "Nurse", "Bilkent University", 35, 6000.0);
		
		Employee secretary1 = new Employee("Idil Dal", "Secretary", "Koc University", 22, 4500.0);
		Employee secretary2 = new Employee("Ekin Ates", "Secretary", "METU", 24, 5500.0);
		
		hospital.doctors.add(doctor1);
		hospital.doctors.add(doctor2);
		hospital.doctors.add(doctor3);
		
		hospital.nurses.add(nurse1);
		hospital.nurses.add(nurse2);
		
		
		hospital.secretaries.add(secretary1);
		hospital.secretaries.add(secretary2);
		
		Day day = new Day(28);
		Patient patient = new Patient( "patient", "12345", "patient@hotmail.com", 123341, "Ankara", "Umut Divarc�");
		MedicalRecord medicalRecord = new MedicalRecord (22, 120.0, 1.80, day);
		medicalRecord.addCondition("Type 2 Diabetes");
		medicalRecord.addCondition("Overweight");
		medicalRecord.addCondition("Astigmatism");
		
		patient.setMedicalRecord(medicalRecord);
		patient.getAppointment(7, doctor1, "Appointment with doctor " + doctor1.getName());
		patient.getAppointment(17, doctor2);
		patient.getDate().getDay(25).setAvailabilityFalse();
		
		
		Pharmacy pharmacy = new Pharmacy ("pharmacy", "12345", "pharmacy@hotmail.com", "Bilkent Pharmacy", "Ankara");
		pharmacy.employees.add(secretary1);
		pharmacy.employees.add(secretary2);
					AppointmentPage frame = new AppointmentPage(hospital, patient);
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
	public AppointmentPage(Hospital hospital, Patient patient) {

		String [] doctorNameList = new String[hospital.getDoctorNum()];
		JComboBox comboBox_1 = new JComboBox();
		
		// Fill a JComboBox with doctor names.
		for (int i = 0; i < doctorNameList.length; i++) {
			doctorNameList[i] = hospital.getDoctor(i).getName();
			comboBox_1.addItem(hospital.getDoctor(i).getName());
			
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 526);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setForeground(new Color(34, 139, 34));
		contentPane.setBorder(new LineBorder(Color.BLACK, 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		

		comboBox_1.setEditable(true);
		comboBox_1.setToolTipText("");
		comboBox_1.setForeground(Color.WHITE);
		comboBox_1.setBackground(new Color(34, 139, 34));
		comboBox_1.setBounds(219, 153, 204, 48);
		comboBox_1.setSelectedItem("Available Doctors");
		comboBox_1.setEditable(false);
		
		
		ActionListener cbActionListener1 = new ActionListener() {//add actionlistner to listen for change
            @Override
            public void actionPerformed(ActionEvent e) {

                String s = (String) comboBox_1.getSelectedItem();//get the selected item
                // Open a new page for appointments. Close the current one.
				if (s.equals(hospital.getDoctor(0).getName())) {
					AppointmentPage2 frame1 = new AppointmentPage2(patient, hospital.getDoctor(0));
					frame1.setVisible(true);
					Window win1 = SwingUtilities.getWindowAncestor(contentPane);
					win1.dispose();
					
					
				}

				if (s.equals(doctorNameList[1])) {
					AppointmentPage2 frame2 = new AppointmentPage2(patient, hospital.getDoctor(0));
					frame2.setVisible(true);
					Window win2 = SwingUtilities.getWindowAncestor(contentPane);
					win2.dispose();
					
				}

				if (s.equals(doctorNameList[2])) {
					AppointmentPage2 frame3 = new AppointmentPage2(patient, hospital.getDoctor(0));
					frame3.setVisible(true);
					Window win3 = SwingUtilities.getWindowAncestor(contentPane);
					win3.dispose();
					
				}
            }
        };
		comboBox_1.addActionListener(cbActionListener1);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel = new JLabel("Select a Doctor To Schedule an Appointment");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(145, 65, 504, 45);
		contentPane.add(lblNewLabel);
		
		txtAppointmentPage = new JTextField();
		txtAppointmentPage.setText("Appointment Page");
		txtAppointmentPage.setHorizontalAlignment(SwingConstants.CENTER);
		txtAppointmentPage.setForeground(Color.WHITE);
		txtAppointmentPage.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtAppointmentPage.setEditable(false);
		txtAppointmentPage.setColumns(10);
		txtAppointmentPage.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtAppointmentPage.setBackground(new Color(34, 139, 34));
		txtAppointmentPage.setBounds(-14, 17, 655, 38);
		contentPane.add(txtAppointmentPage);
		int counter = 0;
		int line = 0;
		JTextField[] buttons = new JTextField[30];
			
	}
}