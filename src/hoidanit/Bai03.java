package hoidanit;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		System.out.println("run bai 03");
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap canh lap phuong");
		double canh = scanner.nextDouble();
		System.out.println("the tich cua hinh lap phuong : " + Math.pow(canh, 3));
		scanner.close();
	}
}
