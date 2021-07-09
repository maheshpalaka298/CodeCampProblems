package packcodecamp;
import java.util.*;
public class MBA_Challenge {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Input1:");
			int n = sc.nextInt(); // 3
			System.out.println("Input2:");
			int k = sc.nextInt(); 
			int s = (int)Math.pow(n, k);
			int rem = s%10; 
	        System.out.println(rem);
	}
}
