import java.util.Scanner;

public class qn19 {

	public static void main(String[] args) {
        int arr[][] = new int[4][]; 
        Scanner ob = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter number of students for batch " + (i+1) + ": ");
            int n = ob.nextInt();
            arr[i] = new int[(int)Math.ceil(n/4)];
            for(int j = 0; j < arr[i].length; j++)
            {
                if(n >= 4)
                    arr[i][j] = 4;
                else
                    arr[i][j] = n;
                n = n - 4;
            }
        }
        int count = 0;
        System.out.println("Contents of 2D Jagged Array"); 
        for (int i = 0; i < arr.length; i++) { 
            for (int j = 0; j < arr[i].length; j++) {
            		System.out.print(arr[i][j] + " ");
            		if(arr[i][j] == 4)
            			count++;
            }
            System.out.println(); 
        }
        System.out.println("Number of tutors with 4 students are: " + count );
    }
}