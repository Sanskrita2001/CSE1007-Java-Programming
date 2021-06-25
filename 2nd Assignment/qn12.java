import java.util.*;
public class qn12
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the length of the array: ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i<n; i++){
		    arr[i] = sc.nextInt();
		}
		int temp = arr[0];
		arr[0] = arr[n-1];
		arr[n-1] = temp;
		System.out.println("The elements in the array are as follows: ");
		for(int i = 0; i<n; i++){
		    System.out.print(arr[i]+" ");
		}
	}
}