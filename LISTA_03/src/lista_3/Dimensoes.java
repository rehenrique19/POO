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
public enum Dimensoes {
    LADO(1),
    BASE(2),
    ALTURA(3),
    RAIO(4);
    
    private int parametro;
    Dimensoes(int parametro){
        this.parametro = parametro;
    }

    public int getParametro() {
        return parametro;
    }
}

