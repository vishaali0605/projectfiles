package String;

import java.util.regex.*;
import java.util.Scanner;

public class User_Pwd {

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

System.out.println("Enter the Username");
String a=sc.next();
System.out.println("Enter the Password");
String b=sc.next();

usernamepwd(a,b);
}
public static void usernamepwd(String a,String b)
{
boolean c=alphanumberic(a);
boolean d=alphanumberic(b);
boolean e=checkstring(a);
boolean f=checkstring(b);
boolean g=size(a);
boolean h=size(b);
boolean i=stringreverse(a,b);

if(c && d && e && f && g && h && i)
{
System.out.println("Username And Password Are Valid");
}
else
{
System.out.println("Invalid Username And Password,So Set Another Username And Passwd");
User_Pwd();
}
}

public static void User_Pwd()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Username");
String a=sc.next();
System.out.println("Enter the Password");
String b=sc.next();

usernamepwd(a,b);
}
public static boolean alphanumberic(String str)
{
Pattern pattern=Pattern.compile("[^a-zA-Z0-9]+");
Matcher matcher=pattern.matcher(str);
boolean a=matcher.find();
boolean b=true;
if(a==b)
{
return true;
}
else
{
return false;
}
}
public static boolean checkstring(String str)
{
boolean small=false;
boolean caps=false;
boolean digit=false;
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
if(Character.isLowerCase(ch))
{
small=true;
}
else if(Character.isUpperCase(ch))
{
caps=true;
}
else if(Character.isDigit(ch))
{
digit=true;
}
if(small && caps && digit)
return true;
}
return false;
}

public static boolean size(String str)
{
if(str.length()>8 & str.length()<33)
{
return true;
}
else
{
return false;
}
}

public static boolean stringreverse(String str1,String str2)
{
StringBuilder sb1=new StringBuilder(str1);
StringBuilder sb2=new StringBuilder(str2);

sb1.reverse();
String a=sb1.toString();
String b=sb2.toString();
if(a.equals(b))
{
return true;
}
else
{
return false;
}
}
}
