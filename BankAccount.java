abstract class account{

abstract public  double  deposit( double a);
abstract public double withdrawal( double b);
abstract  public void  displaybalance();
}

class SavingsAccount extends account{
  public  double depositAmount;
  public   double withdrawalAmount;

   public double deposit( double a ){
  depositAmount=depositAmount+a;
  System.out.println(depositAmount);
  return depositAmount;
 }
 public  double withdrawal(double b){
  withdrawalAmount= b;
  System.out.println(withdrawalAmount);
  return withdrawalAmount;
 }

 public  void displaybalance(){
  System.out.println("Deposit Amount is :+ " + depositAmount+ " WithdrwalAmount is : " + withdrawalAmount);
 }
}

class CheckingBalance extends SavingsAccount{

 public void displaybalance(){
  Double totalAmount = depositAmount-withdrawalAmount;
  System.out.println( "Total Banlance is now : " +totalAmount);
 }

}


public class BankAccount{

    public static void main(String a[]){

   account obj2 = new CheckingBalance();
   obj2.deposit(1000);
   obj2.withdrawal(200);
   obj2.displaybalance();
    }

}