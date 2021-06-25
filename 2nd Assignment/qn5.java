import java.util.*;

public class qn5{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	System.out.println("Press 1 for boolean to decimal conversion. \nPress 2 for decimal to boolean conversion.\nEnter your choice: ");
	int ch = ob.nextInt();
	switch(ch){
	case 1: System.out.print("Enter binary number: ");
		int bin = ob.nextInt();
		System.out.println("Decimal number of "+bin+" is :"+ bin2dec(bin)); 
	break;
	case 2: System.out.print("Enter decimal number: ");
		int dec = ob.nextInt();
		System.out.println("Decimal number of "+dec+" is :");
		dec2bin(dec); 
	break;
	}
	
	}
	public static int bin2dec(int n){
	int dec=0;
	for(int i=0;n>0;n=n/10)
	{
		dec+=(n%10)*Math.pow(2,i);
		i++;
	}
	return dec;
	}
	public static void dec2bin(int n){
	int binary[]=new int[50];
	int count=0;
	for(;n>0;n=n/2)
	{
		binary[count++]=(n%2);
	}
	for(int i=count-1;i>=0;i--)
		System.out.print(binary[i]);
	}
}
