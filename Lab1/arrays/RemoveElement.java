package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
	public static int[] removedArray(int a[], int n, int index)
	{
		if(a==null||index<0|| index>n )
		{
			return a;
		}
		int[] newarray= new int[n-1];
		for(int i=0,k=0;i<n; i++)
		{
			if(i==index)
			{
				continue;
			}
			newarray[k++]=a[i];
		}
		return newarray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr;
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=  new int [n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the index you want to delete");
		int index=sc.nextInt();
		arr= removedArray(a,n, index);
		System.out.println("The new array is:"+ Arrays.toString(arr));
		sc.close();

	}

}
