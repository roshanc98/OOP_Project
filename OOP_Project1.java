package restaraunt;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Restaraunt 
{
	private JFrame frame;
	private JTextField chickenburgertext;
	private JTextField chickenburgermealtext;
	private JTextField cheeseburgertext;
	private JTextField Milkshaketext;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable()) 
		{
			public void run() 
			{
				try 
				{
					Restaraunt window = new Restaraunt();
					window.frame.setVisible(true);
				}catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		}
	}

	public Restaraunt() 
	{
		initialize();
	}
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(0, 0, 1366, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(42, 97, 350, 451);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger");
		lblChickenBurger.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 22));
		lblChickenBurger.setBounds(10, 64, 167, 32);
		panel.add(lblChickenBurger);
		
		JLabel labelchickeburgermeal = new JLabel("Chicken Burger Meal");
		labelchickeburgermeal.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 22));
		labelchickeburgermeal.setBounds(10, 160, 225, 32);
		panel.add(labelchickeburgermeal);
		
		JLabel labelcheezeburger = new JLabel("Cheese Burger");
		labelcheezeburger.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 22));
		labelcheezeburger.setBounds(10, 256, 167, 32);
		panel.add(labelcheezeburger);

		JLabel milkshakelabel = new JLabel("Milkshake");
		milkshakelabel.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 22));
		milkshakelabel.setBounds(10, 317, 106, 32);
		panel.add(milkshakelabel);
		
		chickenburgertext = new JTextField();
		chickenburgertext.setFont(new Font("Dialog", Font.PLAIN, 24));
		chickenburgertext.setBounds(245, 64, 95, 32);
		panel.add(chickenburgertext);
		chickenburgertext.setColumns(10);
		
		chickenburgermealtext = new JTextField();
		chickenburgermealtext.setFont(new Font("Dialog", Font.PLAIN, 24));
		chickenburgermealtext.setColumns(10);
		chickenburgermealtext.setBounds(245, 160, 95, 32);
		panel.add(chickenburgermealtext);
		
		cheeseburgertext = new JTextField();
		cheeseburgertext.setFont(new Font("Dialog", Font.PLAIN, 24));
		cheeseburgertext.setColumns(10);
		cheeseburgertext.setBounds(245, 256, 95, 32);
		panel.add(cheeseburgertext);
		
		Milkshaketext = new JTextField();
		Milkshaketext.setFont(new Font("Dialog", Font.PLAIN, 24));
		Milkshaketext.setColumns(10);
		Milkshaketext.setBounds(245, 357, 95, 32);
		panel.add(Milkshaketext);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select a milkshake", "Strawberry", "Oreo"}));
		comboBox.setBounds(10, 358, 151, 31);
		panel.add(comboBox);
		
		JRadioButton Homedeliveryradio = new JRadioButton("Home Delivery");
		Homedeliveryradio.setBounds(10, 410, 109, 23);
		panel.add(Homedeliveryradio);
		
		JRadioButton radioButtonTax = new JRadioButton("Tax");
		radioButtonTax.setBounds(245, 410, 95, 23);
		panel.add(radioButtonTax);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_2.setBounds(402, 97, 369, 226);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_9 = new JLabel("GST @ 18%");
		label_9.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 22));
		label_9.setBounds(10, 11, 167, 32);
		panel_2.add(label_9);
		
		JLabel SubTotal = new JLabel("SubTotal");
		SubTotal.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 22));
		SubTotal.setBounds(10, 91, 225, 32);
		panel_2.add(SubTotal);
		
		JLabel JlblTOtal = new JLabel("Total");
		JlblTOtal.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 22));
		JlblTOtal.setBounds(10, 171, 167, 32);
		panel_2.add(JlblTOtal);
		
		JLabel tAXLABEL = new JLabel("");
		tAXLABEL.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 24));
		tAXLABEL.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tAXLABEL.setBounds(234, 13, 125, 32);
		panel_2.add(tAXLABEL);
				
		JLabel sUBTOTALLABEL = new JLabel("");
		sUBTOTALLABEL.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 24));
		sUBTOTALLABEL.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		sUBTOTALLABEL.setBounds(234, 93, 125, 32);
		panel_2.add(sUBTOTALLABEL);
		
		JLabel TOTALLABEL = new JLabel("");
		TOTALLABEL.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 24));
		TOTALLABEL.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		TOTALLABEL.setBounds(234, 171, 125, 32);
		panel_2.add(TOTALLABEL);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_3.setBounds(402, 328, 369, 220);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label_4 = new JLabel("Cost of Drinks");
		label_4.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 22));
		label_4.setBounds(10, 11, 167, 32);
		panel_3.add(label_4);
		
		JLabel label_5 = new JLabel("Cost of Meal");
		label_5.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 22));
		label_5.setBounds(10, 91, 225, 32);
		panel_3.add(label_5);
		
		JLabel label_6 = new JLabel("Cost of Delivery");
		label_6.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 22));
		label_6.setBounds(10, 171, 167, 32);
		panel_3.add(label_6);
		
		JLabel CostofDrinks = new JLabel("");
		CostofDrinks.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 24));
		CostofDrinks.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		CostofDrinks.setBounds(234, 11, 125, 32);
		panel_3.add(CostofDrinks);
		
		JLabel CostofMeal = new JLabel("");
		CostofMeal.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 24));
		CostofMeal.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		CostofMeal.setBounds(234, 92, 125, 32);
		panel_3.add(CostofMeal);
		
		JLabel CostofDelivery = new JLabel("");
		CostofDelivery.setFont(new Font("Microsoft New Tai Lue", Font.PLAIN, 24));
		CostofDelivery.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		CostofDelivery.setBounds(234, 172, 125, 32);
		panel_3.add(CostofDelivery);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_4.setBounds(781, 97, 500, 451);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		
                JLabel lblAchintyaKhullar = new JLabel("Achintya Khullar - 56");
		lblAchintyaKhullar.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
		lblAchintyaKhullar.setBounds(84, 76, 331, 68);
		panel_4.add(lblAchintyaKhullar);
                
                
                JLabel lblShivamSoni = new JLabel("Shivam Soni - 57");
		lblShivamSoni.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
		lblShivamSoni.setBounds(84, 224, 331, 68);
		panel_4.add(lblShivamSoni);
		
		JLabel lblSiddhantJain = new JLabel("Siddhant Jain - 50");
		lblSiddhantJain.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
		lblSiddhantJain.setBounds(84, 298, 331, 68);
		panel_4.add(lblSiddhantJain);
		
		JLabel lblHarshitSaxena = new JLabel("Harshit Saxena - 30");
		lblHarshitSaxena.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
		lblHarshitSaxena.setBounds(84, 372, 331, 68);
		panel_4.add(lblHarshitSaxena);
		
		JLabel lblRoshan = new JLabel("Roshan - 31");
		lblRoshan.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 24));
		lblRoshan.setBounds(84, 150, 331, 68);
		panel_4.add(lblRoshan);
		
		
		JLabel lblMadeBy = new JLabel("Made by");
		lblMadeBy.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 36));
	}
