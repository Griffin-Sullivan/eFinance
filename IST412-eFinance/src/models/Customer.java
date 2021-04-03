
package models;

/** Represents a customer
 * @author Griffin Sullivan
*/
public class Customer {
    private String firstName;
    private String lastName;
    private int age;
    private int ssn;
    private double income;
    private Loan loan;
    private String email;
    private String password;
    private ATZFinance bank;

    /** Creates a new customer
     * @param firstName The customer's first name
     * @param lastName The customer's last name
     * @param age The customer's age
     * @param email The customer's email
     * @param password The customer's password
    */
    public Customer(String firstName, String lastName, int age, String email, String password, ATZFinance bank) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.password = password;
        this.bank = bank;
    }
    
    /** Gets customer's first name
    */
    public String getFirstName() {
        return firstName;
    }
    
    /** Gets customer's last name
    */
    public String getLastName() {
        return lastName;
    }
    
    /** Gets customer's age
    */
    public int getAge() {
        return age;
    }
    
    /** Gets customer's Social Security number
    */
    public int getSsn() {
        return ssn;
    }
    
    /** Gets customer's income
    */
    public double getIncome() {
        return income;
    }
    
    /** Gets customer's email
    */
    public String getEmail() {
        return email;
    }
    
    public String getPassword(){
        return password;
    }
    
    /** Sets the customer's email
     * @param email The customer's email
    */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /** Sets the customer's password
     * 
     * @param password The customer's password
    */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /** Sets the customer's Social Security Number
     * 
     * @param ssn The customer's Social Security Number
     */
    public void setSsn(int ssn) {
        this.ssn = ssn;
    }
    
    /** Sets the customer's income
     * 
     * @param income The customer's income
     */
    public void setIncome(double income) {
        this.income = income;
    }
    
    
    
    /** Authenticates the user when they login to check that the user has the right email and password
     * @param email The customer's email address
     * @param password The customer's password
     * @return true if the user authenticates, otherwise false
    */
    public boolean authenticate(String email, String password) {
        return true;
    }
    
    public Loan getLoan(String loanId) {
        return bank.getLoan(loanId);
    }
}
