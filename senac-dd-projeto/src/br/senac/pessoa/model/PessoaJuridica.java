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
public class PessoaJuridica extends Pessoa {
     String cnpj;
     String atividade;

    public PessoaJuridica() {
        super();
    }
     
     public PessoaJuridica(Long id){
         this.id = id;
     }

    public PessoaJuridica(String cnpj, String atividade, long id, String nome, String tipo, String telefone, String email, Endereco endereco) {
        super(id, nome, tipo, telefone, email, endereco);
        this.cnpj = cnpj;
        this.atividade = atividade;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.cnpj);
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
        final PessoaJuridica other = (PessoaJuridica) obj;
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" + "cnpj=" + cnpj + ", atividade=" + atividade + '}';
    }
    
    
    
     @Override
     public String getDocumento(){
         return this.cnpj;
     }
}
