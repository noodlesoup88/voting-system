/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votingsystem;
import java.util.Scanner;

/**
 *
 * @author Prof.Katana
 */
public class accountinfo {
    
    private String firstName;
    private String lastName;
    private int age;
    private int idnumber;
    private String address;
    private String username;
    private String password;

    public accountinfo () {
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to the Voting System Account Registration!");
        System.out.print("First Name: ");
        String firstName = s.nextLine();

        System.out.print("Last Name: ");
        String lastName = s.nextLine();

        System.out.print("Age: ");
        int age = s.nextInt();
        
        System.out.print("ID number: ");
        int idnumber = s.nextInt();
        
        System.out.print("Address: ");
        String address = s.nextLine();

        System.out.print("Username: ");
        String username = s.nextLine();

        System.out.print("Password: ");
        String password = s.nextLine();

    }

    public void displayAccountInfo() {
        System.out.println("\nAccount Information:");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Username: " + username);
        System.out.println("ID: " + idnumber);
        
    }

public static void main(String[] args) {
    accountinfo Accountinfo = new accountinfo();
    Accountinfo.displayAccountInfo();
    }
}
