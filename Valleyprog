package Pack1;
import java.util.*;
public class File2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter size:");
	int n = sc.nextInt();  // 6
	int[] elements = new int[n];
	System.out.println("Enter "+n+" Elements:");
	for(int i=0; i<n; i++) 
	{
		elements[i]= sc.nextInt();// 5 4 3 4 5 6
	}
	
	if (n==0)
	{
		System.out.println("false");
		return;
	}
	
	int i = 1;
	while(i < n) // 3 < 6 -> t
	{
		if( (elements[i-1]) >   elements[i])// 3>4->f
		{
			i = i+1; // i = 3
		}
		else
		{
			break;
		}
	}
	if( (i==n)|| (i==1))// 3 == 6
	{
		System.out.println("false");
		return;
	}
	while(i<n) // 6<6 -> t
	{
		if( elements[i-1]  < elements[i])// 5<6-> t
			{
			  i = i+1; //6 
			}
		else
		{
			break;
		}		
	}
	if(i<n)  // 6 < 6
	{
		System.out.println("false");
		return;
	}
	System.out.println("true");
	}}
