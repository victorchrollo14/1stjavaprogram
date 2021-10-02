import java.util.*;

public class sum1
 {   
     public static void main(String[] args)
      {  //to print series 1.0/1+1.0/2...1.0/n
          int n;
          double sum=0;
          Scanner sc = new Scanner(System.in);
          System.out.println("enter the nth digit");
          n = sc.nextInt();
           for(int i = 1;i<=n;i++)
             {  double j = 1.0/i;
                sum= sum+j;
                
             }
             System.out.println("sum ="+sum);


      }


 }