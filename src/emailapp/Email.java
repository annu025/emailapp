package emailapp;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    // Constructor to receive first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created by: " + this.firstName + " "  + this.lastName);
    }
    // Ask for department (accounts, sales..)

    // Generate a random password

    // Set mailbox capacity

    // Set alternate email address

    // Change password

}
