public class Tester{
  public static void main(String []args){
    BankAccount test=new BankAccount( 215756545,"testpword");
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
    BankAccount b1 = new BankAccount(1000001, "abc123");
    BankAccount b2 = new BankAccount(1000231, "abcasdg23");

      System.out.println("Account b1:");
      b1.deposit(3000.0);
      b2.deposit(1234.0);
      System.out.println(b1);
      System.out.println("Account b2:");
      System.out.println(b2);
      System.out.println();


      double cashAmount = 300.0;
      while(cashAmount < 3000){
        System.out.println("Attempt to move $"+cashAmount+" from the b1 to b2 account:");
        if(b1.withdraw(cashAmount) ){
          if(b2.deposit(cashAmount)){
            System.out.println(b1);
            System.out.println(b2);
            System.out.println();

          }else{
            //This should never happen.
            //Error message provided to make sure that is the case
            System.out.println("CRITICAL ERROR! $"+cashAmount +
                               " withdrawn from Account #" +  b1.getAccountID() +
                               "Failed to add to Account #"+b2.getAccountID());
          }
        }else{
          System.out.println("Transfer Failed");
        }
        cashAmount *=2;
  }
}
}
