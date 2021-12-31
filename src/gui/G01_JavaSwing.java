package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class G01_JavaSwing {
	/*
	  	# Java Swing
	  	
	  	 - javax.swing ��Ű���� Ŭ������
	  	 - GUI ���α׷��� ���� �� �ִ�.
	  	 
	  	# Container
	  	
	  	 - ���� ������Ʈ���� ��ġ�� �� �ִ� ��
	  	 - JFrame, JPanel, Jdialog ... ��
	  	 - �����̳ʿ��� ���̾ƿ��� ������ �� �ִ�.
	  	 
	  	# Component
	  	
	  	 - �����̳� ���� ��ġ�� �� �ִ� ��ǰ
	  	 - ��ư, ǥ, �����̴�, �޴� ... ��
	 */
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Hello, GUI!");
		
		// �������� ����� ������ ���� ������Ʈ�� ���̸鼭 GUI ���α׷��� ���� �� �ִ�.
		JButton btn1 = new JButton("Button One");
		btn1.setLocation(50,50);
		btn1.setSize(100,50);
		frame.add(btn1);

		// ���̾ƿ� ����(null�� �����ϸ� ���̾ƿ� ����)
		frame.setLayout(null);
		// �ش� �����������̴� ���·� �����Ѵ�. (�����ϸ鼭 ȭ�鿡 �׸���)
		frame.setVisible(true);
		// ������ ũ�� ����
		frame.setSize(500,500);
		// X(���)��ư ������ ���� ������ ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
