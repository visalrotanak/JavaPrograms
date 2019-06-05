import java.util.Scanner;

public class TaxCal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String amount = "";
        int money = 0;
        int rate = 0;
        double tax = 0.0;
        double net = 0.0;
        while(true) {
            System.out.println("Please enter your amount: ");
            amount = scan.next();
            boolean check = isNumeric(amount);
            if (check == true) {
                 money = Integer.parseInt(amount);
            } else {
                System.out.println("Number is incorrect, try again.");
                continue;
            }
            while(true) {
                System.out.println("Please enter tax rate: ");
                 rate = scan.nextInt();
                if (rate < 1 || rate > 99) {
                    System.out.println("Rate is incorrect, try agian.");
                    continue;
                } else if (rate >= 1 || rate <= 99) {
                    tax = money*((double)rate/100);
                    net = money - tax ;
                    break;
                }
            }
            break;
        }
        System.out.println("====== ====== ====== ===== =====");
        System.out.println("AMOUNT: "+amount+"$");
        System.out.println("RATE: "+rate+"%");
        System.out.println("====== ====== ====== ===== =====");
        System.out.println("TAX: "+tax+"$");
        System.out.println("NET: "+net+"$");
        System.out.println("====== ====== ====== ===== =====");

    }
    public static boolean isNumeric(String str){
        try{
            Double.parseDouble(str);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

}
