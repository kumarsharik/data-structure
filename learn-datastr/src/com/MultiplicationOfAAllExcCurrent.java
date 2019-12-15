package com;

public class MultiplicationOfAAllExcCurrent {
	public static void multiplicationOfAAllExcCurrent(int arr[]) {
		int max_right = arr[0];
		
		int ls[]= new int[arr.length];
		ls[0] = 1;
		for (int i =  1; i <arr.length; i++) {
			int temp = arr[i];
			ls[i] = max_right;
			ls[i-1]=max_right;
				max_right = temp*max_right;
				
			}
	
		for (int i : ls) {
			System.out.print(i+" ");
		}
		int max_left = arr[arr.length-1];
		int rs[]= new int[arr.length];
		rs[ls.length-1] = 1;
		for (int i =  arr.length-2; i <=0; i++) {
			int temp = arr[i];
			rs[i] = max_left;
			rs[i-1]=max_left;
			max_left = temp*max_left;
				
			}
	
		for (int i : rs) {
			System.out.print(i+" ");
		}
		
	}
	

	public static void main(String[] args) {
		int arr[] = { 6, 5, 1, 7, 3, 9, 2 };
		multiplicationOfAAllExcCurrent(arr);
	}
}
