package main;

import java.util.Scanner;

public class Tutuebung {

	// main
	public static void main(String[] args) {
		// double d = ;
		System.out.println(Betrag(-9));
		System.out.println(evenodd(3));
		System.out.println(ninties(2019));
		System.out.println(ninties(10000000));
		// Sysout strg Leerzeichen um system out println automatisch zu generieren
		System.out.println(Math.toRadians(120));
		max();
	}
/**
	public static void ersteMethode(String a, String b) {
		a = "bla";
		int i, q;
		double d;
		float f;
		long l;
		i = 9;
		d = 3.5;
		f = 0.9f; // bei float muss hinter die Zahl noch ein F geschrieben werden
		char c = 'b';
	}
*/
	public static double Betrag(double a) {
		if (a >= 0) {
			return a;
		} else {
			return -a;
		}
	}

	// Funktion gerade oder ungerade
	public static boolean evenodd(int i) {
		if (i % 2 == 0) {
			return true;
		}
		return false;
	}

	public static boolean ninties(int birthyear) {
		birthyear = birthyear % 100;
		if (birthyear > 100 || birthyear <= 89) {
			return false;
		}
		return true;
	}

	public static String digittostring(int i) {
		switch (i) {
		case 1:
			return "eins";
		case 9:
			return "neun";
		case 8:
			return "acht";
		// ...
		}
		return "Error";
	}

	public static int sumeven() {
		int i = 0;
		for (int j = 0; j < 100; j += 2) {
			i = i + j;
		}
		return i;
	}

	public static int range() {
		java.util.Scanner scan = new Scanner(System.in);
		System.out.println("Bitte Zahl eingeben:");
		int a = scan.nextInt();
		System.out.println("Bitte Zahl eingeben:");
		int b = scan.nextInt();

		int i = 0;
		while (a < b) {
			i += a;
			a++;
		}
		System.out.println(i);
		return i;
	}

	public static int max() {
		java.util.Scanner scan = new Scanner(System.in);
		int max = 0;
		while (true) {
			System.out.println("Bitte Zahl eingeben:");
			int a = scan.nextInt();
			if (a < 0) {
				System.out.println(max);
				return max;
			}
			if (a > max) {
				max = a;
			}
		}

	}
	//prüft, ob 3 e vorkommen
		public static boolean three_e(String s){
			s.toLowerCase(); //macht alle Buchstaben klein
			int counter = 0;
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == 'e') {
					counter++;
				}
			}
			if (counter == 3) {
				return true;
			} 
			return false;
		}
	
	//gebe alle Teiler einer Zahl als String aus
	public static String teiler (int n) {
		String s = "";
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				s += i + ",";
			}
		}
		return s;		
	}
	
	//macht ein Feld je nach Größe von n, n x n
	public static void field (int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++)
				System.out.print("*#");
		}
		System.out.println();
	}
	
}


















