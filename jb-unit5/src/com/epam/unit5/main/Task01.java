package com.epam.unit5.main;

import java.util.Random;

public class Task01 {
	public static void main(String[] args) {
		int[] A = new int[10];
		enterArrayWithRandom(A);
		int sum = CalculateSum(A);
		System.out.println("Сумма чисел кратных К = " + sum);
	}
		public static void enterArrayWithRandom(int[] A) {
			Random rand = new Random();
			for (int i = 0; i < A.length; i++) {
				A[i] = 1 + rand.nextInt(6);
				System.out.println("A[" + i + "]=" + A[i] + "; ");
			}
		}
		public static int CalculateSum(int[] A) {
			int K = 2;
			int sum = 0;
			for (int i = 0; i < A.length; i++) {
				if (A[i] % K == 0) {
					sum +=A[i];
				}
			}
			return sum;
		}
}
