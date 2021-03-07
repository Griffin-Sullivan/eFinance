package models;

public class Employee {

    private String username;
    private String password;
    private String email;

    /**
     * This is the default constructor for the Employee class
     *
     * @param username is taken for the user's username
     * @param password is taken for the user's password
     * @param email is taken for the user's email address
     */
    public Employee(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    /**
     * This method will allow the user to change their username
     *
     * @param usernewname is the new username that will replace the old one
     */
    public void setUserName(String usernewname) {
        this.username = usernewname;
    }

    /**
     * This method will allow for the user to change their password
     *
     * @param newpassword is the new password that will replace the old one
     */
    public void setPassword(String newpassword) {
        this.password = newpassword;
    }

    /**
     * This method will allow for the user to change their current email
     *
     * @param newemail is the new email that will replace the old one
     */
    public void setEmail(String newemail) {
        this.email = newemail;
    }

    /**
     * This method returns the user's current username
     *
     * @return username is the current username
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method returns the current password
     *
     * @return password is the current password
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method returns the user's current email address
     *
     * @return
     */
    public String getEmail() {
        return email;
    }
}
