package LoanBankingApplication;

public interface Loan {

    boolean isPhoneValid();

    boolean isAadharValid();

    boolean isPanValid();

    double getLoanROI();

    int getCibilScore();

    double getCustomerSalary();

    int getcustomerAge();

    double calculateEMI();
}