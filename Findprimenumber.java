import java.util.Scanner;
public class Findprimenumber {
    public static void main(String[] args)
    {
        int num;
        System.out.println("enter a number");
        Scanner input  = new Scanner(System.in);
        num=input.nextInt();
        for(int i=2;i<(num/2);i++)
        {
            if(num%i==0)
            {
                System.out.println(num+" it is not a prime number");
                return;
            }
            
        }
            System.out.println(num+" is a prime number");
    }
    
}
