/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.DAO.AgendamentoDAO;
import View.Agenda;
import View.MenuPrincipal;
import java.util.ArrayList;

/**
 *
 * @author igors
 */
public class AgendaController {
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }

    public void voltarParaMenu(){
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.view.dispose();
     
    }
    
    public void atualizaTabela(){
        //Buscar lista com agendamentos do BD
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        
        //Exibir lista na view
        helper.preencherTabela(agendamentos);
        
    }

    
    
    
    
}