package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;
    private int defaultPasswordLength = 10;
    private String companySuffix = "mycompany.com";

    // Constructor to receive first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created by: " + this.firstName + " "  + this.lastName);

        // Call a method to ask for department
        // Method return the department value
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // Call a method that returns random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Password is: " + this.password);

        // Combine name, department info and password to generate email
         String email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;

        System.out.println("Email is: " + email);

    }
    // Ask for department (accounts, sales..)
    private String setDepartment() {
        System.out.println("DEPARTMENT CODES: \n1. Sales \n2. Accounting \n3. Development \n0. None \nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();

        if(departmentChoice == 1){ return "sales"; }
        else if(departmentChoice == 2){ return "accounting"; }
        else if(departmentChoice == 3){ return "development"; }
        else {return "none"; }
    }
    // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char []password = new char[length];

        for(int i=0; i < length; i++){
            // Pick a random value between 0 and 30 as there 30 characters in the passwordSet string
            int randomValue = (int) (Math.random() * passwordSet.length());

            // At position i, put the value of randomValue
            password[i] = passwordSet.charAt(randomValue);
        }
        return new String(password);
    }
    // Set mailbox capacity

    // Set alternate email address

    // Change password

}
