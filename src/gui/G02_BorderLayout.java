package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class G02_BorderLayout {
	/*
	  	 �����̳ʿ��� ���̾ƿ��� ������ �� �ִ�.
	  	
	  	 # BorderLayout
	  	  
	  	  - �������ϰ� ����� �̷���� ���̾ƿ�
	  	  - ������Ʈ�� �߰��� �� ��ġ�� �Բ� �����ؾ� �Ѵ�.
	 */
	public static void main(String[] args) {
		
		JFrame f = new JFrame("Border Layout!");
		f.setLayout(new BorderLayout(5,5));
		
//		BorderLayout layout = (BorderLayout)f.getLayout();
//		layout.
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(Color.WHITE);
		
		f.add(new JButton("1") {
			{
				setBackground(Color.BLUE);
			}
		},BorderLayout.CENTER);
		f.add(btn2,BorderLayout.EAST);
		f.add(new JButton("3"),BorderLayout.SOUTH);
		f.add(new JButton("���� ���� �ؽ�Ʈ"),BorderLayout.WEST);
		f.add(new JButton("5"),BorderLayout.NORTH);
		
//		f.setLayout(null);
		f.setVisible(true);
		f.setBounds(100,100,1000,800); // ��ġ�� ũ�⸦ �ѹ��� �����ϴ� �޼���
		//f.setLocation(100,100);
		//f.setSize(1000, 800);
		f.setBackground(Color.RED);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
