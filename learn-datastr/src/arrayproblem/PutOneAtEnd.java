package arrayproblem;

public class PutOneAtEnd {

	public static void sortOneAtEnd(int arr[], int n) {

		int count = 0;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] != 1) {
				arr[count++] = arr[i];

			}
		while (count < n) {
			arr[count++] = 1;
		}
	}

	public static void main(String[] args) {

		int arr[] = { 4, 1, 1, 1, 4, 1, 3, 1, 7, 5, 1 };
		int n = arr.length;
		sortOneAtEnd(arr, n);

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
