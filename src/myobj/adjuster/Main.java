package myobj.adjuster;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Grape> grapes = new ArrayList<>();
		
		for (int i = 0; i < 10; ++i) {
			grapes.add(Grape.ran());
		}
		
		Collections.sort (grapes, GrapeAdjusters.priceAsc(true));
		
		System.out.println(grapes);
		
	}
}
