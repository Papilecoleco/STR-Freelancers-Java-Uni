/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srt.freelancers;

import java.util.ArrayList;
import java.util.Scanner;


public class Conta {
    
     public static boolean login(Repositório repo) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter username: ");
        String inpUser = scan.nextLine();
        System.out.println("Enter password: ");
        String inpPass = scan.nextLine(); 

        boolean loginSuccess = false;

        for (Utilizador temp : repo.getUtilizadores()) {
            if (inpUser.equals(temp.getUsername()) && inpPass.equals(temp.getPassword())) {

                System.out.println("Welcome " + temp.getNome() + " to the System.");
                loginSuccess = true;
                break;

            } else {
                loginSuccess = false;
            }
        }

        if (loginSuccess == false) {
            System.out.println("Incorrect Input, Try again.");
        }
        return loginSuccess;

    }

    public void guardarUtilizadores(Repositório repo, Utilizador US) {
        repo.getUtilizadores().add(US);
    }
    
    public void criarUtilizadores()
    
}
