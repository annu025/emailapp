package emailapp;

import java.util.Scanner;

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

        // Call a method to ask for department
        // Method return the department value
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

    }
    // Ask for department (accounts, sales..)
    private String setDepartment() {
        System.out.println("DEPARTMENT CODES: \n1. Sales \n2. Accounting \n3. Development \n0. None \nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();

        if(departmentChoice == 1){ return "Sales"; }
        else if(departmentChoice == 2){ return "Accounting"; }
        else if(departmentChoice == 3){ return "Development"; }
        else {return "None"; }
    }
    // Generate a random password

    // Set mailbox capacity

    // Set alternate email address

    // Change password

}
