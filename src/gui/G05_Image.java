package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class G05_Image extends JFrame {
	
	public G05_Image() {
		super("print Image!");
		
		JLabel label = new JLabel("waiting...");
		JButton btn = new JButton("I an Button");
		
		label.setHorizontalAlignment(JLabel.CENTER); // 가로 정렬
		
		ImageIcon[] icons = new ImageIcon[] {
					new ImageIcon("icons/peng1.jpeg"),
					new ImageIcon("icons/peng2.jpeg"),
					new ImageIcon("icons/peng3.jpeg"),
					new ImageIcon("icons/peng4.jpeg"),
					new ImageIcon("icons/peng5.jpeg"),
					new ImageIcon("icons/peng6.jpeg")
		};
		
		btn.addActionListener(new ActionListener() {
			int index;
			@Override
			public void actionPerformed(ActionEvent e) {	
				label.setIcon(icons[index++ % icons.length]);
				label.setText("");
			}
			
		});
		
		add(label,"Center");
		add(btn,"South");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1000,100,500,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new G05_Image();
	}
	
}
