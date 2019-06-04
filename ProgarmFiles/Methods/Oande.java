import java.util.*;

class Oande{
	
	public static void odd_even(){
		int choice = 1;
		int x;
		Scanner s = new Scanner(System.in);
	while(choice == 1){
		System.out.println("Enter a number");
		x =s.nextInt();
		if(x%2 == 0 && x>=0)
			System.out.println("Even");
		else if(x%2 != 0 && x>=0)
			System.out.println("Odd");
		else
			System.out.println("Enter positive Number");
	System.out.println("Want to check more numbers? Enter 1 for yes and 0 for no");
	choice = s.nextInt();
	}
	}
	
	public static void main(String[] args){
		odd_even();
	}
}