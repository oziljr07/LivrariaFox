/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.Objetos;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

/**
 *
 * @author thiago.276014
 */
@Entity
public class Livro {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotEmpty
    private String titulo;
    @NotEmpty
    private String genero;
    @NotEmpty
    private String autor;
    @NotEmpty
    private float preco;
    @NotEmpty
    private Date datapub;
    @NotEmpty
    private int idadeind; 
    @NotEmpty
    private byte capa;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Date getDatapub() {
        return datapub;
    }

    public void setDatapub(Date datapub) {
        this.datapub = datapub;
    }

    public int getIdadeind() {
        return idadeind;
    }

    public void setIdadeind(int idadeind) {
        this.idadeind = idadeind;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public byte getCapa() {
        return capa;
    }

    public void setCapa(byte capa) {
        this.capa = capa;
    }
    
    
            
}