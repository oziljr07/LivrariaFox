/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.Repository;

import com.br.Objetos.Funcionario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author vitor.7716
 */
public interface FuncionarioRepository extends CrudRepository<Funcionario, String> {
        Funcionario findByCodigo(long codigo);
        Iterable<Funcionario> findByNome(String nome);
        Iterable<Funcionario> findByCargo(String cargo);
        Iterable<Funcionario> findByRg(String rg);
        Iterable<Funcionario> findByCpf(String cpf);
        Iterable<Funcionario> findByUsuario(String usuario);
        Iterable<Funcionario> findBySenha(String senha);
        Iterable<Funcionario> findByEmail(String email);
        Iterable<Funcionario> findByTelefone(int telefone);
}
