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
import javax.swing.DefaultComboBoxModel;
import javax.swing.DropMode;
import javax.swing.JComboBox;

public class EmployeesPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtWelcomeTo;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_2;

	private final JSlider slider = new JSlider();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hospital hospital = new Hospital("", "", "", "", "");
					EmployeesPage frame = new EmployeesPage(hospital);
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
	public EmployeesPage(Hospital hospital) {
		// Sample account information.
		//Account account = new Account( "umutdivarci", "12345", "umut@hotmail.com");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 908, 657);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {hospital.doctors.get(0).getName(), 
				 			hospital.doctors.get(1).getName(), hospital.doctors.get(2).getName()}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox.setBackground(new Color(34, 139, 34));
		comboBox.setForeground(Color.WHITE);
		comboBox.setToolTipText("");
		comboBox.setBounds(98, 262, 220, 48);
		comboBox.setSelectedItem("Doctors");
		comboBox.setEditable(false);
		ActionListener cbActionListener = new ActionListener() {//add action listener to listen for change
            @Override
            public void actionPerformed(ActionEvent e) {

                String s = (String) comboBox.getSelectedItem();//get the selected item
                
                if (s.equals(hospital.doctors.get(0).getName()))
                {
					EmployeeDetailsPage frame = new EmployeeDetailsPage(hospital.otherEmployees.get(0), hospital);
					frame.setVisible(true);
					Window win = SwingUtilities.getWindowAncestor(contentPane);
					win.dispose();
                }
                
                if (s.equals(hospital.doctors.get(1).getName()))
                {
					EmployeeDetailsPage frame = new EmployeeDetailsPage(hospital.otherEmployees.get(1), hospital);
					frame.setVisible(true);
					Window win = SwingUtilities.getWindowAncestor(contentPane);
					win.dispose();
                }
                
                if (s.equals(hospital.doctors.get(2).getName()))
                {
					EmployeeDetailsPage frame = new EmployeeDetailsPage(hospital.otherEmployees.get(2), hospital);
					frame.setVisible(true);
					Window win = SwingUtilities.getWindowAncestor(contentPane);
					win.dispose();
                }
            }
        };
        comboBox.addActionListener(cbActionListener);
		contentPane.add(comboBox);
		contentPane.add(comboBox);
		
		JButton btnSignUpHere = new JButton("");
		btnSignUpHere.setIcon(new ImageIcon(EmployeesPage.class.getResource("/icons/809922_arrows_512x512_55x55.png")));
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
		txtWelcomeTo.setText("Hospital Staff");
		txtWelcomeTo.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcomeTo.setForeground(Color.WHITE);
		txtWelcomeTo.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtWelcomeTo.setColumns(10);
		txtWelcomeTo.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtWelcomeTo.setBackground(new Color(34, 139, 34));
		txtWelcomeTo.setBounds(0, 26, 976, 38);
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
		lblNewLabel_1_1.setBounds(830, 0, 37, 692);
		contentPane.add(lblNewLabel_1_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setForeground(new Color(46, 139, 87));
		lblNewLabel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_2.setBackground(new Color(34, 139, 34));
		lblNewLabel_2.setBounds(0, 555, 915, 38);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {hospital.nurses.get(0).getName(), 
						  hospital.nurses.get(1).getName()}));
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_1.setBackground(new Color(34, 139, 34));
		comboBox_1.setForeground(Color.WHITE);
		comboBox_1.setToolTipText("");
		comboBox_1.setBounds(343, 262, 220, 48);
		comboBox_1.setSelectedItem("Nurses");
		comboBox_1.setEditable(false);
		
		ActionListener cbActionListener1 = new ActionListener() {//add action listener to listen for change
            @Override
            public void actionPerformed(ActionEvent e) {

                String s = (String) comboBox_1.getSelectedItem();//get the selected item
                
                if (s.equals(hospital.nurses.get(0).getName()))
                {
					EmployeeDetailsPage frame = new EmployeeDetailsPage(hospital.nurses.get(0), hospital);
					frame.setVisible(true);
					Window win = SwingUtilities.getWindowAncestor(contentPane);
					win.dispose();
                }
                
                if (s.equals(hospital.nurses.get(1).getName()))
                {
					EmployeeDetailsPage frame = new EmployeeDetailsPage(hospital.nurses.get(1), hospital);
					frame.setVisible(true);
					Window win = SwingUtilities.getWindowAncestor(contentPane);
					win.dispose();
                }

            }
        };
        comboBox_1.addActionListener(cbActionListener1);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setEditable(true);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {hospital.secretaries.get(0).getName(), 
						  hospital.secretaries.get(1).getName()}));
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_2.setBackground(new Color(34, 139, 34));
		comboBox_2.setForeground(Color.WHITE);
		comboBox_2.setToolTipText("");
		comboBox_2.setBounds(587, 262, 220, 48);
		comboBox_2.setSelectedItem("Secretaries");
		comboBox_2.setEditable(false);
		
		ActionListener cbActionListener2 = new ActionListener() {//add action listener to listen for change
            @Override
            public void actionPerformed(ActionEvent e) {

                String s = (String) comboBox_2.getSelectedItem();//get the selected item
                
                if (s.equals(hospital.secretaries.get(0).getName()))
                {
					EmployeeDetailsPage frame = new EmployeeDetailsPage(hospital.secretaries.get(0), hospital);
					frame.setVisible(true);
					Window win = SwingUtilities.getWindowAncestor(contentPane);
					win.dispose();
                }
                
                if (s.equals(hospital.secretaries.get(1).getName()))
                {
					EmployeeDetailsPage frame = new EmployeeDetailsPage(hospital.secretaries.get(1), hospital);
					frame.setVisible(true);
					Window win = SwingUtilities.getWindowAncestor(contentPane);
					win.dispose();
                }

            }
        };
        comboBox_2.addActionListener(cbActionListener2);
		contentPane.add(comboBox_2);
		
	}
}