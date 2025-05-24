import java.util.Scanner;
public class Inputoutput {
    public void print(Scanner sc){
         int input;
         System.out.println("enter the number");
    input=sc.nextInt();
    System.out.println("You entered: " + input);
    }   
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Inputoutput io = new Inputoutput();
    io.print(sc);
   
}
}