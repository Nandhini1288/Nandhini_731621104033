import java.util.*;
public class Main5{  
public static void main(String args[])  
{    
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
int n3,i,count=15;    
 for(i=2;i<count;++i)
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  }
}  