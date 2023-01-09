public class SavingsAccount {

    int balance;


    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }

    public void checkBalance() {

        System.out.println("Hello!");
        System.out.println("Your balance is " + balance);
    }

    public void deposit(int amountToDeposit) {
        System.out.println("You just deposited " + amountToDeposit);
        balance = balance + amountToDeposit;

    }

    public int withdraw(int amountToWithdraw ) {

        System.out.println("You just widraw " + amountToWithdraw);
        balance = balance - amountToWithdraw;
        return amountToWithdraw;

    }
    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(2000);

        savings.checkBalance();
        savings.withdraw(200);
        savings.deposit(7500);






    }


}
