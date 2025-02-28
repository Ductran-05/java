package hoidanit;

import java.util.Scanner;

public class Helloworld {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("name student: ");
		String name = scanner.nextLine();
		System.out.println("point: ");
		int point = scanner.nextInt();
		System.out.println("sinh vien: " + name + "co diem la: " + point);
		scanner.close();
	}
}
