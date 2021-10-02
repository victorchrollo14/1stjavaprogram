import java.util.*;

public class sum4
  {   
      public static void main(String[] args)
        {    int n;
             int p = 1;
             double sum =0;
             Scanner sc = new Scanner(System.in);
             System.out.println("enter the value of n");
             n = sc.nextInt();
               for(int i = 1;i<=n;i++)
                 {   p = p*i;
                     sum = sum + p; 
                        }
            System.out.println("sum="+ sum);


        }
    



}
