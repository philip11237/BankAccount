public class BankAccount{
  private double balance;
  private int accountID;
  private String password;
  public BankAccount( int accID, String pword ){
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
public String toString(){
  return "#"+accountID+"\t $"+balance;
}
private boolean authenticate(String password){
  return this.password.equals(password);
}
public boolean transferTo(BankAccount other, double amount, String password){
  if ((authenticate(password))&&(amount<this.balance)){
    this.withdraw(amount);
    other.deposit(amount);
    return true;
  }
  else {return false;
  }
}
}
