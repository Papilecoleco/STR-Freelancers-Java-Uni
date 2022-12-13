/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srt.freelancers;

import java.util.Scanner;

/**
 *
 * @author papil
 */
public class SRTFreelancers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    int optionSelected;

    do {
        System.out.println("Select 1 for Login");
        System.out.println("Select 2 for User Registration");
        System.out.println("Select 3 to Exit");
        System.out.print("Enter selected option: ");
        optionSelected = scanner.nextInt();

        if(optionSelected == 1){
            boolean login = Conta.login();
            System.out.println("Login in progress\n");
        } else if (optionSelected == 2){
            
            System.out.println("Registration in progress\n");
        }
        
    
    } while (optionSelected != 3);
}
}

