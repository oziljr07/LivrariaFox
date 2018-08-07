/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.Objetos;

/**
 *
 * @author vitor.7716
 */
public class Funcionario {
   
   private long id;
   
   private String cargo;
   private String nome;
   private String rg;
   private String cpf;
   private String usuario;
   private String senha;
   private String email;
   private int telefone;


    public String getCargo() {
        return cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
   
    
}
