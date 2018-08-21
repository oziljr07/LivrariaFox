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

/**
 *
 * @author vitor.7716
 */

@Controller
public class LoginController {
    
    @Autowired
    private ClienteRepository cr;
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
    
    @RequestMapping(value = "/verificarLogin", method = RequestMethod.POST)
    public String verificarLogin(String usuario,String senha){    
        try {
            Cliente cli = cr.findByCliente(usuario, senha);
            return "Sucesso";
        } catch (Exception e) {
            return "Erro = "+e.toString();
        }

    }
}
