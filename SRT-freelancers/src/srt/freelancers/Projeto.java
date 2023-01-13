/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srt.freelancers;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author papil
 */
public class Projeto implements Serializable {
    String nome;
    Float precoPhora;
    String nomeCliente;
    int TotalHoras;
    Set<Tarefas> tarefaList= null;
    Set<Utilizador> util = null;

    public Projeto() {
        tarefaList=new HashSet<>();
        util = new HashSet<>();
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    

    public Set<Utilizador> getUtil() {
        return util;
    }

    public void setUtil(Set<Utilizador> util) {
        this.util = util;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPrecoPhora() {
        return precoPhora;
    }

    public void setPrecoPhora(Float precoPhora) {
        this.precoPhora = precoPhora;
    }

    public int getTotalHoras() {
        return TotalHoras;
    }

    public void setTotalHoras(int TotalHoras) {
        this.TotalHoras = TotalHoras;
    }

    public Set<Tarefas> getTarefaList() {
        return tarefaList;
    }

    public void setTarefaList(Set<Tarefas> tarefaList) {
        this.tarefaList = tarefaList;
    }
}
