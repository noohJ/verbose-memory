package gui.quiz;

import javax.swing.JButton;
import javax.swing.JFrame;

import gui.quiz.actions.DiceFrameRerollAction;
import gui.quiz.components.DiceButton;

public class G03_DiceFram2 {
	
	public static void main(String[] args) {
		//화면을 구성하는 소스 뷰view
		JFrame f= new JFrame();
		f.setLayout(null);
		f.setResizable(false); // 크기 고정
		
		JButton btn1 = new DiceButton(10,10);
		f.add(btn1);
		
		JButton btn2 = new DiceButton(70,10);
		f.add(btn2);
		
		JButton btn3 = new DiceButton(130,10);
		f.add(btn3);
		
		JButton btn4 = new DiceButton(190,10);
		f.add(btn4);
		
		JButton btn5 = new DiceButton(250,10);
		f.add(btn5);

		
		JButton totalBtn = new JButton("0 / 0 / 0 / 0 / 0 / 0");
		totalBtn.setBounds(10,110,290,30);
		f.add(totalBtn);
		
		JButton rollBtn2 = new JButton("Reroll2");
		rollBtn2.setBounds(120,70,100,30);
		rollBtn2.addActionListener(new DiceFrameRerollAction(btn1,btn2,btn3,btn4,btn5,totalBtn));
		f.add(rollBtn2);
		
		JButton rollBtn = new JButton("Reroll");
		rollBtn.setBounds(10,70,100,30);
		rollBtn.addActionListener(new DiceFrameRerollAction(btn1,btn2,btn3,btn4,btn5,totalBtn));
		f.add(rollBtn);
		
		
		f.setLocation(1000,100);
		f.setSize(330,190);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
}
