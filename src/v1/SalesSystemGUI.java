package v1;
import javax.swing.*;

import java.awt.*;


public class SalesSystemGUI extends JFrame{
	
	//	Declaration and Initialization of GUI variables
	
	private JLabel titleLabel = new JLabel("Slip Submission Form");
	private	JLabel salesPersonLabel = new JLabel("Salesperson ID");
	private Integer salesPersonID[] = {1, 2, 3, 4, 5};
	private JComboBox<Integer> salesPersonComboBox = new JComboBox<Integer>(salesPersonID);
	private JLabel productNumberlLabel;
	private JComboBox<?> productNumberComboBox;
	private JLabel salesTotalLabel;
	private JTextField salesTotalTextBox;
	
	public SalesSystemGUI()	{
		super("Slip Submission Form");	//Title
		setLayout(new GridLayout(12, 2));
	}
}
