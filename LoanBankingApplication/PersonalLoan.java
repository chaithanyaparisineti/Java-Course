package LoanBankingApplication;
import java.util.Scanner;
public class PersonalLoan extends LoanImpl{	
    static Scanner sc = new Scanner(System.in);  
    public boolean isPhoneValid() {
        System.out.println("Enter your mobile number ");
        String phone = sc.next();
        return phone.matches("[6-9]{1}[0-9]{9}");
    }
    public boolean isAadharValid() {
        System.out.println("Enter your aadhar ");
        String aadhar = sc.next();
        return aadhar.matches("[1-9]{1}[0-9]{11}");
    }
    public boolean isPanValid() {
        System.out.println("Enter PAN card details  : ");
        String pan = sc.next();
        return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
    }
    public double getLoanROI() {
        double roi = 8.5;
        int cibil = getCibilScore();
        if (cibil >= 300 && cibil <= 549) {
            System.out.println("Poor - High risk; loan applications are likely to be rejected or approved at high interest rates");
            roi = roi + 4.0;
        } else if (cibil >= 550 && cibil <= 699) {
            System.out.println("Fair - Moderate risk; may face limitations in credit approval");
            roi = roi + 2.0;
        } else if (cibil >= 700 && cibil <= 749) {
            System.out.println("Good - Low risk; better chances of loan approval with favorable terms");
            roi = roi + 1.5;
        } else if (cibil >= 750 && cibil <= 900) {
            System.out.println("Excellent - Very low risk; highest likelihood of approval and access to lower interest rates");
            roi = roi + 0.5;
        }
        return roi;
    }

    public int getCibilScore() {
        System.out.println("Enter Your Cibil score ");
        return sc.nextInt();
    }

    public double getCustomerSalary() {
        System.out.println("Enter your salary : ");
        return sc.nextDouble();
    }

    public int getcustomerAge() {
        System.out.println("Enter your age : ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("main method started ");
        System.out.println("Welcome to SSS Personal Loan Banking !!");

        PersonalLoan pl = new PersonalLoan();

        System.out.print("Enter Customer Name : ");
        pl.customerName = sc.next();

        System.out.print("Enter Email : ");
        pl.email = sc.next();

        sc.nextLine();

        System.out.print("Enter Address : ");
        pl.address = sc.nextLine();

        System.out.print("Enter Employment Type : ");
        pl.employmentType = sc.next();

        System.out.print("Enter Company Name : ");
        pl.companyName = sc.next();

        double salary = pl.getCustomerSalary();

        int age = pl.getcustomerAge();

        int cibil = pl.getCibilScore();

        System.out.print("Enter Loan Amount : ");
        pl.loanAmount = sc.nextDouble();

        System.out.print("Enter Loan Tenure (Years) : ");
        pl.loanTenure = sc.nextInt();

        if (salary >= 900000.00 && age >= 26 && (cibil >= 300 && cibil <= 900)) {
            System.out.println("Basic information is validated check personal details");

            if (pl.isPhoneValid() && pl.isAadharValid() && pl.isPanValid()) {
                System.out.println("Details are good and Loan got approved !!");
                System.out.println("Your Loan ROI is : " + pl.getLoanROI());
                System.out.println("Customer Name : " + pl.customerName);
                System.out.println("Email         : " + pl.email);
                System.out.println("Address       : " + pl.address);
                System.out.println("Employment    : " + pl.employmentType);
                System.out.println("Company       : " + pl.companyName);
                System.out.println("Loan Amount   : ₹" + pl.loanAmount);
                System.out.println("Loan Tenure   : " + pl.loanTenure + " Years");
             
                System.out.printf(
                    "Monthly EMI   : ₹%.2f%n",
                    pl.calculateEMI()
                );
            } else {
                System.err.println("Something went wrong ! ");
            }
        } else {
            System.err.println("You are not eligible for Personal Loan and you loan got rejected ");
        }

        System.out.println("main method ended ");
    }
}

