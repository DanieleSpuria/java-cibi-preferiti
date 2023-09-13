package org.lessons.java.array;

public class CibiPreferiti {

	public static void main(String[] args) {
		
		String[] cibi = { "spaghetti",  "pomodoro", "cipolla", "parmigiana", "tonno", "pizza" };
		
		System.out.println("lunghezza array: " + cibi.length);
		System.out.println("primo: " + cibi[0]);
		System.out.println("ultimo: " + cibi[cibi.length - 1]);
		System.out.println("mediano: " + cibi[(cibi.length / 2) - 1]);
	}
}
