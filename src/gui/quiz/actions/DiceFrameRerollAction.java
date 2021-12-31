package gui.quiz.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class DiceFrameRerollAction implements ActionListener {
	
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	JButton totalBtn;
	
	public DiceFrameRerollAction(
			JButton btn1,
			JButton btn2,
			JButton btn3,
			JButton btn4,
			JButton btn5,
			JButton totalBtn) {
		this.btn1 = btn1;
		this.btn2 = btn2;
		this.btn3 = btn3;
		this.btn4 = btn4;
		this.btn5 = btn5;
		this.totalBtn = totalBtn;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("���� ũ�� : "+ f.getSize()); //���� â ũ�� Ȯ��
		
		int n1 = (int)(Math.random() *6 + 1),
			n2 = (int)(Math.random() *6 + 1),
			n3 = (int)(Math.random() *6 + 1),
			n4 = (int)(Math.random() *6 + 1),
			n5 = (int)(Math.random() *6 + 1);
		
		int[]count = new int[6];
		count[n1-1]++;
		count[n2-1]++;
		count[n3-1]++;
		count[n4-1]++;
		count[n5-1]++;
		
		btn1.setText(Integer.toString(n1));
		btn2.setText(Integer.toString(n2));
		btn3.setText(Integer.toString(n3));
		btn4.setText(Integer.toString(n4));
		btn5.setText(Integer.toString(n5));
		
		totalBtn.setText(String.format("%d / %d / %d / %d / %d / %d",count[0],count[1],count[2],count[3],count[4],count[5]));
	};
		
}

