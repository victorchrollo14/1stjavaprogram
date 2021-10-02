import java.util.*;

public class sum3 
 {
     public static void main(String[] args)
       {     
           //to print the sum of series  a-a/2+a/3-a/4+a/5...-a/20
           int a;
           double sum=0;
           Scanner sc = new Scanner(System.in);
           System.out.println("enter the value of a");
           a = sc.nextInt();
          for ( int i= 1;i<=20;i++)
               {   if(i%2==0)
                    { sum=sum-a/i;
                        }
                   else
                    {  sum = sum+a/i;
                        i++;
                        }
               }
            System.out.println("the sum ="+sum);


       }
}
