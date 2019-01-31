/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cliente;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author igors
 */

//CLASSE PARA TESTES
public class Main {
    
    public static void main(String[] args){
        
        String nome = "Igor";
        System.out.println(nome);
        
        Servico barba = new Servico(1, "Barba", 10);
        
        System.out.println(barba.getDescricao());
        System.out.println(barba.getValor());
        
        Cliente cliente = new Cliente(1, "Igor", 'M', "99925181", "Rua 50, numero 5050");
        
        System.out.println(cliente);
        
        Usuario usuario = new Usuario(1, "Barbeiro", "senha");
        System.out.println(usuario);
    }
    
}
