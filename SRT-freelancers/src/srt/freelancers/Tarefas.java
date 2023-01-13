/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srt.freelancers;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author papil
 */
public class Tarefas implements Serializable {
    String descricao;
    Date dataInicio;
    boolean is_started;
    Date dataFim;
    
    
    public Tarefas() {
       Date dataFim = null;
       Date dataInicio = null;
       boolean is_started = false;
    }

    

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public boolean isIs_started() {
        return is_started;
    }

    public void setIs_started(boolean is_started) {
        this.is_started = is_started;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
}
