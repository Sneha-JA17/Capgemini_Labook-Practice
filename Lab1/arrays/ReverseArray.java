package arrays;

import java.util.Scanner;

public class ReverseArray {
	 static void revereseArray(int arr[],
             int start, int end)
{
 int temp;
   
 while (start < end)
 {
     temp = arr[start];
     arr[start] = arr[end];
     arr[end] = temp;
     start++;
     end--;
 }
}    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter array length");
int n= sc.nextInt();
int []arr= new int[n];
for(int i=0; i<n; i++)
{
	arr[i]=sc.nextInt();
}
revereseArray(arr,0, n-1);
System.out.println("The reverse array is:\n");
for(int i=0; i<n; i++)
{
	System.out.println(arr[i]);
}
sc.close();
	}

}
