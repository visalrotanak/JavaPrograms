class Co2{
	public static void main(String[] args){
		int n =1 ;
		do{
		  if(n==5){
			n=n+1;
			continue;
		  }
		System.out.println("n = "+n);
		n++;
		}while(n<10);
	}
}