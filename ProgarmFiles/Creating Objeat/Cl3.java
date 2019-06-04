class Account{
  public int balance;
  public Account(){
    balance = 0;
  }
  public static Account getAcc(Account a, Account b){
    Account ac = new Account();
    ac.balance = a.balance+b.balance;
    return ac;
  }
}

class Cl3{
  public static void main (String[] args ){
    Account a1 = new Account();
    a1.balance = 50;
    Account a2 = new Account();
    a2.balance = 60;
    Account b = Account.getAcc(a1,a2);
    System.out.println(b.balance);
  }
}