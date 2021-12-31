package myobj.RSP2;

public class HandShape {
	
	final public static HandShape SCISSORS = new HandShape("����", 0);
	final public static HandShape ROCK = new HandShape("����", 1);
	final public static HandShape PAPER = new HandShape("���ڱ�", 2);
	
	private String name;
	private int value;
	
	public HandShape(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	public String getName() {
		return this.name;
	}
	
}
