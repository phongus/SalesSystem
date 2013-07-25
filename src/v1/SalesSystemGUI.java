package v1;
import javax.swing.*;

import java.awt.*;


public class SalesSystemGUI extends JFrame{
	
	//	Declaration and Initialization of GUI variables
	
	private JLabel titleLabel;
	private JPanel titlePanel;
	private	JLabel salesPersonLabel;
	private Integer salesPersonID[] = {1, 2, 3, 4};
	private JComboBox salesPersonComboBox;
	private JPanel salesPersonPanel;
	private JLabel productNumberLabel;
	private Integer productNumber[] = {1, 2, 3, 4, 5};
	private JPanel productPanel;
	private JComboBox productNumberComboBox;
	private JLabel salesTotalLabel;
	private JTextField salesTotalTextBox;
	private JPanel salesTotalPanel;
	private JButton submitButton;
	private JButton clearButton;
	private JPanel buttonPanel;
	
	public SalesSystemGUI()	{
		super("Slip Submission Form");	//Title
		setLayout(new GridLayout(5, 1));
		
		//First Panel
		JLabel titleLabel = new JLabel("Slip Submission Form", JLabel.CENTER);
		titlePanel = new JPanel(new GridLayout(1,1));
		titlePanel.add(titleLabel);
		
		//Second Panel
		JLabel salesPersonLabel = new JLabel("Sales Person ID");
		JComboBox salesPersonComboBox = new JComboBox(salesPersonID);
		JPanel salesPersonPanel = new JPanel(new GridLayout(1,2));
		salesPersonPanel.add(salesPersonLabel);
		salesPersonPanel.add(salesPersonComboBox);
		
		//Third Panel
		JLabel productNumberLabel = new JLabel("Product Number");
		JComboBox productNumberComboBox = new JComboBox(productNumber);
		JPanel productPanel = new JPanel(new GridLayout(1,2));
		productPanel.add(productNumberLabel);
		productPanel.add(productNumberComboBox);
		
		//Fourth Panel
		JLabel salesTotalLabel = new JLabel("Total Sales Amount");
		JTextField salesTotalTextBox = new JTextField();
		JPanel salesTotalPanel = new JPanel(new GridLayout(1,2));
		salesTotalPanel.add(salesTotalLabel);
		salesTotalPanel.add(salesTotalTextBox);
		
		//Fifth Panel
		JButton submitButton = new JButton("Submit");
		JButton clearButton = new JButton("Clear");
		JPanel buttonPanel = new JPanel(new GridLayout(1,2));
		buttonPanel.add(submitButton);
		buttonPanel.add(clearButton);
		
		add(titlePanel);
		add(salesPersonPanel);
		add(productPanel);
		add(salesTotalPanel);
		add(buttonPanel);

		

	}
}
