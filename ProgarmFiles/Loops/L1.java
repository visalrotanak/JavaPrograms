import java.util.*;
class L1{
	public static void main(String []args){
	/*	int n = 1;
		while(n <= 10)
		{
			System.out.println(n);
			n++;
		}
	*/
		Scanner s = new Scanner(System.in);
		int choice = 1;
		int a;
		while( choice == 1){
		  System.out.println("Enter a number to check odd or even");
		  a = s.nextInt();
		  
		  if(a%2 == 0)
			System.out.println("Your number is even");
		  else
			System.out.println("Your number is odd");
		 System.out.println("Want to check more: 1 for yes; 0 for no");
		
		choice = s.nextInt();
		}
	System.out.println("I hope you checked all your numbers.");	
	}
}