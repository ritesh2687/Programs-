import java.util.Scanner;
public class multiplication_table {
   public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    
          int t=in.nextInt();
          int num=t;
    while( num<=(t*10))
    {
         
          System.out.println(num);
          num= num + t;
    }
   }
    
}
