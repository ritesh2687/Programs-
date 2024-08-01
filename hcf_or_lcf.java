import java.util.Scanner;

public class hcf_or_lcf {
    public static void main(String[] args) {
        int i=1, t=1, t1, t2;
        Scanner in = new Scanner(System.in);

        System.out.println("please type numberm \n 1=\tfor HCF \n 2=\tfor LCM");
        int ask = in.nextInt();

        System.out.println("enter first number");
        int n1 = in.nextInt();
        System.out.println("enter second number");
        int n2 = in.nextInt();
        if (ask == 1) {
            while (n1 > 0 && n2 > 0) {
                if (n1 > n2) {
                    n1 = n1 % n2;
                } else {
                    n2 = n2 % n1;
                }
            }
            if (n1 == 0) {
                System.out.println("hcf is " + n2);
            }
            System.out.println("hcf is " + n1);

        }

        else if (ask == 2) {

            for(i=1;;i=i)
            {
                if (n1 % i == 0 && n2 % i == 0){
                    t=t*i;
                    --i;
                }

            
            
            // while (n1 % i == 0 && n2 % i == 0)
            // {
            //     t=i;
            //     i++;
                
            // }
            t1 = n1 /t ;
             t2 = n2 / t;
             t = t * t1 * t2;
             System.out.println("lcm is" + t);
            

        } }
        else {
            System.out.println("enter a valid number");
        }

    }
}
