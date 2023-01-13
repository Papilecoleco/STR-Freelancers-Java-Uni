/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srt.freelancers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author papil
 */
public class Repositorio implements Serializable {
    
    private Set<Utilizador> utilizadores;
    private Map<Projeto, Set<Tarefas>> projeto_tarefas;

    public Map<Projeto, Set<Tarefas>> getProjeto_tarefas() {
        return projeto_tarefas;
    }

    public void setProjeto_tarefas(Map<Projeto, Set<Tarefas>> projeto_tarefas) {
        this.projeto_tarefas = projeto_tarefas;
    }
    private Set<Tarefas> tarefas;
    File fUsers; 

    
    
    private static Repositorio bd=null;

    public Repositorio() {
        this.utilizadores = new HashSet<>();
        this.tarefas = new HashSet<>();
        this.projeto_tarefas = new HashMap<>();
    }
    
    
    public static Repositorio getInstance(){        
        if (bd == null){
            bd = new Repositorio();
        }      
        return bd;
    }
    
    public Set<Tarefas> getTarefas() {
        return tarefas;
    }

    public void setTarefas(Set<Tarefas> tarefas) {
        this.tarefas = tarefas;
    }
    
    public Set<Utilizador> getUtilizadores() {
        return utilizadores;
    }

    public void setUtilizadores(Set<Utilizador> Utilizadores) {
        this.utilizadores = Utilizadores;
    }

    
    public synchronized void novoUtilizador(Utilizador u){
        this.utilizadores.add(u);
    }
    
    public synchronized void novaTarefa (Tarefas t){
        this.tarefas.add(t);
    }
    
    public synchronized void novoProjetoTarefa (Projeto p, Set<Tarefas> t){
        this.projeto_tarefas.put(p, t);
    }
   
    public static void serializar(String filename) {
        // Serializar um objeto para ficheiro
        try(FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut))
        {
            out.writeObject(bd);
            System.out.println("Serialized data is saved in " + filename);
        } catch (IOException ex) {
            System.out.println("Erro: " + ex.getCause() + ex.getMessage() + ex.getLocalizedMessage());
        }
    }
   
    public static void desserializar(String filename) {
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            bd = (Repositorio) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException ex) {
            System.out.println("Erro: " + ex.getCause() + ex.getMessage() + ex.getLocalizedMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Cliente class not found. " + ex.getCause() + ex.getMessage() + ex.getLocalizedMessage());
        }
    }
    
}
