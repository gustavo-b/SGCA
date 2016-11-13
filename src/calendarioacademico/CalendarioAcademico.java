/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendarioacademico;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author saulognome
 */
public class CalendarioAcademico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Collection eventos = new ArrayList();
        RepositorioEvento repositorio = new RepositorioEvento();
        //cria um ArrayList que é uma coleção de dados, no caso Eventos.

        System.out.println("##### Cadastro de eventos #####\n");
        
        repositorio.addEvento(eventos);

        eventos.forEach(System.out::println); //chama o método toString (sei 
        //lá como, vi na internet hehe.
        
        

        System.out.println("Fim");

    }

}
