package liskav_substitution.bad;

public class LoanClosureService {
    private SecureLoan secureLoan;

    public LoanClosureService(SecureLoan loanPayment){
        this.secureLoan=loanPayment;
    }
    public void foreCloseLoan(){
      secureLoan.foreCloseLoan();
    }
}
