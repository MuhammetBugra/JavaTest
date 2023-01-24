package form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class jFrame {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setSize(500,500);
		JPanel panel=new JPanel();
		JButton btn=new JButton("Buton");
		btn.setBounds(100, 0, 100, 30);
		JLabel l1=new JLabel();
		l1.setBounds(100,50,100,30);
		btn.addActionListener(new ActionListener() {
			int a=1;
			@Override
			public void actionPerformed(ActionEvent e) {
				l1.setText("Sayı: "+a++); } });
		frame.add(l1);
		panel.add(btn);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
} }
