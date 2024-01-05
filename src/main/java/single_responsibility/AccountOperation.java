package single_responsibility;

public class AccountOperation {
    public void AddAccount(Account account){
        /*
        * This will handle adding the account in the database
        * */
    }
    public void  updateAccount(Account account){
        /*
        * This will handle to update the account in the database*/
    }
    public Account getAccount(){
        /*
        * This will return the account details*/
        return new Account();
    }
    public void deposit(int amount,int accountNumber){
        /*
        * This is violating the single responsibility rule.
        * Reason the account operation will be responsible of account related operation
        * Transaction should seperated in a seperate class that it should handle the withdraw and deposit*/
    }

}
