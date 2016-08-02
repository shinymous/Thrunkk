/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.pessoa.model;

import br.senac.localizacao.model.Endereco;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Aluno
 */
public class PessoaFisica extends Pessoa {
    String cpf;
    Date dtNascimento;
    String rg;
    Sexo sexo;
    
    public PessoaFisica(){
        super();
    }
    
    public PessoaFisica(Long id){
        this.id = id;
    }
    
    public PessoaFisica(Long id, String nome, Sexo sexo){
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
    }

    public PessoaFisica(String cpf, Date dtNascimento, String rg, long id, String nome, String tipo, String telefone, String email, Endereco endereco) {
        super(id, nome, tipo, telefone, email, endereco);
        this.cpf = cpf;
        this.dtNascimento = dtNascimento;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.cpf);
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
        final PessoaFisica other = (PessoaFisica) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" + "cpf=" + cpf + ", dtNascimento=" + dtNascimento + ", rg=" + rg + ", sexo=" + sexo + '}';
    }
    
    @Override
    public String getDocumento(){
        return this.cpf;
    }
}
