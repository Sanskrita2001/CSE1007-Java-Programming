import java.util.*;
public class qn17{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	System.out.print("Enter row size: ");
	int r= ob.nextInt();
	System.out.print("Enter col size: ");
	int c= ob.nextInt();
	int a[][] = new int[r][c];
	System.out.println("Enter elements of matrix: ");
	for(int i = 0; i < r; i++)
		for(int j = 0 ; j < c; j++)
			a[i][j] = ob.nextInt();
	System.out.println("Diagonal Elements are: ");
	for(int i = 0; i < r; i++)
	{
		for(int j = 0 ; j < c; j++)
		{
			if(i==j)
			   System.out.println(a[i][j]);
		}
	}
}
}