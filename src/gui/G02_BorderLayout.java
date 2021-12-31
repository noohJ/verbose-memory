package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class G02_BorderLayout {
	/*
	  	 컨테이너에는 레이아웃을 설정할 수 있다.
	  	
	  	 # BorderLayout
	  	  
	  	  - 동서남북과 가운데로 이루어진 레이아웃
	  	  - 컴포넌트를 추가할 때 위치를 함께 지정해야 한다.
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
		f.add(new JButton("많은 양의 텍스트"),BorderLayout.WEST);
		f.add(new JButton("5"),BorderLayout.NORTH);
		
//		f.setLayout(null);
		f.setVisible(true);
		f.setBounds(100,100,1000,800); // 위치와 크기를 한번에 지정하는 메서드
		//f.setLocation(100,100);
		//f.setSize(1000, 800);
		f.setBackground(Color.RED);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
