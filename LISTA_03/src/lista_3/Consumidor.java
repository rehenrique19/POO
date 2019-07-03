/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_3;

import java.util.List;

/**
 *
 * @author 422UR4H
 */
public class Consumidor implements Runnable{
    private List<Character> stack;
    private Ponte ponte;
    
    // construtor
    public Consumidor(List<Character> stack, Ponte ponte) {
        this.stack = stack;
        this.ponte = ponte;
    }
    
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                ponte.remove(stack, 0);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
