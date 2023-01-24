package build;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private double number,answer;
	int operation;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true); } 
				catch (Exception e) {
					e.printStackTrace(); } } }); }
	
	public void addInput(String str) {
		textField.setText(textField.getText()+ str); }
	
	public void calculate() {
		switch(operation) {
		    case 1: answer=number+Double.parseDouble(textField.getText());
		            textField.setText(Double.toString(answer));
		            break;
		    case 2: answer=number-Double.parseDouble(textField.getText());
                    textField.setText(Double.toString(answer));  
                    break;
		    case 3: answer=number*Double.parseDouble(textField.getText());
                    textField.setText(Double.toString(answer));
                    break;
		    case 4: answer=number/Double.parseDouble(textField.getText());
                    textField.setText(Double.toString(answer));
                    break; } }
	
	public Calculator() {
		setType(Type.UTILITY);
		setTitle("Hesap Makinesi");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 365, 60);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(10, 20, 345, 40);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(164, -1, 191, 20);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 87, 365, 366);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 4, 20, 20));
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand()); } });
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("8");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand()); } });
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand()); } });
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("+");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(textField.getText());
				textField.setText("");
				operation=1;
				lblNewLabel.setText(number+e.getActionCommand()); } });
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand()); } });
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_6 = new JButton("5");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand()); } });
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand()); } });
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("-");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(textField.getText());
				textField.setText("");
				operation=2;
				lblNewLabel.setText(number+e.getActionCommand()); } });
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnNewButton_7);
		
		JButton btnNewButton_9 = new JButton("1");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand()); } });
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnNewButton_9);
		
		JButton btnNewButton_8 = new JButton("2");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand()); } });
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnNewButton_8);
		
		JButton btnNewButton_10 = new JButton("3");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand()); } });
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnNewButton_10);
		
		JButton btnNewButton_5_1 = new JButton("*");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(textField.getText());
				textField.setText("");
				operation=3;
				lblNewLabel.setText(number+e.getActionCommand()); } });
		btnNewButton_5_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnNewButton_5_1);
		
		JButton btnNewButton_11 = new JButton("0");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand()); } });
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnNewButton_11);
		
		JButton btnNewButton_5_2 = new JButton("=");
		btnNewButton_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				lblNewLabel.setText(""); } });
		btnNewButton_5_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnNewButton_5_2);
		
		JButton btnNewButton_5_3 = new JButton("C");
		btnNewButton_5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(""); } });
		btnNewButton_5_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnNewButton_5_3);
		
		JButton btnNewButton_5_4 = new JButton("/");
		btnNewButton_5_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(textField.getText());
				textField.setText("");
				operation=4;
				lblNewLabel.setText(number+e.getActionCommand()); } });
		btnNewButton_5_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_1.add(btnNewButton_5_4);
}	
 }