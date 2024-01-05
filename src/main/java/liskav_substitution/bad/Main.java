package liskav_substitution.bad;

public class Main {
    public static void main(String[] args) {
        SecureLoan homeLoan=new HomeLoan();
        LoanPayment creditCard=new CreditCardLoan();
        LoanClosureService loanClosureService=new LoanClosureService(homeLoan);

        loanClosureService.foreCloseLoan();

    }
}
