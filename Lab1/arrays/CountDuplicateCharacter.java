package arrays;

import java.util.Scanner;

public class CountDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc= new Scanner(System.in);
				int n=sc.nextInt();
				char[]a=  new char [n];
				for(int i=0;i<n;i++)
				{
					a[i]=sc.next().charAt(0);
				}
				for(int i=0; i<n; i++)
				{
					for(int j=i+1; j<n; j++)
					{
						if(a[j]==a[i])
						{
							System.out.println("The duplicate character in the array is: "+ a[j]);
						}
					}
				}
				sc.close();
	}

}
