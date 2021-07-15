package packcodecamp;
import java.util.*;
public class ReplaceHighest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size:");
		int n = sc.nextInt();
		int elements[] = new int[n];
		System.out.println("Enter Elements:");
		for(int i =0; i<n; i++)
		{  elements[i] = sc.nextInt(); 	}
		
		for(int i =0; i < (n-1); i++)
		{ // i = 0 -> first element
			int max =0;
			for(int j=i+1; j < n;  j++)
			{ // j = 0+1 = 1 -> second element
				if(elements[j]>max)
					 { max = elements[j]; }
			}// inner loop
			elements[i] = max; //
		}// outer loop
		elements[n-1] = -1;
		for(int i=0 ; i<n; i++)
		{
			System.out.print(elements[i]+" ");
		}
	} }
