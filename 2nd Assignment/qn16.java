import java.util.*;
public class qn16
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the number of rows and columns in the matrix: ");
		n = sc.nextInt();
		int arr[][] = new int[n][n];
		int brr[][] = new int[n][n];
		int crr[][] = new int[n][n];
		System.out.println("Enter the elements in the array row wise of the first matrix: ");
		for(int i = 0; i<n; i++){
		    for(int j = 0; j<n; j++){
		        arr[i][j] = sc.nextInt();   
		    }
		}
		System.out.println("Enter the elements in the array row wise of the second matrix: ");
		for(int i = 0; i<n; i++){
		    for(int j = 0; j<n; j++){
		        brr[i][j] = sc.nextInt();   
		    }
		}
		for(int i = 0; i<n; i++){
		    for(int j = 0; j<n; j++){
		        crr[i][j] = 0;
    		    for(int k = 0; k<n; k++){
    		        crr[i][j] += arr[i][k] * brr[k][j];
    		    }
		    }
		}
		System.out.println("The result after multiplication of the two matrices are as follows: ");
		for(int i = 0; i<n; i++){
		    for(int j = 0; j<n; j++){
		        System.out.print(crr[i][j] + " ");
		    }
		    System.out.println("");
		}
		
	}
}