package LoanBankingApplication;

public class GoldLoan extends LoanImpl {
	
		protected int cibil;
	
		@Override
	    public double getLoanROI() {

	        double roi = 7.5;

	        int cibil = this.cibil;

	        if (cibil >= 300 && cibil <= 549) {

	            System.out.println(
	                "Poor - High risk; loan applications are likely to be rejected or approved at high interest rates"
	            );

	            roi = roi + 4.0;

	        } else if (cibil >= 550 && cibil <= 699) {

	            System.out.println(
	                "Fair - Moderate risk; may face limitations in credit approval"
	            );

	            roi = roi + 2.0;

	        } else if (cibil >= 700 && cibil <= 749) {

	            System.out.println(
	                "Good - Low risk; better chances of loan approval with favorable terms"
	            );

	            roi = roi + 1.5;

	        } else if (cibil >= 750 && cibil <= 900) {

	            System.out.println(
	                "Excellent - Very low risk; highest likelihood of approval and access to lower interest rates"
	            );

	            roi = roi + 0.5;
	        }

	        return roi;
	    }

	    public void getGoldLoanDocInfo() {

	        System.out.println(
	            "Gold Loan Documents Verified Successfully !!"
	        );
	    }

	    public void goldVerification() {

	        System.out.println(
	            "Gold Ornaments Verified Successfully !!"
	        );
	    }

	    public static void main(String[] args) {

	        System.out.println("main method started");
	        System.out.println(" welcome to sss GoldLoan Banking      ");
	        GoldLoan gl = new GoldLoan();
	        System.out.println("\n------customer details---------");
	        System.out.print("Enter Customer Name : ");
	        gl.customerName = sc.next();

	        System.out.print("Enter Email : ");
	        gl.email = sc.next();

	        sc.nextLine();

	        System.out.print("Enter Address : ");
	        gl.address = sc.nextLine();

	        System.out.print("Enter Employment Type : ");
	        gl.employmentType = sc.next();

	        System.out.print("Enter Company Name : ");
	        gl.companyName = sc.next();

	        double salary = gl.getCustomerSalary();

	        int age = gl.getcustomerAge();

	        int cibil = gl.getCibilScore();

	        System.out.print("Enter Gold Loan Amount : ");
	        gl.loanAmount = sc.nextDouble();

	        System.out.print("Enter Loan Tenure (Years) : ");
	        gl.loanTenure = sc.nextInt();

	        System.out.println("\n========== ELIGIBILITY CHECK ==========");

	        if (salary >= 300000.00 &&
	            age >= 18 &&
	            age <= 65 &&
	            cibil >= 300 &&
	            cibil <= 900) {

	            System.out.println(
	                "Basic information is validated. Check personal details."
	            );

	            if (gl.isPhoneValid() &&
	                gl.isAadharValid() &&
	                gl.isPanValid()) {

	                System.out.println("Phone Number : Valid");

	                System.out.println("Aadhar       : Valid");

	                System.out.println("PAN          : Valid");

	                gl.goldVerification();

	                System.out.println(
	                    "\nDetails are good and Gold Loan got approved !!"
	                );

	                double roi = gl.getLoanROI();

	                System.out.println("Your Gold Loan ROI is : " + roi + "%");
	    	               
	                System.out.println("----customer details-----");
	            
	                System.out.println("Customer Name : " + gl.customerName);
	        
	                System.out.println("Email : " + gl.email);
	          
	                System.out.println("Address: " + gl.address);

	                System.out.println("Employment : " + gl.employmentType);
	    
	                System.out.println("Company : " + gl.companyName);
	    	              
	                System.out.println( "Salary: ₹" + salary );
	                  
	                System.out.println("Age : " + age);
	                    
	                System.out.println("cibil Score   : " + cibil);
	                   
	                System.out.println("Loan Amount   : ₹" + gl.loanAmount);
	              
	                System.out.println("Loan Tenure   : " + gl.loanTenure + " Years");
	                   
	                System.out.printf(
	                    "Monthly EMI   : ₹%.2f%n",
	                    gl.calculateEMI()
	                );

	                gl.getGoldLoanDocInfo();

	                System.out.println("GoldLoan application Success");
	            } else {

	                System.err.println("Invalid personal details!");
	          
	                System.err.println("Gold Loan Application Rejected.");        
	            }

	        } else {

	            System.err.println( "You are not eligible for Gold Loan.");
	                

	            System.err.println( "Gold Loan Application Rejected.");
	               
	        }

	        System.out.println("Thank You for approaching us");
	    }
	}
