/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srt.freelancers;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author papil
 */
public class Utilizador implements Serializable {
    String username;
    String nome;
    String password;
    String email;
    Integer HorasTrabalho;
    boolean is_convidado = false;
    Set<Tarefas> guardaTarefas_convidado = null;
    Set<Projeto> guarda_Projeto_convidado = null;

    public Set<Tarefas> getGuardaTarefas_convidado() {
        return guardaTarefas_convidado;
    }

    public void setGuardaTarefas_convidado(Set<Tarefas> guardaTarefas_convidado) {
        this.guardaTarefas_convidado = guardaTarefas_convidado;
    }

    public Set<Projeto> getGuarda_Projeto_convidado() {
        return guarda_Projeto_convidado;
    }

    public void setGuarda_Projeto_convidado(Set<Projeto> guarda_Projeto_convidado) {
        this.guarda_Projeto_convidado = guarda_Projeto_convidado;
    }

    public boolean isIs_convidado() {
        return is_convidado;
    }

    public void setIs_convidado(boolean is_convidado) {
        this.is_convidado = is_convidado;
    }
    
    
    public Integer getHorasTrabalho() {
        return HorasTrabalho;
    }

    public void setHorasTrabalho(Integer HorasTrabalho) {
        this.HorasTrabalho = HorasTrabalho;
    }
    TipoConta tipo;
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public Utilizador() {    
    }

    public Utilizador setUser(String user) {
        
        Utilizador util = null;
        for (Utilizador u: Repositorio.getInstance().getUtilizadores()) {
            String username = ((Utilizador) u).getUsername();
            if (username.compareTo(user) == 0) {
                util = ((Utilizador) u);
            }
        }
        return util;
    }
      
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TipoConta getTipo() {
        return tipo;
    }

    public void setTipo(TipoConta tipo) {
        this.tipo = tipo;
    }

      
}
