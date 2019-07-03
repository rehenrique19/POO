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
public class Ponte {
    public synchronized void remove(List<Character> stack, int i) throws InterruptedException {
        while (stack.isEmpty()) {
            System.out.println("Remove Waiting...");
            wait();
        }
        System.out.println("remover: " + stack.get(i));
        stack.remove(i);
        notify();
    }
    
    public synchronized void add(List<Character> caracteres, List<Character> stack, int i) throws InterruptedException {
        while (stack.size() >= 10) {
            System.out.println("Add Waiting...");
            wait();
        }
        stack.add(caracteres.get(i));
        System.out.println(caracteres.get(i));
        notify();
    }
}
