package Self;

import java.util.Scanner;

public class misc {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scn.nextInt();
		int[] arr = input(n);
		int m = scn.nextInt();
		System.out.println(search(arr, m));

	}

	private static int search(int[] arr, int key) {

		int lo = 0, hi = arr.length - 1;

		while (lo <= hi) {

			int mid = lo + (hi - lo) / 2;

			if (arr[mid] == key)
				return mid;

			if (arr[mid] < key) {
				lo = mid + 1;
			}

			else {
				hi = mid - 1;
			}

		}

		return -1;

	}

	static int[] input(int n) {
		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();

		return arr;
	}

}
