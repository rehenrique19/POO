/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_3;

import java.util.Map;

/**
 *
 * @author 
 */
public class Retangulo implements ObjetoGeometrico {
    @Override
    public double getArea(Map<Enum, Double> dimensoes) {
        return dimensoes.get(Dimensoes.BASE) * dimensoes.get(Dimensoes.ALTURA);
    }
}
