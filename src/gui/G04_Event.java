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
		status.setFont(new Font("consolas|����",Font.BOLD,25));
		
		btn.addMouseWheelListener(new MouseWheelListener() {
			int count;
			
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {				
				status.setText(Integer.toString(count+=e.getWheelRotation() * -1));
			}
			
		});
		// MouseListener ó�� �������� �����ؾ��ϴ� �������̽����� ���ؼ� Adapter��� Ŭ�������� �����Ѵ�.
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				status.setText("Mouse Enterd.");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				status.setText("�ʱ�ȭ �Ǿ����ϴ�.");
			}
			
			
		});
		btn.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("Ű�� �������ϴ�:"+e.getKeyCode()); // ���� Ű�ڵ�
				System.out.println("Ű�� �������ϴ�:"+e.getKeyChar()); // ���� Ű
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
