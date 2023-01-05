/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srt.freelancers;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author papil
 */
public class Projeto {
    String idProjeto;
    String nome;
    String nomeCliente;
    Float precoPhora;
    Date DataIniciada;
    Date DataFinalizada;
    List<Tarefas> tarefasP;
    List<Utilizador> colaboradores;

    public Projeto(String idProjeto, String nome, String nomeCliente, Float precoPhora, Date DataIniciada, Date DataFinalizada) {
        this.idProjeto = idProjeto;
        this.nome = nome;
        this.nomeCliente = nomeCliente;
        this.precoPhora = precoPhora;
        this.DataIniciada = DataIniciada;
        this.DataFinalizada = DataFinalizada;
        this.tarefasP = tarefasP;
        this.colaboradores = colaboradores;
    }

    public String getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(String idProjeto) {
        this.idProjeto = idProjeto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Float getPrecoPhora() {
        return precoPhora;
    }

    public void setPrecoPhora(Float precoPhora) {
        this.precoPhora = precoPhora;
    }

    public Date getDataIniciada() {
        return DataIniciada;
    }

    public void setDataIniciada(Date DataIniciada) {
        this.DataIniciada = DataIniciada;
    }

    public Date getDataFinalizada() {
        return DataFinalizada;
    }

    public void setDataFinalizada(Date DataFinalizada) {
        this.DataFinalizada = DataFinalizada;
    }

    public List<Tarefas> getTarefasP() {
        return tarefasP;
    }

    public void setTarefasP(List<Tarefas> tarefasP) {
        this.tarefasP = tarefasP;
    }

    public List<Utilizador> getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(List<Utilizador> colaboradores) {
        this.colaboradores = colaboradores;
    }
    
    
}
