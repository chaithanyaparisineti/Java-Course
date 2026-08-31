package LoanBankingApplication;

	public class HomeLoan extends LoanImpl {

	    @Override
	    public double getLoanROI() {
	        double roi = 6.5;
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

	    public void getHomeLoanDocInfo() {
	        System.out.println("All the Home Loan documents Verified Successfully !!");
	    }

	    public static void main(String[] args) {
	        System.out.println("main method started ");
	        System.out.println("Welcome to SSS Home Loan Banking !!");

	        HomeLoan hl = new HomeLoan();

	        System.out.print("Enter Customer Name : ");
	        hl.customerName = sc.next();

	        System.out.print("Enter Email : ");
	        hl.email = sc.next();

	        sc.nextLine();

	        System.out.print("Enter Address : ");
	        hl.address = sc.nextLine();

	        System.out.print("Enter Employment Type : ");
	        hl.employmentType = sc.next();

	        System.out.print("Enter Company Name : ");
	        hl.companyName = sc.next();

	        double salary = hl.getCustomerSalary();

	        int age = hl.getcustomerAge();

	        int cibil = hl.getCibilScore();

	        System.out.print("Enter Loan Amount : ");
	        hl.loanAmount = sc.nextDouble();

	        System.out.print("Enter Loan Tenure (Years) : ");
	        hl.loanTenure = sc.nextInt();

	        if (salary >= 800000.00 && age >= 25 && (cibil >= 300 && cibil <= 900)) {
	            System.out.println("Basic information is validated check personal details");

	            if (hl.isPhoneValid() && hl.isAadharValid() && hl.isPanValid()) {
	                System.out.println("Details are good and Home Loan got approved !!");
	                System.out.println("Your Loan ROI is : " + hl.getLoanROI());
	                System.out.println("Customer Name : " + hl.customerName);
	                System.out.println("Email         : " + hl.email);
	                System.out.println("Address       : " + hl.address);
	                System.out.println("Employment    : " + hl.employmentType);
	                System.out.println("Company       : " + hl.companyName);
	                System.out.println("Loan Amount   : ₹" + hl.loanAmount);
	                System.out.println("Loan Tenure   : " + hl.loanTenure + " Years");
	                System.out.printf(
	                    "Monthly EMI   : ₹%.2f%n",
	                    hl.calculateEMI()
	                );
	                hl.getHomeLoanDocInfo();
	            } else {
	                System.err.println("Something went wrong ! ");
	            }
	        } else {
	            System.err.println("You are not eligible for Home Loan and you loan got rejected ");
	        }
	    }
	}

	


