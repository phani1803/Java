import java.lang.System;
import java.util.Scanner;

class Test {
public static void main(String args[])
 { 
int i,fact=0,n;
 try (Scanner sc = new Scanner(System.in)) {
    n=sc.nextInt();
}
 for(i=1;i<=n;i++)
 { 
if(n%i==0) 
{ 
fact++;
}}
 if(fact==2)
 System.out.println(n+" is prime"); 
else
 {
 System.out.println(n+" is not prime"); 

 }
 }
