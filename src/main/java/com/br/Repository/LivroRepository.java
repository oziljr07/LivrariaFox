/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.Repository;

import com.br.Objetos.Livro;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author vitor.7716
 */
public interface LivroRepository extends CrudRepository<Livro, String>{
    Livro findByCodigo(long codigo); 
}
