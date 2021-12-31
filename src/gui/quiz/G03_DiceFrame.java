package gui.quiz;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class G03_DiceFrame extends JFrame {

	/*
	  	주사위 던지기 버튼을 누르면 주사위 다섯개가 모두 랜덤으로 변화는 gui 프로그램을 만들어보세요.
	  	버튼을 누를때마다 각 수자가 몇개 놔았는지도 세어서 출력해주세요
	 */
	
	public G03_DiceFrame() {
		super("Dice check");
		super.setLayout(null);
		JButton dice1 = new JButton();
		JButton dice2 = new JButton();
		JButton dice3 = new JButton();
		JButton dice4 = new JButton();
		JButton dice5 = new JButton();
		JButton num1 = new JButton();
		JButton num2 = new JButton();
		JButton num3 = new JButton();
		JButton num4 = new JButton();
		JButton num5 = new JButton();
		JButton num6 = new JButton();
		JButton nc1 = new JButton();
		JButton nc2 = new JButton();
		JButton nc3 = new JButton();
		JButton nc4 = new JButton();
		JButton nc5 = new JButton();
		JButton nc6 = new JButton();
		
		
		JButton check = new JButton();
		
		check.setText("주사위 던지기");
		dice1.setText("1번");
		dice2.setText("2번");
		dice3.setText("3번");
		dice4.setText("4번");
		dice5.setText("5번");
		num1.setText("1");
		num2.setText("2");
		num3.setText("3");
		num4.setText("4");
		num5.setText("5");
		num6.setText("6");
		
		
		dice1.setLocation(45,50);
		dice1.setSize(100,100);
		dice1.setFont(new Font("궁서체",Font.BOLD,35));
		dice1.setEnabled(false);
		dice2.setLocation(195,50);
		dice2.setSize(100,100);
		dice2.setFont(new Font("궁서체",Font.BOLD,35));
		dice2.setEnabled(false);
		dice3.setLocation(345,50);
		dice3.setSize(100,100);
		dice3.setEnabled(false);
		dice3.setFont(new Font("궁서체",Font.BOLD,35));
		dice4.setLocation(495,50);
		dice4.setSize(100,100);
		dice4.setEnabled(false);
		dice4.setFont(new Font("궁서체",Font.BOLD,35));
		dice5.setLocation(645,50);
		dice5.setSize(100,100);
		dice5.setEnabled(false);
		dice5.setFont(new Font("궁서체",Font.BOLD,35));
		check.setSize(300,200);
		check.setLocation(250,300);
		
		num1.setLocation(25, 520);
		num1.setSize(100,100);
		num1.setFont(new Font("궁서체",Font.BOLD,35));
		num1.setEnabled(false);
		num2.setLocation(150, 520);
		num2.setSize(100,100);
		num2.setFont(new Font("궁서체",Font.BOLD,35));
		num2.setEnabled(false);
		num3.setLocation(275, 520);
		num3.setSize(100,100);
		num3.setFont(new Font("궁서체",Font.BOLD,35));
		num3.setEnabled(false);
		num4.setLocation(400, 520);
		num4.setSize(100,100);
		num4.setFont(new Font("궁서체",Font.BOLD,35));
		num4.setEnabled(false);
		num5.setLocation(525, 520);
		num5.setSize(100,100);
		num5.setFont(new Font("궁서체",Font.BOLD,35));
		num5.setEnabled(false);
		num6.setLocation(650, 520);
		num6.setSize(100,100);
		num6.setFont(new Font("궁서체",Font.BOLD,35));
		num6.setEnabled(false);
		
		check.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int[] dice_num = new int[5];
				for(int i = 0; i < 5;++i) {
					dice_num[i] = (int)(Math.random()*6+1);
				}
				int[] dice_count = {0,0,0,0,0,0};
				for(int i = 0; i < dice_num.length;++i) {
					++dice_count[dice_num[i]-1];
				}
				
				dice1.setText(""+dice_num[0]);
				dice2.setText(""+dice_num[1]);
				dice3.setText(""+dice_num[2]);
				dice4.setText(""+dice_num[3]);
				dice5.setText(""+dice_num[4]);
				
				
				check.setText("1 : "+dice_count[0]+"개 "
							+"2 : "+dice_count[1]+"개 "
							+"3 : "+dice_count[2]+"개 "
							+"4 : "+dice_count[3]+"개 "
							+"5 : "+dice_count[4]+"개 "
							+"6 : "+dice_count[5]+"개");
			}
			
		});
		
		add(check);
		add(dice1);
		add(dice2);
		add(dice3);
		add(dice4);
		add(dice5);
		add(num1);
		add(num2);
		add(num3);
		add(num4);
		add(num5);
		add(num6);
		setBounds(570,180, 800,800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new G03_DiceFrame();
	}
}
