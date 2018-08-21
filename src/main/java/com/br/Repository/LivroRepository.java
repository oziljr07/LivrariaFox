/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.Repository;

import com.br.Objetos.Livro;
import java.util.Date;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author vitor.7716
 */
public interface LivroRepository extends CrudRepository<Livro, String>{
    Livro findByCodigo(long codigo);
    Iterable<Livro> findByTitulo(String titulo);
    Iterable<Livro> findByGenero(String genero);
    Iterable<Livro> findByAno(Date ano);
    Iterable<Livro> findByPreco(float preco);
    Iterable<Livro> findByAutor(String autor);
    Iterable<Livro> findByIdadeIndicativa(int idade);
    Iterable<Livro> findByCapa(byte capa);
    Iterable<Livro> findByColecao(String colecao);
}
