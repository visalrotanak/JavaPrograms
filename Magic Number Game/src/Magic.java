import java.util.Random;
import java.util.Scanner;

public class Magic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int guessNum = 0;
        int number = 0;
        int num = 0;
        int time = 0;
        char s = 'a';
        System.out.println("Hello, what is your name?");
        String name = scan.nextLine();

        while (true) {
            System.out.println("Well "+name+", try to guess the number I have in mind!");
            guessNum = rand.nextInt(100)+1;
            while (true) {
                number = scan.nextInt();
                if(number == guessNum) {
                    System.out.println("It took you "+time+" try(tries) to guess my number which was " +guessNum+"!");
                    while (true) {
                        System.out.println("Do you want to play again? [Y/N]");
                        s = scan.next().charAt(0);
                        if (s == 'N') {
                            break;
                        } else if (s == 'Y') {
                            break;
                        } else {
                            System.out.println("Sorry, I did not understand. Let me repeat");
                        }
                    }
                    break;
                } else {
                    if(number > guessNum + 10) {
                        System.out.println("OMG!!!! That's too high, try again!");
                    } else if (number > guessNum) {
                        System.out.println("Down a bit, will ya ?");
                    } else if (number < guessNum - 10) {
                        System.out.println("Too low man, try again!");
                    } else if (number > guessNum -10 ) {
                        System.out.println("Why don't you go up more?");
                    }
                }
                time++;
            }
            if(s=='N') {
                System.out.println("OK, bye "+name+"! See you later!");
                break;
            } else if(s=='Y') {
                System.out.println("Let's play again...");
                continue;
            }
        }
    }
    public static boolean isNumberic(String num){
        try{
            Double.parseDouble(num);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
}
