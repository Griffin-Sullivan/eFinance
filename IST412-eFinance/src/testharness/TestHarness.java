package testharness;

import controllers.Controller;
import controllers.LoanController;
import controllers.PersonalInfoProfileController;
import models.ATZFinance;
import models.Customer;
import models.Employee;
import models.Loan;
import views.LoanApplicationView;
import views.LoanInfoView;
import views.MakePaymentView;
import views.PersonalInfoView;

public class TestHarness {

    public static void main(String[] args) {
        ATZFinance bank = new ATZFinance();
        Customer testUser = new Customer("john", "smith", 35, "johnsmith@gmail.com", "password", bank);
        Employee testEmployee = new Employee("joework", "password", "joework@gmail.com");
        Loan testLoan = new Loan(1200.00, "john", "smith", "1", 1.5);
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
        } catch (Exception e) {
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
                System.out.println(amountBefore + " " + amountAfter);
                System.out.println("SUCCESS");
            } else {
                System.out.println("FAILURE");
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("FAILURE");
        }

        // PersonalInfoProfileController tests
        PersonalInfoView profileView = new PersonalInfoView();

        controller.setPersonalInfoProfileController(new PersonalInfoProfileController(testUser, profileView));

        System.out.println("------Running LoanController Tests------");
        System.out.println("View Statement Test:");
        try{
            System.out.println(controller.getPersonalInfoProfileController().viewStatement(testUser, testLoan));
            System.out.println("SUCESS");
        }catch(Exception e){
            System.out.println(e);
            System.out.println("FAILURE");
        }

        System.out.println("Display Profile Information Test:");
        try {
            System.out.println(controller.getPersonalInfoProfileController().displayInfo(testUser, testLoan.getId()));
            System.out.println("SUCCESS");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("FAILURE");
        }
        
        System.out.println("Update Email Test: ");
        try{
            testUser.setEmail("j.smith@gmail.com");
            System.out.println(controller.getPersonalInfoProfileController().updateEmail());
            System.out.println("SUCCESS");
        }catch(Exception e){
            System.out.println(e);
            System.out.println("FAILURE");
        }
        
        
    }
}
