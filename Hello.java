import java.io.*;
import java.util.*;
class Hello
{
 public static void main(String args[])
 {
  int a,b,c;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the fisrt number");
  a=sc.nextInt();
  System.out.println("enter the second number");
  b=sc.nextInt();
  c=a+b;
  System.out.println(c);
  if(a>b)
 { 
  System.out.println("a is big");
  System.out.println(a);
 }
  else
 {
  System.out.println("b is big");
  System.out.println(b);
 }
 }
}