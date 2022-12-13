/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srt.freelancers;

import java.util.List;
import java.util.Map;

/**
 *
 * @author papil
 */
public class Projeto {
    Long idProjeto;
    String nome;
    Float precoPhora;
    Double TotalTempo;
    Map<Tarefas,Utilizador> tarefaList; 
}
