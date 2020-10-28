public class BankAccount{
  private double balance;
  private int accountID;
  private String password;
  public BankAccount( String pword, int accID ){
    balance=0;
    accountID=accID;
    password=pword;

  }
  public double getBalance(){
    return balance;
  }
  public int getAccountID(){
    return accountID;
  }
  public String getPassword(){
    return password;
  }
  public void setPassword(String urpword){
    password=urpword;
    System.out.println ("your password has been set");
  }
  public boolean deposit(double amount){
    if
    (amount>0){
      balance+=amount;
      return true;
    }
    else {
      return false;
    }
  }
  public boolean withdraw(double amount){
    if
    ((amount<=balance) && (amount>0)){
      balance -= amount;
      return true;
    }
    else {
      return false;
    }
  }


}
