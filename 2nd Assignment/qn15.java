import java.util.*;
public class qn15{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	System.out.print("Enter row size: ");
	int r= ob.nextInt();
	System.out.print("Enter col size: ");
	int c= ob.nextInt();
	int a[][] = new int[r][c];
	int b[][] = new int[r][c];
	System.out.println("Enter elements of matrix1: ");
	for(int i = 0; i < r; i++)
		for(int j = 0 ; j < c; j++)
			a[i][j] = ob.nextInt();
	System.out.println("Enter elements of matrix2: ");
	for(int i = 0; i < r; i++)
		for(int j = 0 ; j < c; j++)
			b[i][j] = ob.nextInt();
	int add[][] =new int[r][c];
	for(int i = 0; i < r; i++)
		for(int j = 0 ; j < c; j++)
			add[i][j] = a[i][j]+b[i][j];
	for(int i =0; i < r; i++)
		for(int j = 0 ; j < c; j++)
			System.out.println("The sum of "+a[i][j]+" and "+b[i][j]+" is: "+add[i][j]);
}
}