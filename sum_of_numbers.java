import java.util.Scanner;
public class sum_of_numbers {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int sum=0;
        int input=in.nextInt();
        String input2=in.next();
    
        do
        {
            sum=sum+input;
        System.out.println("sum of total"+sum);
        }
        while(input2!="x");
        {
            System.out.println("sum of total");
        }
        
            
        
    }
}
