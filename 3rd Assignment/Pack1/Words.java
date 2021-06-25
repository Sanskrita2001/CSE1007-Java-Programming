package Pack1;
public class Words
{
public static int countNumWords(String t)
{
int i,c=0;
for (i=0;i<t.length();i++)
{
char ch=t.charAt(i);
if (Character.isWhitespace(ch))
c++;
}
return (c+1);
}
}
