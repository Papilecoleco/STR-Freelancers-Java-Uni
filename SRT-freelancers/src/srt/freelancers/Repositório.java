/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srt.freelancers;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author papil
 */
public class Repositório implements Serializable {
    private ArrayList<Utilizador> Utilizadores = new ArrayList<Utilizador>();
    public ArrayList<Utilizador> getUtilizadores() {
        return Utilizadores;
    }

    public void setUtilizadores(ArrayList<Utilizador> Utilizadores) {
        this.Utilizadores = Utilizadores;
    }

    
}
