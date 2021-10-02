import java.util.*;

public class factorial 
  {   
      public static void main(String[] args)
        {   int n;
            int p=1;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number to get the factorial");
            n = sc.nextInt();
            for(int i = 1;i<=n;i++)
              {   p = p*i;

              }
              System.out.println("the factorial of "+ n+ "\tis\t"+ p);


        }
    


}
