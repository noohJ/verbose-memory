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
	  	����� ��������
	  	
	  	1. � �ܾ ���� ��� �ش� �ܾ��� ���̸�ŭ _�� ������ش�.
	  	
	  	 ex) apple�� ���ΰ�� _ _ _ _ _�� ���
	  	
	  	2. ����ڰ� ���ĺ��� �ϳ��� �Է��ϸ� �ش� ���ĺ��� ���ԵǾ� �ִٸ� _ �� ���ĺ����� �ٲ۴�.
	  	
	  	 ex) ����� p�� �Է��ߴٸ� _ p p _ _ �� ���
	  	 
	  	3. ����ڰ� ��� _�� �����ϸ� ������� ������� ����� �ּ���.
	  	
	  	4. ���� �ܾ�� �ܾ���� �����ִ� ���Ͽ��� �ϳ��� �������� �̾��ּ���.
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
		label2.setFont(new Font("consolas|����",Font.BOLD,30));
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
				
				System.out.println("Ű�� �������ϴ�:"+e.getKeyChar()); // ���� Ű
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
					label2.setText(String.format("�� ���� :%d ���� : %d", count,falsec));
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



