import java.util.*;
public class TravelAgency {
static double validate(int age, char gender, int age2 , char gender2)
{
double discount=0;
if(age>=65 && gender=='M')
discount=0.15;
else if(age>=60 && gender=='F')
discount=0.2;
else if((gender=='F' && age>=18) && (gender2=='M' && age2>=21))
discount=0.1;
else
throw new ArithmeticException("Not Valid");
return discount;
}
public static void main(String Args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Press 1 for single \nPress 2 for couple ");
int ch=sc.nextInt();
int age; char gender;
switch(ch)
{
case 1: System.out.println("Enter your age and gender");
age=sc.nextInt();
gender=sc.next().charAt(0);
System.out.println("Discount
is:"+validate(age,gender,0,'M'));
break;
case 2: System.out.println("Enter age of female");
int ageF=sc.nextInt();
System.out.println("Enter age of male");
int ageM=sc.nextInt();
System.out.println("Discount is:"+validate(ageF,'F',ageM,'M'));
break;
}
sc.close();
}
}
