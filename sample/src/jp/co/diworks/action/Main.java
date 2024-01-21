package jp.co.diworks.action;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println(tashizan(100, 100));
		System.out.println(hikizan(100, 100));
		System.out.println(kakezan(100, 100));
		System.out.println(warizan(100, 100));
	}
	public static int tashizan (int num1, int num2) {
		return num1 + num2;
	}
	public static int hikizan (int num1, int num2) {
		return num1 - num2;
	}
	public static int kakezan (int num1, int num2) {
		return num1 * num2;
	}
	public static int warizan (int num1, int num2) {
		return num1 / num2;
	}
}
