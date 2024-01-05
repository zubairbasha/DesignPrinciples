package single_responsibility;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Account account=new Account();
        account.setAccount_number(123);
        account.setName("Zubair Basha");
        account.setTotalAmount(1000);

        AccountOperation accountOperation=new AccountOperation();
        accountOperation.AddAccount(account);

        TransactionOperation transactionOperation=new TransactionOperation();
        transactionOperation.deposit(1234,account.getAccount_number());
    }
}
