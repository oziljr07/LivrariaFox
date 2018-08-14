/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.Repository;

import com.br.Objetos.Cliente;
import com.br.Objetos.Funcionario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author vitor.7716
 */
public interface ClienteRepository extends CrudRepository<Cliente, String> {
        Cliente findByCodigo(long codigo);
        Iterable<Cliente> findByNome(String nome);
        Iterable<Cliente> findByRg(String rg);
        Iterable<Cliente> findByCpf(String cpf);
        Iterable<Cliente> findByUsuario(String usuario);
        Iterable<Cliente> findBySenha(String senha);
        Iterable<Cliente> findByEmail(String email);
        Iterable<Cliente> findByTelefone(int telefone);
        
}
