/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_3;

/**
 *
 * @author 
 */
public class Elevador {
    private int andarAtual = 0; // terreo
    private int totalAndares;
    private int capacidade;
    private int pessoas = 0; // default
    
    
    public void inicializa(int totalAndares, int capacidade) {
        andarAtual = 0;
        pessoas = 0;
        this.capacidade = capacidade;
        this.totalAndares = totalAndares - 1; // pois estamos desconsiderando o terreo
    }
    
    public boolean entra() {
        if (pessoas >= capacidade) { // programação defensiva
            return false;
        }
        
        this.pessoas++;
        return true;
    }
    
    public boolean sai() {
        if (pessoas <= 0) { // programação defensiva
            return false;
        }
        
        this.pessoas--;
        return true;
    }
    
    public boolean sobe() {
        if (andarAtual >= totalAndares) { // programação defensiva
            return false;
        }
        
        this.andarAtual++;
        return true;
    }
    
    public boolean desce() {
        if (andarAtual <= 0) { // programação defensiva
            return false;
        }
        
        this.andarAtual--;
        return true;
    }
}
