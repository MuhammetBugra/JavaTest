package form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class formornek {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		JTextArea t=new JTextArea("Text Area");
		JButton btn=new JButton("Hesapla");
		btn.setBounds(100, 300, 120, 30);
		t.setBounds(0, 0, 250, 200);
		JLabel l1,l2;
		l1=new JLabel();
		l2=new JLabel();
		l1.setBounds(50, 30, 100, 30);
		l2.setBounds(20, 80, 250, 200);
		btn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text=t.getText();
				String words[]=text.split("//s");
				l1.setText("Kelime: "+words.length);
				l2.setText("karakter: "+text.length()); } });
		frame.add(l1);
		frame.add(l2);
		frame.add(t);
		frame.add(btn);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
} }
