import java.util.Random;
import java.util.Scanner;

public class Magic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = "";
        int number = 0 ;
        Random rand = new Random();
        System.out.println("Hello, what is ypur name?");
        name = scan.next();
        System.out.println("Well "+name+", try to guess the number I have in mind!");
        char gameCon = 'A';
        while(gameCon != 'N') {
            if(gameCon == 'Y') {
                int myNum = rand.nextInt(100) + 1;
                while (number != myNum) {
                    number = scan.nextInt();
                    if (number > myNum + 10) {
                        System.out.println("Too high, try again");
                        continue;
                    } else if (number > myNum) {
                        System.out.println("Almost!! come down a bit");
                        continue;
                    } else if (number < myNum - 10) {
                        System.out.println("Too low, try again");
                        continue;
                    } else if (number < myNum) {
                        System.out.println("Almost!! go up a bit");
                        continue;
                    }
                }
            }
        }
    }
    public static void repeat(){

    }
}
//while(gameCon != 'N') {
//        System.out.println("Do you want to play again? [Y/N]");
//        gameCon = scan.next().charAt(0);
//        if (gameCon == 'N') {
//        break;
//        }
//        else if(gameCon == 'Y')
//        {
//        continue;
//        }
//        else {
//        System.out.println("Sorry, I did not understand. Let me repeat");
//        continue;
//        }
