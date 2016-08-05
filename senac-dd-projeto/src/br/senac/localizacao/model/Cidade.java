/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.localizacao.model;

/**
 *
 * @author Aluno
 */
public class Cidade {
    Long id;
    String nome;
    Estado estado;

    public Cidade(){
        super();
    }
    
    public Cidade(Long id, String nome, Estado estado) {
        this.id = id;
        this.nome = nome;
        this.estado = estado;
    }
    /////////////////////////////////////////////////s
    @Override
    public String toString() {
        return "Cidade{" + "id=" + id + ", nome=" + nome + ", estado=" + estado + '}';
    }
    
    
}
