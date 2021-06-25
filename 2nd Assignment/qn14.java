import java.util.*;
public class qn14
{
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the size of the arrays: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter the elements of the first array: ");
		int arr1[] = new int[n];
		for(int i = 0; i<n; i++){
		    arr1[i] = sc.nextInt();
		}
		int arr2[] = new int[n];
		System.out.println("Enter the elements of the second array: ");
		for(int i = 0; i<n; i++){
		    arr2[i] = sc.nextInt();
		}
		int res[] = new int[n];
		System.out.println("The new array after the corresponding elements are multiplied are as follows: ");
		for(int i = 0; i<n; i++){
		    res[i] = arr1[i]*arr2[i];
		    System.out.print(res[i]+ " ");
		}
	}
}