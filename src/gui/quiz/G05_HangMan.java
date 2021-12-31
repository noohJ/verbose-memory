package gui.quiz;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class G05_HangMan extends JFrame{
	
	/*
	  	행맨을 만들어보세요
	  	
	  	1. 어떤 단어가 답인 경우 해당 단어의 길이만큼 _를 출력해준다.
	  	
	  	 ex) apple이 답인경우 _ _ _ _ _를 출력
	  	
	  	2. 사용자가 알파벳을 하나씩 입력하면 해당 알파벳이 포함되어 있다면 _ 를 알파벳으로 바꾼다.
	  	
	  	 ex) 사용자 p를 입력했다면 _ p p _ _ 를 출력
	  	 
	  	3. 사용자가 모든 _를 제거하면 몇번만에 맞췄는지 출력해 주세요.
	  	
	  	4. 정답 단어는 단어들이 적혀있는 파일에서 하나를 랜덤으로 뽑아주세요.
	 */
	String answer;
	public G05_HangMan() {
		super("Hang Man!");
		
		String answer = (new words()).toString();
		String va = "";
		for (int i = 0; i < answer.length();++i) {
			va = va + "_";
		}
		StringBuilder test = new StringBuilder(va);
		setResizable(false);
		ImageIcon[] icons = new ImageIcon[] {
				new ImageIcon("hangmandimg/start.png"),
				new ImageIcon("hangmandimg/1.png"),
				new ImageIcon("hangmandimg/2.png"),
				new ImageIcon("hangmandimg/3.png"),
				new ImageIcon("hangmandimg/4.png"),
				new ImageIcon("hangmandimg/5.png"),
				new ImageIcon("hangmandimg/6.png"),
				new ImageIcon("hangmandimg/7.png")
		};
		
		JButton label1 = new JButton("");
		label1.setHorizontalAlignment(JLabel.CENTER);
		label1.setIcon(icons[0]);
		
		JLabel label2 = new JLabel(va);
		System.out.println(answer);		
		label2.setFont(new Font("consolas|돋움",Font.BOLD,30));
		label2.setHorizontalAlignment(JLabel.CENTER);
		
		JLabel label3 = new JLabel("failed word");
		label3.setFont(new Font("consolas",Font.BOLD,20));
		
		
//		label1.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				String answer = (new words()).toString();
//				String va = "";
//				for (int i = 0; i < answer.length();++i) {
//					va = va + "_";
//				}
//				label1.setIcon(icons[0]);
//				label2.setText(va);
//			}
//		});
		
		label1.addKeyListener(new KeyAdapter() {
			int index = 1;
			int count =0;
			int falsec = 0;
			
			boolean check = false;
			@Override
			public void keyReleased(KeyEvent e) {
				
				System.out.println("키가 눌렀습니다:"+e.getKeyChar()); // 눌린 키
				for(int i = 0 ;i < answer.length();++i) {
					if (e.getKeyChar()==(answer.charAt(i))) {
						check = true;
						break;
					}else {
						check = false;
						continue;
					}
				}
				
				if (check == true) {
					for(int i = 0 ; i <answer.length();++i) {
						if(answer.charAt(i)==e.getKeyChar()) {
							test.setCharAt(i, e.getKeyChar());
						}else if (answer.charAt(i)!=e.getKeyChar()&& answer.charAt(i)!='_') {
							continue;
						}else {
							test.setCharAt(i, '_');
						}
					}
					++count;
					label2.setText(test.toString());
				}
				if (check == false && index !=7 ) {
					label1.setIcon(icons[index++%icons.length]);
					++count;
					++falsec;
				}
				if (check == false && index==7) {
					label1.setIcon(icons[7]);
					label2.setText(answer);
				}
				if(test.toString().equals(answer)) {
					label2.setText(String.format("총 실행 :%d 실패 : %d", count,falsec));
					index =0;
					count = 0;
					falsec = 0;
				}
			}
		});

		add(label1,"Center");
		add(label2,"South");
		add(label3,"North");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1000,100,500,600);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {

		new G05_HangMan();			

		
//		System.out.println(String.format("%s", new words()));
	}
}



