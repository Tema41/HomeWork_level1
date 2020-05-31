package homeWork;

import java.util.Arrays;

public class Lesson2 {

	public static void main(String[] args) {
		int[] arrays = { 1, 1, 0, 0, 1, 1, 0, 0 };
		int[] arrays2 = { -1, 8, 21, -4, 0, 63 };
		invertArray(arrays);
		System.out.println();
		fillArray();
		System.out.println();
		changeArray();
		System.out.println();
		fillDiagonal();
		minMaxElement(arrays2);
	}

	// Задать целочисленный массив, состоящий из элементов 0 и 1.
	// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия
	// заменить 0 на 1, 1 на 0;
	public static int[] invertArray(int[] arrays1) {
		for (int i = 0; i < arrays1.length; i++) {
			if (arrays1[i] == 0) {
				arrays1[i] = 1;
			} else {
				arrays1[i] = 0;
			}
			System.out.print(arrays1[i] + " ");
		}
		return arrays1;
	}

	// Задать пустой целочисленный массив размером 8.
	// С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
	public static void fillArray() {
		int a = 0;
		int[] arr = new int[8];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = a;
			a += 3;
			System.out.print(arr[i] + " ");

		}
	}

	// Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
	// и числа меньшие 6 умножить на 2;
	public static void changeArray() {
		int arr[] = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 6) {
				arr[i] *= 2;
			}
			System.out.print(arr[i] + " ");
		}
	}

	// Создать квадратный двумерный целочисленный массив (количество строк и
	// столбцов одинаковое),
	// и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
	public static void fillDiagonal() {

		int[][] arr = new int[4][4];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = 0;
				}
			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

	// ** Задать одномерный массив и найти в нем минимальный и максимальный элементы
	// (без помощи интернета);
	public static void minMaxElement(int[] array) {

		int min = array[0];
		int max = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
			if (array[i] > max) {
				max = array[i];
			}

		}
		System.out.print("Минимальный элемент: " + min + "; ");
		System.out.print("Максимальный элемент: " + max);
	}

}
