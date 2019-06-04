class Bike{
	String color = "Red";
	int num = 1;
	public static boolean is_checked()
	{	
		Bike bike1 = new Bike();
		//boolean n;
		if(bike1.color == "Red")
			return true;
		else	return false;
	}				
	public static void main(String[] args){
		boolean n = is_checked();
		System.out.println(n);
	}

}

	