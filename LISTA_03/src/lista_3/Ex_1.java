/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_3;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 
 */
public class Ex_1 {
    public static void main(String args[]) {
        ObjetoGeometrico circulo = new Circulo();
        Map<Enum, Double> dimensoes = new HashMap<>();
        dimensoes.put(Dimensoes.RAIO, 10.0);
        
        System.out.println(circulo.getArea(dimensoes));
    }
}
