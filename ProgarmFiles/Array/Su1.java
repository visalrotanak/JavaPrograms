/* class Student{
	private String name;
	public String getName(){
		return name;
	}
	public void setName(String n){
		name = n;
	}
	public void printAbout(){
		System.out.println("I am a student.");
	}
}
class Undergraduate extends Student{
	public void printAbout(){
		System.out.println("I am an undergraduate.");
	}
}
class Su1{
	public static void main(String []args){
		Student s = new Student();
		Undergraduate u = new Undergraduate();
		s.printAbout();
		u.printAbout();
	}
} */

class Student{
  private String name;
  public String getName(){
    return name;
  }
  public void setName(String n){
    name = n;
  }
  public void printAbout(){
    System.out.println("I am a student.");
  }
}

class Undergraduate extends Student{
  public void printAbout(){
    System.out.println("I am an undergraduate.");
}
  public void printName(){
    System.out.println(name);
  }
}

class Su2{
  public static void main(String[] args){
    Student s = new Undergraduate();
    s.setName("xyz");
    s.printName();
  }
}