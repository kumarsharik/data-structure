package com;

/*Given an array , find the maxmium and minimum*/
//time complexity is O(n)
//space complexity is O(1)
public class MaxAndMin {
	public static void maxMin(int arr[]) {
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

	public static void main(String[] args) {
		int arr[] = { 0, 3, 4, 5, 6, 7, 1, -3, -6 };
		maxMin(arr);
		System.out.println("done");
	}
}
