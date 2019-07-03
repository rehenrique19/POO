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
 * @author 422UR4H
 */
public class Ex_8 {
    private static void carregarCaracteres(List<Character> caracteres) {
        caracteres.add('a');
        caracteres.add('b');
        caracteres.add('c');
        caracteres.add('d');
        caracteres.add('e');
        caracteres.add('f');
        caracteres.add('g');
        caracteres.add('h');
        caracteres.add('i');
        caracteres.add('j');
        caracteres.add('k');
        caracteres.add('l');
        caracteres.add('m');
        caracteres.add('n');
        caracteres.add('o');
        caracteres.add('p');
        caracteres.add('q');
        caracteres.add('r');
        caracteres.add('s');
        caracteres.add('t');
        caracteres.add('u');
        caracteres.add('v');
        caracteres.add('w');
        caracteres.add('x');
        caracteres.add('y');
        caracteres.add('z');
    }
    
    
    public static void main(String args[]) throws InterruptedException {
        List<Character> stack = new ArrayList<>();
        List<Character> caracteres = new ArrayList<>();
        Ponte ponte = new Ponte();
        
        // carregando caracteres
        carregarCaracteres(caracteres);
        
        Thread produtor = new Thread(new Produtor(stack, caracteres, ponte));
        Thread consumidor = new Thread(new Consumidor(stack, ponte));
        Thread testeThread = new Thread(new TesteThread());
        
        produtor.start();
        consumidor.start();
        
        
        // enquanto as threads estiverem vivas, o programa espera...
//        while(produtor.isAlive() || consumidor.isAlive()) {
//            Thread.sleep(100);
//        }
        
        // maneira melhor de fazer isso
        produtor.join();
        consumidor.join();
        testeThread.start();
        
        System.out.println("Programa finalizado");
    }
}
