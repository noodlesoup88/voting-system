/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votingsystem;

/**
 *
 * @author Prof.Katana
 */
import java.util.Scanner;

public class account {
    private String accountname;
    private String password;

    public account() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String accountname = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();
    }

    public String getAccountname() {
        return accountname;
    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        account Account = new account();
        System.out.println("Username: " + Account.getAccountname());
        System.out.println("Password: " + Account.getPassword());
    }
}

