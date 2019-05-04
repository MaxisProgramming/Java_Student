package main;

import java.util.Scanner;

public class Series {
	// Exercise Task
	// 2.1 a)
	public static int sum_up() {
		int result = 0;
		for (int i = 0; i <= 1000; i++) {
			result += i;
		}
		return result;
	}

	// Exercise Task
	// 2.1 b)
	public static void multiplication_table(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "*" + n + "=" + i * n);
		}
	}

	// Exercise Task
	// 2.1 c)
	public static void fizz_buzz() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}

	// Exercise Task
	// 2.1 d)
	public static void chess_board(int n) {
		if (n > 0) { 
			for (int i = 1; i <= n; i++) {
				if (i % 2 == 0) { //ist i gerade?
				for (int j = 0; j <= n; j++) {
					System.out.print("-#");
				}
				} else { //oder ungerade?
					for (int k = 0; k <= n; k++) {
						System.out.print("#-");
					}
				}
				System.out.println();//Zeilenumbruch
			}		
		} else { System.out.println("n muss gr��er null sein");}
	}

	// Exercise Task
	// 2.1 e)
	public static int factorial(int n) {
		int result = 1263545845;

		// TODO: fill me

		return result;
	}

	// Exercise Task
	// 2.1 f)
	public static double ln2(int n) {
		double result = 0;

		// TODO: fill me

		return result;
	}

	// Exercise Task
	// 2.1 g)
	public static void reverse_digits(int n) {
		// TODO: fill me
	}

	// Exercise Task
	// 2.1 h)
	public static double leibniz_series(int n) {
		double res = 0;

		// TODO: fill me

		return res;
	}

	// Exercise Task
	// 2.1 i)
	public static boolean palindrome(String str) {
		// TODO: fill me

		// either
		return true;
		// or
		// return false;

	}

	// Exercise Task
	// 2.1 j)
	public static long max_collatz(long m) {
		long max_startwert = 1;

		// TODO: fill me

		return max_startwert;
	}

	// Exercise Task
	// 2.1 k)
	public static double gradient_descent(double x0, double a, double b) {

		double x_cur = x0;
		double x_old = x0 + 1;

		// TODO: fill me

		return x_cur;

	}

	// Exercise Task
	// 2.1 l)
	public static void pattern_a(int num_rows) {
		// TODO: fill me

	}

	// Exercise Task
	// 2.1 m)
	public static void pattern_b(int num_rows) {
		// TODO: fill me

	}

	// Exercise Task
	// 2.1 n)
	public static int seven_sum(int num) {
		int sum = 0;
		// TODO: fill me

		return sum;
	}

	// Exercise Task
	// 2.1 o)
	public static void ones_and_zeros(int rows) {
		// TODO: fill me
	}

	// Exercise Task
	// 2.2 p)
	public static boolean is_perfect(int number) {
		int sum = 0;
		// TODO: fill me

		return sum == number;
	}

	public static void main(String[] args) {

		System.out.println("2.1 a) ");
		System.out.println(sum_up());

		System.out.println("2.1 b) ");
		multiplication_table(4);

		System.out.println("2.1 c) ");
		fizz_buzz();

		System.out.println("2.1 d) ");
		chess_board(4);

		System.out.println("2.1 e) ");
		System.out.println(factorial(4));

		System.out.println("2.1 f) ");
		System.out.println(ln2(100000));

		System.out.println("2.1 g) ");
		reverse_digits(1239);

		System.out.println("2.1 h) ");
		System.out.println(leibniz_series(1000));

		System.out.println("2.1 i) ");
		System.out.println(palindrome("1"));
		System.out.println(palindrome("12321"));
		System.out.println(palindrome("12323"));

		System.out.println("2.1 j) ");
		System.out.println(max_collatz(100));

		System.out.println("2.1 k) ");
		System.out.println(gradient_descent(1, 10, 2));

		System.out.println("2.1 l) ");
		pattern_a(5);

		System.out.println("2.1 m) ");
		pattern_b(5);

		System.out.println("2.1 n) ");
		System.out.println(seven_sum(1)); // 7 = 7
		System.out.println(seven_sum(2)); // 7 + 77 = 84
		System.out.println(seven_sum(3)); // 7 + 77 + 777 = 861

		System.out.println("2.1 o) ");
		ones_and_zeros(4);

		System.out.println("2.1 p) ");
		System.out.println(is_perfect(6));
		System.out.println(is_perfect(14));
	}
}
