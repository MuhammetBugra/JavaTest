package form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class j_text {
	public static void main(String[] args) {
	 	JFrame f=new JFrame();
	 	JLabel l1,l2,l3;
	 	JTextField t1,t2,t3;
	 	JButton buton;
	 	l1=new JLabel("İlk Sayı");
	 	l1.setBounds(50,10,100,30);
	 	t1=new JTextField();
	 	t1.setBounds(50, 40, 200, 30);
	 	l2=new JLabel("İkinci Sayı");
	 	l2.setBounds(50,70,100,30);
	 	t2=new JTextField();
	 	t2.setBounds(50, 100, 200, 30);
	 	l3=new JLabel("Toplam");
	 	l3.setBounds(50,130,100,30);
	 	t3=new JTextField();
	 	t3.setBounds(50, 160, 200, 30);
	 	t3.setEditable(false);
	 	buton=new JButton("Toplam");
	 	buton.setBounds(50, 190, 200, 30);
	 	buton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int a=Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText());
				String toplam=String.valueOf(a);
				t3.setText(toplam); } });
	 	f.add(buton);
	 	f.add(l1);
	 	f.add(l2);
	 	f.add(t1);
	 	f.add(t2);
	 	f.add(l3);
	 	f.add(t3);
	 	f.setSize(400,400);
	 	f.setLayout(null);
	 	f.setVisible(true);
} }
