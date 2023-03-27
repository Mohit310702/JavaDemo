import java.util.*;
class Hello
{
    public static void main(String args[])
    {
        Scanner scanner =  new Scanner(System.in);
       String string = scanner.next();
       int num = scanner.nextInt();


       System.out.printf("%-14s %n %04d %n", string, num);  
    }
}