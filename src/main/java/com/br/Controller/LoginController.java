/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.Controller;

import com.br.Repository.ClienteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author vitor.7716
 */

@Controller
public class LoginController {
    
    @RequestMapping("/login.html")//Define a url que quando for requisitada chamara o metodo
    public String login(){
        return "login";
    }
    @RequestMapping("/verificaLogin")
    public boolean verificarLogin(String nome,String senha){
        
        
        return true;
    }
}
