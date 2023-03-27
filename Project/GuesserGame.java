import java.util.*;

class Gusser
{
    int guessNum;

    int guessingNumber()
    {
        System.out.println("Gusser! Please guess a number");
        Scanner scan = new Scanner(System.in);
        guessNum = scan.nextInt();
        return guessNum;
    }
}

class Player
{
    int guessNum;
    int guessingNumber()
    {
        System.out.println("Player! Please guess a number");
        Scanner scan = new Scanner(System.in);
        guessNum = scan.nextInt();
        return guessNum;
    }
}

class Umpire
{
    int numFromGusser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumberFromGusser()
    {
       Gusser g = new Gusser();
       numFromGusser = g.guessingNumber();  
    }

    void collectNumberFromPlayer()
    {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.guessingNumber();
        numFromPlayer2 = p2.guessingNumber();
        numFromPlayer3 = p3.guessingNumber();
    }

    void compare()
    {
        if(numFromGusser == numFromPlayer1)
        {
            if(numFromGusser == numFromPlayer2 && numFromGusser == numFromPlayer3)
            {
                System.out.println("All win the game");
            }
            else if(numFromGusser == numFromPlayer2)
            {
                System.out.println("Player 1 and Player 2 win the game");   
            }
            else if(numFromGusser == numFromPlayer3)
            {
                System.out.println("Player 1 and Player 3 won the game");
            }
            else
            {
                System.out.println("Player 1 won the game");
            }
        }
        else if(numFromGusser == numFromPlayer2)
        {
            if(numFromGusser == numFromPlayer3)
            {
                System.out.println("Player 2 and Player 3 won the game");
            }
            else
            {
                System.out.println("Player 2 won the game");
            }
        }
        else if(numFromGusser == numFromPlayer3)
        {
            System.out.println("Player 3 won the game");
        }
        else{
            System.out.println("No one won the game");
        }
    }
}

class GuesserGame
{
    public static void main(String [] args)
    {
        System.out.println("Let's start the Game");
        Umpire u = new Umpire();
        u.collectNumberFromGusser();
        u.collectNumberFromPlayer();
        u.compare();
    }
}