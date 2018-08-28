/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.Controller;

import com.br.Objetos.Cliente;
import com.br.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author oziel.240016
 */
@Controller
public class CadastroClienteController {
    
    @Autowired
    private ClienteRepository rc;
    
    @RequestMapping(value = "/cadastrar")
    @ResponseBody
    public String Update(String nome, String rg, String cpf, String usuario, String senha, String email, int telefone ) {
        Cliente cli = null;
        try {
            cli = new Cliente(nome, rg, cpf, usuario, senha, email, telefone);
            clienteRepository.save(cli);
                    
        } catch (Exception ex) {
            return "Erro ao criar o Usuario: "+ ex.toString();
        }
        return "Usuário Cadastrado com Sucesso (id = "+cli.getId()+")";
        
        }
    
   @RequestMapping("/delete")
   @ResponseBody
   public String delete(long id) {
       try {
           Cliente cli = new Cliente(id);
           clienteRepository.delete(cli);
       } catch (Exception ex) {
           return "Erro ao deletar o Usuário: "+ex.toString();
       }
   return "Usuário deletado com Sucesso";
   }
   
   @RequestMapping("/update")
   @ResponseBody
   public String updateUser(long id, String nome, String rg, String cpf, String usuario, String senha, String email, int telefone) {
       try {
          Cliente cli = clienteRepository.findOne(id); 
       } catch (Exception ex) {
           return "Erro de Update do Usuário: "+ex.toString();
       }
       
       return "Update realizado com Sucesso";
   }
    
    @Autowired
    private ClienteRepository clienteRepository;
}
