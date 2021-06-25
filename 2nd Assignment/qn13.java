import java.util.*;
public class qn13{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	System.out.print("Enter array size: ");
	int n= ob.nextInt();
	int a[] = new int[n];
	System.out.println("Enter elements of array: ");
	for(int i = 0; i < n; i++)
		a[i] = ob.nextInt();
	System.out.print("The largest number is: "+check_array(a,n));
}
	public static int check_array(int a[],int n){
	int first=a[0];
	int last=a[n-1];
	int middle=a[n/2];
	int max=(first>last?(first>middle?first:middle):(last>middle?last:middle));
	return max;
}
}