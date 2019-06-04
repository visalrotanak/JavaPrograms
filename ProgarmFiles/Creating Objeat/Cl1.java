class Student {
  private String name;
  public Student(){
    name = "Unknown";
  }
  public void setName (String n){
    name = n;
  }
  public String getName(){
    return name;
  }
}

class Cl1{
  public static void main(String[] args){
    Student a = new Student();
    System.out.println(a.getName());
    //a.setName("xyz");
    String b = a.getName();
    System.out.println(b);
  }
}