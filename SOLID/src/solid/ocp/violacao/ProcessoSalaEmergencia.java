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
public class ProcessoSalaEmergencia {
    public static void main(String args[]) {
        Empregado enfermeira = new Enfermeira(1, "Rosana", "Enfermagem", true);
        Empregado medico = new Medico(2, "Claudio", "Cirurgia", true);
        Atividades a = new Atividades();
        
        a.chamarEmpregado(enfermeira);
        a.chamarEmpregado(medico);
    }
}
