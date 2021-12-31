package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class G03_JButton extends JFrame {
	
	public G03_JButton() {
		super("JButton Test!!");
		
		JButton btn1 = new JButton();
		
		// 텍스트 설정
		btn1.setText("진지한 글꼴");
		// 배경 설정
		btn1.setBackground(new Color(0x9ab1db));
		// 글꼴 설정
		btn1.setFont(new Font("궁서체", Font.BOLD|Font.ITALIC,35));
		
		//액션 리스너 설정 (이벤트 설정)
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btn1.setText(""+Math.random());
			}
			
		});
		// 버튼 활성화 여부 설정
//		btn1.setEnabled(false);
		
		add(btn1);
		
		setBounds(100,100,800,800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new G03_JButton();
	}
	
}
