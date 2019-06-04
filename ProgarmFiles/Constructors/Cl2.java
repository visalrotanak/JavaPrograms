class Rectangle{
	private int length;
	private int breadth;
	public Rectangle(int l, int b){
		length = l;
		breadth = b;
	}
	public int getArea(){
		return length*breadth;
	}
}

class Cl2{
	public static void main(String[] args){
		Rectangle r = new Rectangle(2,4);
		System.out.println(r.getArea());
	}
}