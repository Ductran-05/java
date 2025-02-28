package hoidanit;

import java.util.Scanner;

public class Bai04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap thien thue");
		int tien = scanner.nextInt();
		if (tien < 10) {
			System.out.println("khong can dong thue");
		} else if (tien < 15) {
			System.out.println("10%");
		} else if (tien < 30) {
			System.out.println("20%");
		} else {
			System.out.println("50%");
		}
		scanner.close();

	}
}
