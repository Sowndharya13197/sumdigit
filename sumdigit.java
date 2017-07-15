import java.io.*;
import java.util.*;
public class sumdigits {
    public static void main(String args[])
             {
                 int n,m=0;
                 int sum=0,even=0;
                 Scanner s=new Scanner(System.in);
                 n=s.nextInt();
                 while(n!=0)
                    {
                         m=n%10;
                        n=n/10;
                       
                        if(m%2==0)
                         {
                           even=even+m;
                           
                         } }  System.out.println(even);
                    
                 
                  } 

    
}
