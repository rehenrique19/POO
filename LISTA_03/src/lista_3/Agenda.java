/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 */
public class Agenda {
    private List<Pessoa> pessoas = new ArrayList<>();
    
    
    public void armazenaPessoa(String nome, int idade, float altura) {
        if (pessoas.size() >= 10) {
            return;
        }
        
        Pessoa pessoa = new Pessoa();
        
        pessoa.setNome(nome);
        pessoa.setIdade(idade);
        pessoa.setAltura(altura);
        
        pessoas.add(pessoa);
    }
    
    public void removePessoa(String nome) {
        pessoas.remove(nome);
    }
    
    public int buscaPessoa(String nome) {
        return pessoas.indexOf(nome);
    }
    
    public void imprimeAgenda() {
        for (Pessoa p: pessoas) {
            System.out.println(p.toString() + "\n");
        }
    }
    
    public void imprimePessoa(int index) {
        System.out.println(pessoas.get(index).toString() + "\n");
    }
}
