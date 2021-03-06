/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.Repository;

import com.br.Objetos.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author vitor.7716
 */
public interface ClienteRepository extends JpaRepository<Cliente, String> {
        Cliente findByCodigo(long codigo);
        Cliente findByCliente(String usuario,String senha);

    public Cliente findOne(long id);
        
}
