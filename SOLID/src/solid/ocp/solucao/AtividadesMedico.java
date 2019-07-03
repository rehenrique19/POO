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
public class AtividadesMedico implements Atividades {
    @Override
    public void chamarEmpregado(Empregado e) {
        prescreverMedicamento();
        fornecerDiagnotico();
    }

    
    private void prescreverMedicamento() {
        System.out.println("Medicamento prescrito");
    }
    
    public void fornecerDiagnotico() {
        System.out.println("Diagnostico fornecido");
    }
}
