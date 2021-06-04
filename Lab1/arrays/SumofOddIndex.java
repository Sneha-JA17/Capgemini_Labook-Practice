package arrays;

import java.util.Scanner;

public class SumofOddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=  new int [n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			if(i%2!=0) {
			sum=sum+ a[i];
		}
		}
		System.out.println("The sum of the even index is:"+ sum);
		
		sc.close();
	}

}
