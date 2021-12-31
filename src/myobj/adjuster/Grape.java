package myobj.adjuster;

import java.util.Random;

public class Grape {
	int price;
	int qty;
	
	private Grape(int price, int qty) {
		this.price = price;
		this.qty = qty;
	}
	
	public static Grape ran() {
		Random ran = new Random();
		return new Grape(ran.nextInt(1000) + 3000, ran.nextInt(10) +20);
	}
	@Override
	public String toString() {
		return String.format("[%s, %s]",qty,price);
	}
}
