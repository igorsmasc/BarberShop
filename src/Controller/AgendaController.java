/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Agenda;
import View.MenuPrincipal;

/**
 *
 * @author igors
 */
public class AgendaController {
    private final Agenda view;

    public AgendaController(Agenda view) {
        this.view = view;
    }

    public void voltarParaMenu(){
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.view.dispose();
     
    }

    
    
    
    
}
