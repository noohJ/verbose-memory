package gui.quiz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class G05_Imagechange extends JFrame {
	
	// 연습 문제 :버튼을 누르면 다양한 그림들이 순차적으로 순환되도록 만들어보세요
	
	public G05_Imagechange() {
		super("Random penguin");
		
		JLabel label = new JLabel("waiting...");
		JButton btn = new JButton("I an Button");
		
		label.setHorizontalAlignment(JLabel.CENTER);
		
		btn.addActionListener(new ActionListener() {			
			int i =0;
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] img  = {"icons/peng1.jpeg","icons/peng2.jpeg","icons/peng4.jpeg","icons/peng3.jpeg","icons/peng5.jpeg"};
				label.setIcon(new ImageIcon(img[i]));
				label.setText("");
				++i;
				if (i==img.length) {
					i =0;
				}
			}
			
		});
		
		add(label,"Center");
		add(btn,"South");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1000,100,500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new G05_Imagechange();
	}
}
