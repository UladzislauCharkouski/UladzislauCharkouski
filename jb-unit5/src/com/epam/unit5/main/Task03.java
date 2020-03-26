package com.epam.unit5.main;

import java.util.Random;

public class Task03 {
	public static void main(String[] args) {
		double[] mas = new double[5];
		enterArrayWithRandom(mas);
		printArray(mas);
		System.out.println("ќтсортированна€ последовательность");
		sortArray(mas);
		printArray(mas);
		boolean x = YesOrNot(mas);
		Result(x);
	}	
		public static void enterArrayWithRandom(double[] mas) {
			Random rand = new Random();
			for (int i = 0; i < mas.length; i++) {
				mas[i] = rand.nextDouble();
			}
		}
		
		public static void printArray(double[] mas) {
			System.out.println();
			for (int i = 0; i < mas.length; i++) {
				System.out.print("mas[" + i + "]=" + mas[i] + "; ");
			}
			System.out.println();
			System.out.println();
		}
		
		public static void sortArray(double[] mas) {
			int minValueIndex = 0;
			for (int i = 0; i < mas.length; i++) {
				minValueIndex = i;
				for (int j = i + 1; j < mas.length; j++) {
					if (mas[j] < mas[minValueIndex]) {  //если помен€ть на > отсортируетс€ убывающа€
						minValueIndex = j;
					}
				}
				double temp = mas[i];
				mas[i] = mas[minValueIndex];
				mas[minValueIndex] = temp;
			}
		}
		
		public static boolean YesOrNot(double[] mas) {
			for(int i = 0; i<mas.length-1; i++) {
	            if(mas[i] > mas[i+1]) {
	                return false;
	            }
	        }
	        return true;
		}
		
		public static void Result(boolean x) {
			if(x == true) {
				System.out.println("ѕоследовательность возврастающа€");
				}
			if(x == false) {
				System.out.println("ѕоследовательность убывающа€");
				}
		}
}
