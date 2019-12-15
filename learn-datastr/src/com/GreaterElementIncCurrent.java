package com;

/*Given an array, replace every element with greater of its right side. including current element
 * time complexity is O(n)
 * space complexity remains constant which is O(1)
 */
public class GreaterElementIncCurrent {

	public static void greaterElementIncCurrent(int arr[]) {
		int max_right = arr[arr.length - 1];

		for (int i = arr.length - 1; i >= 0; i--) {
			int temp = arr[i];
			arr[i] = max_right;
			if (temp > max_right) {
				max_right = temp;
			}

		}
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	public static void main(String[] args) {
		int arr[] = { 6, 5, 1, 7, 3, 9, 2 };
		greaterElementIncCurrent(arr);
	}
}
