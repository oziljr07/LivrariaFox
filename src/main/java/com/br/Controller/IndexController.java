/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author thiago.276014
 */
   @Controller //Responsável tanto por receber requisições como por enviar a resposta ao usuário
public class IndexController {
    @RequestMapping("/")//Define a url que quando for requisitada chamara o metodo
    public String index(){
        return "index";
    }
    
       @RequestMapping("/login" )
    public String login() {
        return "login";
    }
}
