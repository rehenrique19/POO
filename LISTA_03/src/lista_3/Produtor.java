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
public class Produtor implements Runnable {
    private List<Character> stack;
    private List<Character> caracteres;
    private Ponte ponte;
    
    // construtor
    public Produtor(List<Character> stack, List<Character> caracteres, Ponte ponte) {
        this.stack = stack;
        this.caracteres = caracteres;
        this.ponte = ponte;
        // startando dentro do proprio construtor
//        Thread t = new Thread(this);
//        t.start();
    }
    
    
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                ponte.add(caracteres, stack, i);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
