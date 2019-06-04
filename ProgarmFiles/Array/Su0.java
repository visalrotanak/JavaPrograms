class Car{
	private void print(){
		System.out.println("This is private method.");
	}
}
class Bike extends Car{
	public void printb(){
		System.out.ptintln("This is public method.");
	}
}
class Su0{
	public static void main(String[] args){
		Bike b1 = new Bike();
		b1.print();
	}
}