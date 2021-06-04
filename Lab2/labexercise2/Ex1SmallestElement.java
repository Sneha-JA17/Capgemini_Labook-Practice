package labexercise2;

import java.util.Scanner;

public class Ex1SmallestElement {
	public static int getSecondSmallest(int a[], int n)
	{
		int temp, result=0;
		for(int i=0;i<n; i++)
		{
			for(int j=0; j<n-i-1; j++)
			{
				if(a[j]> a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	
		
			result=a[1];
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter the limit of array");
		
		int n= sc.nextInt();
		int a[]= new int [n];
		for(int i=0; i<n; i++)
		{
			a[i]=sc.nextInt();
		}
		int second_smallest= getSecondSmallest(a, n);
        System.out.println("The second_smallest element is:" + second_smallest);
        sc.close();
	}
	

}
