package labexercise2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3ReverseandSort {

	public static int[] getSorted(int[] arr) {
		int len = arr.length;
		for(int i=0; i<len; i++) {
			StringBuffer s = new StringBuffer(String.valueOf(arr[i]));
			s.reverse();
			arr[i] = Integer.parseInt(String.valueOf(s));
		}
		Arrays.sort(arr);
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		for (int i=0; i<num; i++)
			arr[i] = sc.nextInt();
		int[] b = getSorted(arr);
		for(int element : b)
			System.out.println(element);
		sc.close();
	}

}
