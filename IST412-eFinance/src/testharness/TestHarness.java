//package testharness;
//
//import controllers.Controller;
//import controllers.DashboardController;
//import controllers.LoanController;
//import controllers.LoginRegisterController;
//import controllers.PersonalInfoProfileController;
//import models.ATZFinance;
//import models.Customer;
//import models.Employee;
//import models.Loan;
//import views.CustomerDashboard;
//import views.EmployeeDashboard;
//import views.LoanApplicationView;
//import views.LoanInfoView;
//import views.MakePaymentView;
//import views.PersonalInfoView;
//import views.PersonalInfoView;
//import views.RegistrationView;
//import views.LoginView;
//
//public class TestHarness {
//
//    public static void main(String[] args) {
//        ATZFinance bank = ATZFinance.getInstance();
//        Customer testUser = new Customer("john", "smith", 35, "johnsmith@gmail.com", "password", bank);
//        Employee testEmployee = new Employee("joework", "password", "joework@gmail.com");
//        Loan testLoan = new Loan(1200.00, "john", "smith", "1", 1.5);
//        Controller controller = new Controller();
//
//        //LoanController tests
//        MakePaymentView paymentView = new MakePaymentView();
//        LoanInfoView loanInfoView = new LoanInfoView();
//        LoanApplicationView loanApplicationView = new LoanApplicationView();
//
//        controller.setLoanController(new LoanController(paymentView, loanInfoView, loanApplicationView));
//
//        System.out.println("------Running LoanController Tests------");
//        System.out.println("Display Loan Information Test:");
//        bank.addTestLoans();
//        try {
//            System.out.println(controller.getLoanController().displayLoanInfo(testUser, "123").getLoanAmount());
//            System.out.println("SUCCESS");
//        } catch (Exception e) {
//            System.out.println(e);
//            System.out.println("FAILURE");
//        }
//        
//        System.out.println("Submit Loan Application:");
//        try {
//            controller.getLoanController().submitApplication(testUser.getFirstName(), testUser.getLastName(),
//                    "10000", "4.5", "1000145680");
//            System.out.println("SUCCESS");
//        } catch (Exception e) {
//            System.out.println(e);
//            System.out.println("FAILURE");
//        }
//
//        System.out.println("Submit Loan Payment:");
//        try {
//            double amountBefore = testUser.getLoan("123").getLoanAmount();
//            controller.getLoanController().submitPayment(testUser, 200.00, "123");
//            double amountAfter = testUser.getLoan("123").getLoanAmount();
//            if (amountBefore > amountAfter) {
//                System.out.println("SUCCESS");
//            } else {
//                System.out.println("FAILURE");
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//            System.out.println("FAILURE");
//        }
//
//        // PersonalInfoProfileController tests
//        PersonalInfoView profileView = new PersonalInfoView();
//
//        controller.setPersonalInfoProfileController(new PersonalInfoProfileController(testUser, profileView));
//
//        System.out.println("------Running LoanController Tests------");
//        System.out.println("View Statement Test:");
//        try{
//            System.out.println(controller.getPersonalInfoProfileController().viewStatement(testUser, testLoan));
//            System.out.println("SUCESS");
//        }catch(Exception e){
//            System.out.println(e);
//            System.out.println("FAILURE");
//        }
//
//        System.out.println("Display Profile Information Test:");
//        try {
//            System.out.println(controller.getPersonalInfoProfileController().displayInfo(testUser, testLoan.getId()));
//            System.out.println("SUCCESS");
//        } catch (Exception e) {
//            System.out.println(e);
//            System.out.println("FAILURE");
//        }
//        
//        System.out.println("Update Email Test: ");
//        try{
//            testUser.setEmail("j.smith@gmail.com");
//            System.out.println(controller.getPersonalInfoProfileController().updateEmail());
//            System.out.println("SUCCESS");
//        }catch(Exception e){
//            System.out.println(e);
//            System.out.println("FAILURE");
//        }
//        
//        //LoginRegister controller tests
//        LoginView loginView = new LoginView();
//        RegistrationView registerView = new RegistrationView();
//
//        //controller.setLoginRegisterController(new LoginRegisterController(loginView, registerView));
//
//        System.out.println("------Running LoginRegisterController Tests------");
//        System.out.println("Add New Customer Test:");
//        try {
//            controller.getLoginRegisterController().addNewCustomer("johnsmith@gmail.com", "password", "john", "smith", 35);
//            System.out.println("SUCCESS");
//        } catch (Exception e) {
//            System.out.println(e);
//            System.out.println("FAILURE");
//        }
//        System.out.println("Authenticate User Test:");
//        try {
//            //controller.getLoginRegisterController().authenticate("johnsmith@gmail.com", "password");
//            System.out.println("SUCCESS");
//        } catch (Exception e) {
//            System.out.println(e);
//            System.out.println("FAILURE");
//        }
//        
//        // DashboardController tests
//        CustomerDashboard customerDashboard = new CustomerDashboard();
//        EmployeeDashboard employeeDashboard = new EmployeeDashboard();
//
//        //controller.setDashboardController(new DashboardController(customerDashboard, employeeDashboard));
//
//        System.out.println("------Running DashboardController Tests------");
//        //this runs a test for the display message for the Customer to see
//        System.out.println("Welcome Message for Customer Test:");
//        try{
//            //System.out.println(controller.getDashboardController().welcomeCustomerMessage(testUser));
//            System.out.println("SUCCESS");
//        }catch(Exception e){
//            System.out.println(e);
//            System.out.println("FAILURE");
//        }
//        
//        //this runs a test for the display message that an employee will see
//        System.out.println("Welcome Message for Employee Test:");
//        try{
//            //System.out.println(controller.getDashboardController().welcomeEmployeeMessage(testEmployee));
//            System.out.println("SUCCESS");
//        }catch(Exception e){
//            System.out.println(e);
//            System.out.println("FAILURE");
//        }
//        
//    }
//}
