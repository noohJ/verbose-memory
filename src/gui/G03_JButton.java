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
		
		// �ؽ�Ʈ ����
		btn1.setText("������ �۲�");
		// ��� ����
		btn1.setBackground(new Color(0x9ab1db));
		// �۲� ����
		btn1.setFont(new Font("�ü�ü", Font.BOLD|Font.ITALIC,35));
		
		//�׼� ������ ���� (�̺�Ʈ ����)
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btn1.setText(""+Math.random());
			}
			
		});
		// ��ư Ȱ��ȭ ���� ����
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
