package com.epam.unit5.main;

import java.util.Random;

public class Task04 {
	public static void main(String[] args) {
		int[] mas = new int[5];
		enterArrayWithRandom(mas);
		findCountForNextArray(mas);
		System.out.println();
		//System.out.println("Массив с чётными числами");
		findDigitsCreateArray(mas);	
	}
		public static void enterArrayWithRandom(int[] mas) {
			Random rand = new Random();
			for (int i = 0; i < mas.length; i++) {
				mas[i] = rand.nextInt(10);
				System.out.println("mas[" + i + "]=" + mas[i] + "; ");
			}
		}
		
		public static int findCountForNextArray(int[] mas) {
			int count = 0;
			for (int i = 0; i < mas.length; i++) {
				if (mas[i] % 2 == 0) {
					count++;
				}
			}
			return count;
		}
		
		public static int[] findDigitsCreateArray(int[] mas) {
			int count = findCountForNextArray(mas);
			int[] newMass = new int[count];
			int digit = 0;
			for (int i = 0; i < mas.length; i++) {
				if (mas[i] % 2 == 0) {
					newMass[digit] = mas[i];
					digit++;
				}
			}
			
			if (newMass.length == 0) {
				System.out.println("В массиве нету чётных чисел");
			} else {
				System.out.println("Массив с чётными числами");
			}
			for (int i = 0; i < newMass.length; i++) {
				System.out.println("newMass[" + i + "]=" + newMass[i] + "; ");
			}
			return newMass;
		}
}
