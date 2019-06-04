
import java.util.Random;
import java.util.Scanner;

public class DiceRolling
{
    public static void main(String[] args)
    {
        boolean event = true ;
        System.out.println("Welcome to the dices game!");
        int numOfDices = 0;
        Scanner in = new Scanner(System.in);
        while(event) {
            System.out.print("Enter the number of dices you want to roll:");
            numOfDices = in.nextInt();
            if(numOfDices <= 0 || numOfDices > 8)
            {
                System.out.println("USAGE: The number must be between 1 and 8");
                continue;
            }
            else if(numOfDices > 0 || numOfDices <= 8)
            {
                play(numOfDices);
                event = false;
            }
        }
    }
    public static void play(int num)
    {
        Random rand = new Random();
        int sum = 0;
        int diceRolled = 0;
        if(num == 1)
        {
            System.out.println("RESULT: 4");
        }
        else if(num <= 8 && num >= 2)
        {
            for(int i=1;i<=num;i++)
            {
                diceRolled = rand.nextInt(8);
                 sum = sum + diceRolled;
                System.out.println("Dice" + i +" : "+ diceRolled);
            }
            System.out.println("===========");
            System.out.println("RESULT: "+sum);
            System.out.println("===========");
        }

    }
}