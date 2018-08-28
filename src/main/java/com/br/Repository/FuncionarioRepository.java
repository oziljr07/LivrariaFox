/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.Repository;

import com.br.Objetos.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author vitor.7716
 */
public interface FuncionarioRepository extends JpaRepository<Funcionario, String> {
        Funcionario findByCodigo(long codigo);
        Funcionario findByFunc(String nome,String senha);
}
