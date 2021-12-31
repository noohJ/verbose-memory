package gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class G04_Event {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("Event!");
		
		JButton btn = new JButton("Button");
		JButton btn2 = new JButton("Button2");
		JLabel status = new JLabel("...ABCDEFG");
		status.setFont(new Font("consolas|돋움",Font.BOLD,25));
		
		btn.addMouseWheelListener(new MouseWheelListener() {
			int count;
			
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {				
				status.setText(Integer.toString(count+=e.getWheelRotation() * -1));
			}
			
		});
		// MouseListener 처럼 많은것을 구현해야하는 인터페이스들은 위해서 Adapter라는 클래스들이 존재한다.
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				status.setText("Mouse Enterd.");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				status.setText("초기화 되었습니다.");
			}
			
			
		});
		btn.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("키가 눌렀습니다:"+e.getKeyCode()); // 눌린 키코드
				System.out.println("키가 눌렀습니다:"+e.getKeyChar()); // 눌린 키
			}
		});
		
		f.add(btn,BorderLayout.WEST);
		f.add(btn2, BorderLayout.CENTER);
		f.add(status,BorderLayout.SOUTH);
		
		f.setBounds(1000,100,500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
}
