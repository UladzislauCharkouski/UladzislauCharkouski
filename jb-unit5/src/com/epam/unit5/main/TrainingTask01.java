package com.epam.unit5.main;

import java.util.Random;
import java.util.Scanner;

public class TrainingTask01 {
	public static void main(String[] args) {
		int[] mas = new int[10];
		enterArrayFromConsole(mas);
		printArray(mas);
		findMaxNumber(mas);
		findMinNumberAndIndex(mas);
	}
		public static void enterArrayFromConsole(int[] mas) {
		Scanner sc = new Scanner(System.in);
			for (int i = 0; i < mas.length; i++) {
				System.out.print("ar[" + i + "]=>");
				mas[i] = sc.nextInt();
			}
		}
		public static void printArray(int[] mas) {
			System.out.println();
			for (int i = 0; i < mas.length; i++) {
				System.out.print("mas[" + i + "]=" + mas[i] + "; ");
			}
			System.out.println();
			System.out.println();
		}
		public static void findMaxNumber(int[] mas) {
			if (mas.length == 0) {
				return;
			}
			int max = mas[0];
			for (int i = 1; i < mas.length; i++) {
				if (max < mas[i]) {
					max = mas[i];
				}
			}
			System.out.println("Максимальное число " + max);
			System.out.println();
		}
		public static void findMinNumberAndIndex(int[] mas) {
			if (mas.length == 0) {
				return;
			}
			int min = mas[0];
			int index = 0;
			for (int i = 1; i < mas.length; i++) {
				if (mas[i] < min) {
					min = mas[i];
					index = i;
				}
			}
			System.out.println("Минимальное число " + min + " а его индекс равен " + index + ".");
		}
	}