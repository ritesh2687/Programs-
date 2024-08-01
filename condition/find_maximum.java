import java.util.Scanner;

public class find_maximum {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        // find maximum number

        if (a!=b || b!=c || a!=c)
        {
        if (a>b ) 
        {
            if(a>c){
            System.out.println(+ a +"first entered number is maximum number");
                   }
            else{
                System.out.println(+c+"third entered number is maximum number");
            }
        
        }
        else if(b>c)
        {
            System.out.println(+b+"second entered number is maximum number");
        }
        else
        {
            System.out.println(+c+"third entered number is maximum number");
        }
    }
    else{
        System.out.println("here two or all numbers are equal");
    }
    }
}
