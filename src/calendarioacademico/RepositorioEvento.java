/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendarioacademico;

import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author saulocalixto
 */
public class RepositorioEvento {

    public void addEvento(Collection eventos) {

        try (Scanner entrada = new Scanner(System.in)) {
            //Dizem que é uma boa prática colocar o Scanner dentro do try
            String continuar = "s";
            while ("s".equalsIgnoreCase(continuar)) {
                //enquanto for igual a s.
                System.out.print("Nome: ");
                String nome = entrada.nextLine();

                String data = "";
                while(testaData(data)) {
                    System.out.print("Data (dd/mm/aaa): ");
                    data = entrada.nextLine();
                }

                System.out.print("Regional: ");
                String regional = entrada.nextLine();

                System.out.print("Instituto: ");
                String instituto = entrada.nextLine();

                System.out.print("Descrição: ");
                String descricao = entrada.nextLine();

                Eventos evento = new Eventos(nome, data,
                        regional, instituto, descricao);
                //Aqui eu instancio a classe eventos para adicionar os dados.
                if (eventos.contains(evento)) {
                    System.err.println("Esse produto já foi adicionado. Utilize outro Evento!");
                } else {
                    eventos.add(evento);
                    System.out.println("Evento adicionado.");
                }

                System.out.print("Deseja adicionar mais algum evento? (s/n) ");

                continuar = entrada.nextLine();
            }
        }
    }
    
    public boolean testaData(String data) {
        if(data.length() == 10) {
            if(data.charAt(2) == '/') {
                if(data.charAt(5) == '/') {
                    return false;
                }
            }
        }
        return true;
    }
}
