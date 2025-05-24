import java.util.Scanner;
public class Sumloop{
    public static void main(String[] args){
    int a;
    Scanner sc = new Scanner(System.in);
    a=sc.nextInt();
    
    {
        int sum=0;
        
        for(int i=0; i<=a;i++)
        {
            sum+=i;
        }
        System.out.println("Sum of first "+a+"  numbers is: "+sum);
    }
}

}