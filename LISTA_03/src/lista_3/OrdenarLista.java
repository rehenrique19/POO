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
public class OrdenarLista {
    public static void main(String args[]) {
        List<Long> lista = new ArrayList<>();
        List<Long> listaOrdenada = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            lista.add(i, (long) (Math.random() * 100));
        }
        
        for (int i = 0; i < lista.size(); i++) {
            long menor = lista.get(i);
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(j) < menor) {
                    menor = lista.get(j);
                    long temp = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, temp);
                }
            }
            listaOrdenada.add(menor);
        }

        for (long i: listaOrdenada) {
            System.out.println(i);
        }

        System.out.println("lista_3.OrdenarLista.main()");
        
        for (long i: lista) {
            System.out.println(i);
        }
    }
}
