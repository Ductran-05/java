package hoidanit;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		System.out.println("run bai 02");
		Scanner scanner = new Scanner(System.in);
		System.out.println("chieu thu 1:");
		double a = scanner.nextDouble();
		System.out.println("chieu thu 2:");
		double b = scanner.nextDouble();
		System.out
				.println("chu vi: " + (2 * a + 2 * b) + "\ndien tich: " + a * b + "\ncanh nho nhat: " + Math.min(a, b));
		scanner.close();
	}
}
