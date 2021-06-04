package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class VoterList {
	

	public static List<Integer> votersList(Map<Integer,Integer> vlist){
		List<Integer> list=new ArrayList<Integer>();
		for(Map.Entry<Integer, Integer> m : vlist.entrySet()) {
			if(m.getValue()>=18) {
				list.add(m.getKey());
			}
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
Map<Integer,Integer> vlist=new HashMap<Integer,Integer>();
System.out.println("Enter the no of the voters");
int limit=sc.nextInt();
if(limit<=0)
{
	System.out.println("Size should be more than 1");
}
else
{
	
	for(int i=0;i<limit;i++) {
System.out.println("Enter the age of the voter");
int age= sc.nextInt();
System.out.println("Enter the id of the voter");
int id= sc.nextInt();
vlist.put(id, age);
	}
}
List<Integer> list = votersList(vlist);
System.out.println("The id of the people who are eligible for voting are given below : ");
int k=0;
for(int i : list) {
	System.out.println(list.get(k++));
}

	}

}
