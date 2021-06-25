import java.util.*;
public class qn11{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	int a[] = new int[3];
	System.out.println("Enter elements of array: ");
	for(int i = 0; i < 3; i++)
		a[i] = ob.nextInt();
	System.out.print("The largest number is: "+check_array(a));
}
	public static int check_array(int a[]){
	int max=(a[0]>a[2])?a[0]:a[2];
	return max;
}
}