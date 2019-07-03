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
public class ControleRemoto {
    public void aumentarVolume(Televisao tv) {
        int volume = tv.getVolume();
        
        if (volume >= 100) {
            return;
        }
        
        tv.setVolume(++volume);
    }
    
    public void diminuirVolume(Televisao tv) {
        int volume = tv.getVolume();
        
        if (volume <= 0) {
            return;
        }
        
        tv.setVolume(--volume);
    }
    
    public void trocarCanal(Televisao tv, int canal) {
        tv.setCanalAtual(canal);
    }
    
    public void consultar(Televisao tv) {
        System.out.println("Canal: " + tv.getCanalAtual() + "\n");
        System.out.println("Volume: " + tv.getVolume() + "\n");
    }
}
