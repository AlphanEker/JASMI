package guiDesign;

import classes.Doctor;
import classes.Account;
import classes.Date;
import classes.Day;
import classes.DietPlan;
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
import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class DietPlanPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtWelcomeTo;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_2;
	/**
	 * @wbp.nonvisual location=12,704
	 */
	private final JSlider slider = new JSlider();
	private JTable table;
	private JTextField txtBreakfast;
	private JTextField txtLunch;
	private JTextField txtDinner;

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
	public DietPlanPage(Patient patient) {
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
		btnSignUpHere.setIcon(new ImageIcon(DietPlanPage.class.getResource("/icons/809922_arrows_512x512_55x55.png")));
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
		txtWelcomeTo.setText("My Dietary Plan");
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
		
		JTextArea breakfast = new JTextArea();
		breakfast.setOpaque(false);
		breakfast.setEditable(false);
		breakfast.setBackground(Color.GREEN);
		breakfast.setCaretColor(Color.WHITE);
		breakfast.setBorder(new LineBorder(new Color(34, 139, 34), 3, true));
		breakfast.setForeground(Color.WHITE);
		breakfast.setFont(new Font("Tahoma", Font.BOLD, 13));
		breakfast.setBounds(96, 183, 471, 78);
		contentPane.add(breakfast);
		
		JTextArea lunch = new JTextArea();
		lunch.setOpaque(false);
		lunch.setForeground(Color.WHITE);
		lunch.setFont(new Font("Tahoma", Font.BOLD, 13));
		lunch.setEditable(false);
		lunch.setCaretColor(Color.WHITE);
		lunch.setBorder(new LineBorder(new Color(34, 139, 34), 3, true));
		lunch.setBackground(Color.GREEN);
		lunch.setBounds(96, 326, 471, 78);
		contentPane.add(lunch);
		
		JTextArea dinner = new JTextArea();
		dinner.setOpaque(false);
		dinner.setForeground(Color.WHITE);
		dinner.setFont(new Font("Tahoma", Font.BOLD, 13));
		dinner.setEditable(false);
		dinner.setCaretColor(Color.WHITE);
		dinner.setBorder(new LineBorder(new Color(34, 139, 34), 3, true));
		dinner.setBackground(Color.GREEN);
		dinner.setBounds(96, 467, 471, 78);
		contentPane.add(dinner);
		
		txtDinner = new JTextField();
		txtDinner.setText("Dinner");
		txtDinner.setOpaque(false);
		txtDinner.setHorizontalAlignment(SwingConstants.CENTER);
		txtDinner.setForeground(Color.WHITE);
		txtDinner.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtDinner.setEditable(false);
		txtDinner.setColumns(10);
		txtDinner.setBorder(null);
		txtDinner.setBackground(Color.BLACK);
		txtDinner.setBounds(223, 432, 228, 30);
		contentPane.add(txtDinner);
		
		txtLunch = new JTextField();
		txtLunch.setText("Lunch");
		txtLunch.setOpaque(false);
		txtLunch.setHorizontalAlignment(SwingConstants.CENTER);
		txtLunch.setForeground(Color.WHITE);
		txtLunch.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtLunch.setEditable(false);
		txtLunch.setColumns(10);
		txtLunch.setBorder(null);
		txtLunch.setBackground(Color.BLACK);
		txtLunch.setBounds(223, 288, 228, 30);
		contentPane.add(txtLunch);
		
		JButton generateButton = new JButton("Generate Dietary Plan");
		generateButton.setForeground(Color.WHITE);
		generateButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		generateButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		generateButton.setBackground(new Color(34, 139, 34));
		generateButton.setBounds(253, 85, 164, 30);
		generateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DietPlan dietPlan = patient.medicalRecords.createDietPlan();
				breakfast.setText(dietPlan.getBreakfastSuggestion());
				breakfast.setVisible(true);
				
				lunch.setText(dietPlan.getLunchSuggestion());
				
				dinner.setText(dietPlan.getDinnerSuggestion());
			
			}
		});
		contentPane.add(generateButton);
		
		table = new JTable();
		table.setBackground(Color.WHITE);
		table.setBounds(113, 288, 353, -24);
		contentPane.add(table);
		
		txtBreakfast = new JTextField();
		txtBreakfast.setText("Breakfast");
		txtBreakfast.setOpaque(false);
		txtBreakfast.setHorizontalAlignment(SwingConstants.CENTER);
		txtBreakfast.setForeground(Color.WHITE);
		txtBreakfast.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtBreakfast.setEditable(false);
		txtBreakfast.setColumns(10);
		txtBreakfast.setBorder(null);
		txtBreakfast.setBackground(Color.BLACK);
		txtBreakfast.setBounds(223, 143, 228, 30);
		contentPane.add(txtBreakfast);
		
		
	
	}
}