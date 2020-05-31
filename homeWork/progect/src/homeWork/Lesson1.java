package homeWork;

public class Lesson1 {
	public static void main(String[] args) {
		
		colculate(5, 8, 3, 7);
		task10and20(8, 9);
		isPozitvOrNegativ(12);
		isNegative(-5);
		greetings("Geekbrains");
		highAltitudeYear(2000);
	}

	public static float colculate(float a, float b, float c, float d) {
		float result = a * (b + (c / d));
		System.out.println(result);
		return result;
	}

	public static boolean task10and20(int a, int b) {
		int sum = a + b;

		return 10 <= sum && sum <= 20;
	}

	public static int isPozitvOrNegativ(int x) {

		if (x <= 0) {
			System.out.println("Переданное число положительное");
		} else {
			System.out.println("Переданное число отрицательное");
		}
		return x;
	}

	public static int isNegative(int i) {
		
		if (i < 0) {

			System.out.println(i);
		} else {

			System.out.println(i);
		}
		return i;
	}

	public static void greetings(String name) {
		System.out.println("Привет " + name + "!");
	}

	public static int highAltitudeYear(int year) {

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + " год высокосный.");
		} else {
			System.out.println(year + " год не высокосный.");
		}
		return year;
	}
}
