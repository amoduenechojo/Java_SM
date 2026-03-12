import java.util.ArrayList;
public class TransactionApp{

    public static double depositMoney(double amount, double accountBalance, double transactions, ArrayList<String>transactions){
       
            accountBalance = amount + accountBalance;        

    
        String transactionDetails = String.format("Deposited: ₦%,.2f|New Balance:  ₦%,.2f",amount,accountBalance);
        transaction.add(transactionDetails);

        System.out.println(transactionDetails);

        return accountBalance;
    }
    

    public static double withdrawMoney(double amount, double accountBalance, ArrayList<String>transactions){

            if(amount <= accountBalance && amount > 0){
                accountBalance = accountBalance - amount; 

                String withdrawRecord = String.format("Withdrew: ₦%,.2f | New Balance: ₦%,.2f",amount, accountBalance);
                transactions.add(withdrawRecord);
                System.out.println(withdrawRecord);

            return accountBalance;
            }

            else{

                if (amount > accountBalance){
                    System.out.println("Insufficient funds");
                }
                else if (amount <= 0){
                    System.out.println("Invalid input!");
                }
           
            }
         return accountBalance;
    }



    public static double showTransaction(ArrayList<String>transactions){
        for(String transcation : transactions){
            System.out.println(transaction);

                if(transaction.size = 0){
                    System.out.print("No transactions yet");
                }
        }   


    }















    }
