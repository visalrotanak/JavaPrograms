class D2{
	public static void main(String[] args){
	char grade = 'B';
	switch ( grade )
	{
		case 'A':
		 System.out.println("Excellent !");
		 break;
		case 'B':
		 System.out.println("Outstanding !");
		 break;
		case 'C':
		 System.out.println("Good !");
		 break;
		case 'D':
		 System.out.println("Can do better");
		 break;
		case 'E':
		 System.out.println("Just passed");
		 break;
		case 'F':
		 System.out.println(" You Failed ");
		 break;
		default:
		 System.out.println("Invalid grade");
	}
	}
}