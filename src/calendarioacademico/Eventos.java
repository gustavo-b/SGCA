/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendarioacademico;

import java.util.Objects;

/**
 *
 * @author saulognome
 */
public class Eventos {

    private String nome;
    private String data;
    private String regional;
    private String instituto;
    private String descricao;
    private String identificacaounica;
    private StringBuilder retorno = new StringBuilder();

    public Eventos(String nome, String data, String regional, String instituto, String descricao) {
        this.nome = nome;
        this.data = data;
        this.regional = regional;
        this.instituto = instituto;
        this.descricao = descricao;
        identificacaounica = nome + data + instituto;
        retorno = retorno.append("\n*********************************")
                .append("\nNome do Evento: ").append(nome)
                .append("\nData do Evento: ").append(data)
                .append("\nRegional: ").append(regional)
                .append("\nInstituto sede: ").append(instituto)
                .append("\nDescrição: ").append(descricao).append("\n");
    }

    @Override
    public String toString() {
        return retorno.toString();
    }

    //esse método que sobreescreve o método hashCode seria útil no caso de
    //usarmos um hashmap ou um hashset. Ele cria um código único para cada
    //identificação única.
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.identificacaounica);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Eventos other = (Eventos) obj;
        if (!Objects.equals(this.identificacaounica, other.identificacaounica)) {
            return false;
        }
        return true;
    }
    
}
