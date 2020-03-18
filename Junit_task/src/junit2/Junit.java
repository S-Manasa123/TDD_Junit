package junit2;
import java.io.*;
import java.util.*;

public class Junit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		String s=o.next();
		int l=s.length();
String s1="";
String s2="";
if(s.charAt(0)=='A' && s.charAt(1)!='A')
{
for(int i=1;i<l;i++)
{
s1=s1+s.charAt(i);
}
System.out.println(s1);
}
if(s.charAt(0)=='A' && s.charAt(1)=='A')
{
for(int i=2;i<l;i++)
{
s2=s2+s.charAt(i);
}
System.out.println(s2);
}
if(s.charAt(1)=='A' && s.charAt(0)!='A')
{
String s3=""+s.charAt(0);
String s4="";
for(int i=2;i<l;i++)
{
s4=s4+s.charAt(i);
}
System.out.println(s3+s4);
}
if(s.charAt(0)!='A' && s.charAt(1)!='A')
System.out.println(s);

	}

}
