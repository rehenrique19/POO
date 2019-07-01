/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.ocp.violacao;

/**
 *
 * @author 
 */
public class Atividades {
    public void chamarEmpregado(Empregado e) {
        if (e.getClass() == Enfermeira.class && e.isTrabalhando()) {
            checarSinaisVitais();
            coletarSangue();
            higienizarPaciente();
        }
        if (e.getClass() == Medico.class && e.isTrabalhando()) {
            prescreverMedicamento();
            fornecerDiagnotico();
        }
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
    
    private void prescreverMedicamento() {
        System.out.println("Medicamento prescrito");
    }
    
    public void fornecerDiagnotico() {
        System.out.println("Diagnostico fornecido");
    }
}
