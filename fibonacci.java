import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        // there are three method for fibonacci series
        
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first number of the  series");
        int a = in.nextInt();
        System.out.println("enter the second number of the  series");   
        int b = in.nextInt();
        System.out.println("enter the nth number of the  series");
        int n = in.nextInt();
        //****with help-of for loop****
        // for(int k=1; k<=n;k++)
        // {
                 
        //       System.out.println(+k+"number of the series"+a);               
        //       a=b;
        //       b=a+b;
        // }

        // ****with the help of while_loop****
        int k=1;
        while (k<=n)
        {
            int tm=b;  //the value of b store tm
            System.out.println(+k+"number of the series"+a);
            b=a+b;   // b value will be a+b
            a=tm;    // a take value from tm which store tm in upper line
            k+=1;
        }
       
        
           
            
        
        

    }
}