package com.epam.unit5.main;

import java.util.Random;

public class Task02 {
	public static void main(String[] args) {
		int[] mas = new int[20];
		enterArrayWithRandom(mas);
		findCountForNextArray(mas);
		System.out.println();
		findIndexCreateArray(mas);	
	}
		public static void enterArrayWithRandom(int[] mas) {
			Random rand = new Random();
			for (int i = 0; i < mas.length; i++) {
				mas[i] = rand.nextInt(5);
				System.out.println("mas[" + i + "]=" + mas[i] + "; ");
			}
		}
		
		public static int findCountForNextArray(int[] mas) {
			int count = 0;
			for (int i = 0; i < mas.length; i++) {
				if (mas[i] == 0) {
					count++;
				}
			}
			return count;
		}
		
		public static int[] findIndexCreateArray(int[] mas) {
			int count = findCountForNextArray(mas);
			int[] newMass = new int[count];
			int index = 0;
			for (int i = 0; i < mas.length; i++) {
				if (mas[i] == 0) {
					newMass[index] = i;
					index++;
				}
			}
		
			for (int i = 0; i < newMass.length; i++) {
				System.out.println("newMass[" + i + "]=" + newMass[i] + "; ");
			}
			return newMass;
		}
}
