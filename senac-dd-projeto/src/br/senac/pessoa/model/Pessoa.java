/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.pessoa.model;

import br.senac.localizacao.model.Endereco;
import java.util.Objects;

/**
 *
 * @author Aluno
 */
public abstract class Pessoa {
    Long id;
    String nome;
    String tipo;
    String telefone;
    String email;
    Endereco endereco;
    
    public Pessoa(){
        super();
    }
    
    public Pessoa(Long id){
        this.id = id;
        }

    public Pessoa(long id, String nome, String tipo, String telefone, String email, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", tipo=" + tipo + ", telefone=" + telefone + ", email=" + email + ", endereco=" + endereco + '}';
    }
    
    public String getDocumento(){
        return this.email;
    }
}
