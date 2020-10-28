public class Tester{
  public static void main(String []args){
    BankAccount test=new BankAccount("testpword", 215756545);
    System.out.println (test.getPassword());
    System.out.println (test.getAccountID());
    System.out.println (test.getBalance());
    test.setPassword("testpword2");
    System.out.println (test.getPassword());
    test.deposit(-1.0);
    System.out.println (test.getBalance());
    test.deposit(10000);
    System.out.println (test.getBalance());
    test.withdraw(10000);
    System.out.println (test.getBalance());
    test.withdraw(-10000);
    System.out.println (test.getBalance());
    test.withdraw(5);
    System.out.println (test.getBalance());
    System.out.println (test);
  }
}
