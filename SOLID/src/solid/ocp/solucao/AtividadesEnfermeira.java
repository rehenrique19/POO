/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.ocp.solucao;

/**
 *
 * @author 
 */
public class AtividadesEnfermeira implements Atividades {
    @Override
    public void chamarEmpregado(Empregado e) {
        checarSinaisVitais();
        coletarSangue();
        higienizarPaciente();
    }
    
    
    private void checarSinaisVitais() {
        System.out.println("Sinais checados");
    }
    
    private void coletarSangue() {
        System.out.println("Sangue coletado");
    }
    
    private void higienizarPaciente() {
        System.out.println("Paciente higienizado");
    }
}
