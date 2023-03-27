import java.util.*;

class UserInput
{
    public static void main(String args[])
    {
        System.out.println("Enter your name");
        Scanner scan=new Scanner(System.in);
        String name = scan.next();
        System.out.println("Your name is "+ name);

        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Your age is "+ age);

        System.out.println("Enter your deptt");
        String deptt = scan.next();
        System.out.println("Your deptt is "+ deptt);
    }

}