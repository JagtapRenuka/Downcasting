import java.util.Scanner;
public class CustomExcetion {
    public static void main(String[] args) throws InsufficientBalanceException {
        Scanner sc=new Scanner(System.in);
        System.out.println("please Enter the amount to withdraw");
        int amt=sc.nextInt();
        withdraw(amt);
    }
    public static void withdraw(int amt) throws InsufficientBalanceException {
        int balance=10000;
        if(amt<balance){
            System.out.println("Amount has withdrawn");
        }
        else{
            throw new InsufficientBalanceException();
        }
    }
}
class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(){
        super("insufficient balance exception");
    }
}