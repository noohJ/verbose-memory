package gui.quiz.components;

import java.awt.Color;

import javax.swing.JButton;

public class DiceButton extends JButton {
	
	public DiceButton(int x, int y) {
		setText("6");
		setLocation(x,y);
		setSize(50,50);
		setBackground(Color.white);
	}
}
