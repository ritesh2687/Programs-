 import java.util.Scanner;
 public class leap_year {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter year");//here we donot define datatype
          if((in.nextInt() %4) ==0)
          {
            System.out.println("leap year");
          }
          else
          System.out.println("it's not a leap year");
    }
    
}
