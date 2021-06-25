import java.util.*;
public class qn10
{
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number of elements of the array: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i<n; i++){
		    arr[i] = sc.nextInt();
		}
		int temp = arr[0];
		for(int i = 1; i<n; i++){
		    int t;
		    t = arr[i];
		    arr[i] = arr[i-1];
		    arr[i-1] = t;
		  //  swap(arr[i], arr[i-1]);
		}
		arr[n-1] = temp;
		System.out.println("The elements of the array after rotation are: ");
		for(int i = 0; i<n; i++){
		    System.out.print(arr[i] + " ");
		}
	}
}