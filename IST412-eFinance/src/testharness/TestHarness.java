package testharness;

import controllers.Controller;
import controllers.LoanController;
import models.ATZFinance;
import models.Customer;
import models.Employee;
import views.LoanApplicationView;
import views.LoanInfoView;
import views.MakePaymentView;

public class TestHarness {

    public static void main(String[] args) {
        ATZFinance bank = ATZFinance.getInstance();
        Customer testUser = new Customer("john", "smith", 35, "johnsmith@gmail.com", "password", bank);
        Employee testEmployee = new Employee("joework", "password", "joework@gmail.com");
        Controller controller = new Controller();
        
        
        //LoanController tests
        MakePaymentView paymentView = new MakePaymentView();
        LoanInfoView loanInfoView = new LoanInfoView();
        LoanApplicationView loanApplicationView = new LoanApplicationView();
        
        controller.setLoanController(new LoanController(paymentView, loanInfoView, loanApplicationView));
        
        System.out.println("------Running LoanController Tests------");
        System.out.println("Display Loan Information Test:");
        bank.addTestLoans();
        try {
            System.out.println(controller.getLoanController().displayLoanInfo(testUser, "123").getLoanAmount());
            System.out.println("SUCCESS");
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println("FAILURE");
        }
        
        System.out.println("Submit Loan Application:");
        try {
            controller.getLoanController().submitApplication(testUser.getFirstName(), testUser.getLastName(), 
                    "10000", "4.5", "1000145680");
            System.out.println("SUCCESS");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("FAILURE");
        }
        
        System.out.println("Submit Loan Payment:");
        try {
            double amountBefore = testUser.getLoan("123").getLoanAmount();
            controller.getLoanController().submitPayment(testUser, 200.00, "123");
            double amountAfter = testUser.getLoan("123").getLoanAmount();
            if (amountBefore > amountAfter) {
                System.out.println("SUCCESS");
            } else {
                System.out.println("FAILURE");
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("FAILURE");
        }
            
        
    }
}
