package emailapp;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "fakecompany.com";

    //Constructor to receive first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created" + this.firstName + " " + this.lastName);

        // Call a method asking for department
        this.department = setDepartment();
        System.out.println("Department:" + this.department);

        // Call a method that return a random password
        this.password = randomPassword(defPasswordLength);
        System.out.println("Your password is: " + this.password)

        // Combine values to generate email address
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is:" + email);
    }

    // Ask for name of department
    private String setDepartment(){
        System.out.print("department codes\n1 for Sales\n2 for Development\n3 for Accounting\0 for none\n Enter deparmtne code");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt()
        if(depChoice == 1){return "sales"}
        else if(depChoice ==2){return "dev"}
        else if(depChoice == 3) {return "acct"}
        else {return "";}
    }

    // Generate random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%"
        char[] password = new char[length];
        for (int i=0; i<length; i++){
            int random = (int) (Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    // Set mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    // Change password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity() { return mailboxCapacity; }
    public String getAlternateEmail() { return alternateEmail; }
    public String getPassword() { return password; }
}
