import java.util.*;
public class qn18{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	System.out.print("Enter n: ");
	int n= ob.nextInt();
	for(int i = 1; i <= n; i++)
	{
		for(int j = 1; j<= i; j++ )
			System.out.print(j);
		System.out.println();
	}
	for(int i = 1; i <= n; i++)
	{
		for(int j = 1; j<= (n-i+1); j++ )
			System.out.print(j);
		System.out.println();
	}
}
}