package Pack1.Pack2;
public class Length
{
public static int strLength(String a)
{
int i,l=0;
char[] arr=a.toCharArray();
for (char ch:arr)
{
l++;
}
return l;
}
}
