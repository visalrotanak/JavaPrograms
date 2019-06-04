import java.util.*;
class L2{
	public static void main(String []args){
	/*	int n;
		for( n=1; n<=10; n++){
			System.out.println(n);
		}
	*/
		int sum = 0, i, n;
		Scanner s = new Scanner(System.in);
		
		for(i = 0; i<10; i++){
		  System.out.println("Enter number");
		  n = s.nextInt();

		  sum = sum + n;
		}
		System.out.println("Sum is "+sum);
	}
}