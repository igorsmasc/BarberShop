/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.Usuario;
import View.Login;


/**
 *
 * @author igors
 */
public class LoginController {
    private final Login view;
    private LoginHelper helper;
    

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
        //Pegar um Usuário da View
        Usuario usuario = helper.obterModelo();
        
        //Pesquisar o Usuário no banco
        //Se o usuario da view tiver o mesmo usuario e senha do banco direcionar para menu
        // Senão mostrar mensagem ao usuário "Usuário ou senha inválidos"
 
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco");
        
        this.view.exibeMensagem("Executei ou fiz tarefa");
    }
    
}
