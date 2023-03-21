package Frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.swing.JMenu;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Label;
import java.awt.Button;
import javax.swing.JButton;



public class Home extends JFrame {

	private JPanel contentPane;
	private static final String FILE_NAME = "cart_data.txt";
	private static File file = new File(FILE_NAME);

	/**
	 * Launch the application.
	 */

	public static void addToCart(String itemName, double price) {
	    try {
	        FileWriter fw = new FileWriter(file, true);
	        BufferedWriter bw = new BufferedWriter(fw);
	        PrintWriter pw = new PrintWriter(bw);
	        
	        pw.println(itemName + "," + price);
	        
	        pw.close();
	        bw.close();
	        fw.close();
	        
	        System.out.println(itemName + " added to cart!");
	    } catch (IOException e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	}
	
	
	public static void readCart() throws IOException {
		String lv=new String();
		 Path filePath = Paths.get("cart_data.txt"); // specify the file path here
	     List<String> lines = Files.readAllLines(filePath);
	    
	     for (String line : lines) {
	         lv=lv+line+"\n"; // display each line in the file
	     }
	     JOptionPane.showMessageDialog(null, lv);
	}
	
	public static void loadCart() {
	    try {
	        FileReader fr = new FileReader(file);
	        BufferedReader br = new BufferedReader(fr);
	        
	        String line;
	        while ((line = br.readLine()) != null) {
	            String[] data = line.split(",");
	            String itemName = data[0];
	            double price = Double.parseDouble(data[1]);
	            
	            // Add the item to the cart
	            // ...
	        }
	        
	        br.close();
	        fr.close();
	    } catch (IOException e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	}

	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
					//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		loadCart();
	}
	
	/*
	 * Create the frame.
	 */

	public Home() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 945, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(222, 184, 135));
		panel_1.setBounds(0, 0, 946, 543);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(175, 236, 254));
		panel_2.setBounds(0, 78, 936, 153);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel1 = new JLabel("");
		lblNewLabel1.setBounds(30, 59, 139, 67);
		panel_2.setLayout(null);
		lblNewLabel1.setIcon(new ImageIcon("C:\\Users\\SNEHA NAGULA\\Downloads\\jr3 (1).jpg"));
		panel_2.add(lblNewLabel1);
		
		JLabel lblNewLabel2 = new JLabel("");
		lblNewLabel2.setIcon(new ImageIcon("C:\\Users\\SNEHA NAGULA\\Downloads\\jr3 (1).jpg"));
		lblNewLabel2.setBounds(652, 59, 124, 57);
		panel_2.add(lblNewLabel2);
		
		JLabel lblNewLabel3 = new JLabel("");
		lblNewLabel3.setIcon(new ImageIcon("C:\\Users\\SNEHA NAGULA\\Downloads\\jr2 (1).jpg"));
		lblNewLabel3.setBounds(339, 59, 129, 67);
		panel_2.add(lblNewLabel3);
		
		JButton btnNewButton = new JButton("Add to Cart");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setFont(new Font("Century Gothic", Font.PLAIN, 10));
		btnNewButton.setBounds(184, 85, 111, 23);
		panel_2.add(btnNewButton);
		
		btnNewButton.addActionListener((ActionListener) new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Perform action when button is clicked
		    	addToCart("Maroon full rim", 3700.0);
		    	JOptionPane.showMessageDialog(null, "Maroon full rim added to cart");
		    }
		});
		
		JLabel lblNewLabel_1 = new JLabel("Maroon Full Rim Square Eyeglasses");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(20, 10, 275, 35);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Rs 3700");
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_2.setBounds(187, 51, 72, 23);
		panel_2.add(lblNewLabel_2);
		
		JButton btnNewButton_3 = new JButton("Add to Cart");
		btnNewButton_3.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_3.setFont(new Font("Century Gothic", Font.PLAIN, 10));
		btnNewButton_3.setBounds(495, 85, 111, 23);
		panel_2.add(btnNewButton_3);
		
		JLabel lblNewLabel_1_3 = new JLabel("Copper Full Rim Round Eyeglasses");
		lblNewLabel_1_3.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblNewLabel_1_3.setBounds(339, 19, 281, 21);
		panel_2.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("Rs 4500");
		lblNewLabel_2_3.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_2_3.setBounds(495, 51, 72, 23);
		panel_2.add(lblNewLabel_2_3);
		
		JButton btnNewButton_6 = new JButton("Add to Cart");
		btnNewButton_6.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_6.setFont(new Font("Century Gothic", Font.PLAIN, 10));
		btnNewButton_6.setBounds(771, 86, 111, 23);
		panel_2.add(btnNewButton_6);
		
		JLabel lblNewLabel_1_6 = new JLabel("Transparent Full Rim Eyeglasses");
		lblNewLabel_1_6.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblNewLabel_1_6.setBounds(652, 19, 274, 21);
		panel_2.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_2_6 = new JLabel("Rs 6700");
		lblNewLabel_2_6.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_2_6.setBounds(786, 51, 96, 23);
		panel_2.add(lblNewLabel_2_6);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBackground(new Color(2, 164, 210));
		panel_2_1_1.setBounds(0, 228, 936, 153);
		panel_1.add(panel_2_1_1);
		panel_2_1_1.setLayout(null);
		
		JLabel lblNewLabel1_2 = new JLabel("New label");
		lblNewLabel1_2.setIcon(new ImageIcon("C:\\Users\\SNEHA NAGULA\\Downloads\\jh1 (1).jpg"));
		lblNewLabel1_2.setBounds(30, 47, 129, 70);
		panel_2_1_1.add(lblNewLabel1_2);
		
		JLabel lblNewLabel2_2 = new JLabel("New label");
		lblNewLabel2_2.setIcon(new ImageIcon("C:\\Users\\SNEHA NAGULA\\Downloads\\jh2 (1).jpg"));
		lblNewLabel2_2.setBounds(330, 47, 129, 70);
		panel_2_1_1.add(lblNewLabel2_2);
		
		JLabel lblNewLabel3_2 = new JLabel("New label");
		lblNewLabel3_2.setIcon(new ImageIcon("C:\\Users\\SNEHA NAGULA\\Downloads\\jh3 (1).jpg"));
		lblNewLabel3_2.setBounds(630, 52, 129, 70);
		panel_2_1_1.add(lblNewLabel3_2);
		
		JButton btnNewButton_1 = new JButton("Add to Cart");
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.setFont(new Font("Century Gothic", Font.PLAIN, 10));
		btnNewButton_1.setBounds(169, 94, 111, 23);
		panel_2_1_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Full Rim Square");
		lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(164, 29, 159, 21);
		panel_2_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Rs 3000");
		lblNewLabel_2_1.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(171, 61, 74, 19);
		panel_2_1_1.add(lblNewLabel_2_1);
		
		JButton btnNewButton_4 = new JButton("Add to Cart");
		btnNewButton_4.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_4.setFont(new Font("Century Gothic", Font.PLAIN, 10));
		btnNewButton_4.setBounds(469, 94, 111, 23);
		panel_2_1_1.add(btnNewButton_4);
		
		JLabel lblNewLabel_1_4 = new JLabel("Blue Full Rim Hustlr");
		lblNewLabel_1_4.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblNewLabel_1_4.setBounds(471, 30, 149, 21);
		panel_2_1_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_2_4 = new JLabel("Rs 8900");
		lblNewLabel_2_4.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_2_4.setBounds(471, 61, 74, 19);
		panel_2_1_1.add(lblNewLabel_2_4);
		
		JButton btnNewButton_7 = new JButton("Add to Cart");
		btnNewButton_7.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_7.setFont(new Font("Century Gothic", Font.PLAIN, 10));
		btnNewButton_7.setBounds(767, 94, 111, 23);
		panel_2_1_1.add(btnNewButton_7);
		
		JLabel lblNewLabel_1_7 = new JLabel("Amber Full Rim Hustlr");
		lblNewLabel_1_7.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblNewLabel_1_7.setBounds(769, 30, 177, 21);
		panel_2_1_1.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_2_7 = new JLabel("Rs 4900");
		lblNewLabel_2_7.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_2_7.setBounds(769, 61, 88, 19);
		panel_2_1_1.add(lblNewLabel_2_7);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 936, 79);
		panel_1.add(panel);
		panel.setBackground(new Color(64, 0, 128));
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("SAS Frames");
		lblNewLabel.setBackground(new Color(64, 0, 128));
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(0, 379, 936, 164);
		panel_1.add(panel_2_1);
		panel_2_1.setBackground(new Color(111, 221, 253));
		panel_2_1.setLayout(null);
		
		JLabel lblNewLabel1_1 = new JLabel("");
		lblNewLabel1_1.setIcon(new ImageIcon("C:\\Users\\SNEHA NAGULA\\Downloads\\js2 (1).jpg"));
		lblNewLabel1_1.setBackground(new Color(83, 215, 253));
		lblNewLabel1_1.setBounds(23, 54, 129, 68);
		panel_2_1.add(lblNewLabel1_1);
		
		JLabel lblNewLabel2_1 = new JLabel("");
		lblNewLabel2_1.setIcon(new ImageIcon("C:\\Users\\SNEHA NAGULA\\Downloads\\js2 (1).jpg"));
		lblNewLabel2_1.setBounds(330, 54, 129, 68);
		panel_2_1.add(lblNewLabel2_1);
		
		JLabel lblNewLabel3_1 = new JLabel("New label");
		lblNewLabel3_1.setIcon(new ImageIcon("C:\\Users\\SNEHA NAGULA\\Downloads\\js1 (1).jpg"));
		lblNewLabel3_1.setBounds(628, 54, 129, 68);
		panel_2_1.add(lblNewLabel3_1);
		
		JButton btnNewButton_2 = new JButton("Add to Cart");
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2.setFont(new Font("Century Gothic", Font.PLAIN, 10));
		btnNewButton_2.setBounds(169, 88, 111, 23);
		panel_2_1.add(btnNewButton_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Transparent");
		lblNewLabel_1_2.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(171, 24, 135, 21);
		panel_2_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Rs 2900");
		lblNewLabel_2_2.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_2_2.setBounds(171, 55, 89, 23);
		panel_2_1.add(lblNewLabel_2_2);
		
		JButton btnNewButton_5 = new JButton("Add to Cart");
		btnNewButton_5.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_5.setFont(new Font("Century Gothic", Font.PLAIN, 10));
		btnNewButton_5.setBounds(469, 88, 111, 23);
		panel_2_1.add(btnNewButton_5);
		
		JLabel lblNewLabel_1_5 = new JLabel("JDC Rim Brown");
		lblNewLabel_1_5.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblNewLabel_1_5.setBounds(471, 24, 135, 21);
		panel_2_1.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_2_5 = new JLabel("Rs 4900");
		lblNewLabel_2_5.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_2_5.setBounds(481, 55, 99, 23);
		panel_2_1.add(lblNewLabel_2_5);
		
		JButton btnNewButton_8 = new JButton("Add to Cart");
		btnNewButton_8.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_8.setFont(new Font("Century Gothic", Font.PLAIN, 10));
		btnNewButton_8.setBounds(767, 88, 111, 23);
		panel_2_1.add(btnNewButton_8);
		
		JLabel lblNewLabel_1_8 = new JLabel("Garge Fossil");
		lblNewLabel_1_8.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lblNewLabel_1_8.setBounds(769, 24, 135, 21);
		panel_2_1.add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_2_8 = new JLabel("Rs 5600");
		lblNewLabel_2_8.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_2_8.setBounds(769, 55, 89, 23);
		panel_2_1.add(lblNewLabel_2_8);
	}
}
